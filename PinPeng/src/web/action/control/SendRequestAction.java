package web.action.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import web.formbean.SendRequestForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import compute.ComparatorMatch;
import compute.Match;

import domain.Customer;
import domain.Myrequest;
import domain.Order;
import domain.Restriction;
import domain.ShoppingType;

public class SendRequestAction extends ActionSupport {

	private Myrequest myrequest;
	private ShoppingType shoppingtype;
	private Restriction restriction;
	private Customer customer;

	private void get_form_and_saveit() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		SendRequestForm form = utils.WebUtils.requestToBean(request,
				SendRequestForm.class);

		// Customer
		// customer=(Customer)ActionContext.getContext().getSession().get("customer");

		myrequest = form.get_myrequest(); // 得到myrequest并且保存
		myrequest.setRequestid(dao.MyrequestDao.find_max_requestid() + 1);
		dao.MyrequestDao.add_myrequest(myrequest);

		shoppingtype = form.get_shoppingtype(myrequest); // 得到shoppingtype并且保存
		dao.ShoppingTypeDao.add_shoppingtype(shoppingtype);

		restriction = form.get_restriction(myrequest); // 得到restriction并且保存
		dao.RestrictionDao.add_restriction(restriction);

		Order order = form.get_order(myrequest); // 产生新的一个order
	}

	private void set_to_session() {

		ActionContext.getContext().getSession().put("myrequest", myrequest); // 全部放入session
		ActionContext.getContext().getSession()
				.put("shoppingtype", shoppingtype);
		ActionContext.getContext().getSession().put("restriction", restriction);

		// 将store转换成字符串后放入session
		ActionContext
				.getContext()
				.getSession()
				.put("store",
						compute.DataConverter
								.convert_shoppingstore(shoppingtype
										.getShoppingStore()));

		// 将是否限定寝室转换成字符串后放入session
		ActionContext
				.getContext()
				.getSession()
				.put("dormlimited",
						compute.DataConverter.convert_yes_no(restriction
								.getDormLimited()));

		// 将是否限定付款人转换成字符串后放入session
		ActionContext
				.getContext()
				.getSession()
				.put("payer",
						compute.DataConverter.convert_me_other(restriction
								.getPayer()));

		// 将是否限定取件人转换成字符串后放入session
		ActionContext
				.getContext()
				.getSession()
				.put("othertakelimited",
						compute.DataConverter.convert_me_other(restriction
								.getOthertakeLimited()));

		// 将是否要礼物转换成字符串后放入session
		ActionContext
				.getContext()
				.getSession()
				.put("goodsfree",
						compute.DataConverter.convert_me_other(restriction
								.getGoodsFree()));

		// 将性别转换成字符串后放入session
		ActionContext
				.getContext()
				.getSession()
				.put("manlimited",
						compute.DataConverter.convert_me_other(restriction
								.getManLimited()));

		// 将是否限购转换成字符串后放入session
		ActionContext
				.getContext()
				.getSession()
				.put("buylimited",
						compute.DataConverter.convert_yes_no(restriction
								.getBuyLimited()));
	}

	private void get_match_list() {
		// customer = (Customer) ActionContext.getContext().getSession()
		// .get("customer");
		List<Myrequest> myrequest_list = dao.MyrequestDao.find_valid_request();
		//List<ShoppingType> shoppingtype_list = new ArrayList<ShoppingType>();
		//List<Restriction> restriction_list = new ArrayList<Restriction>();
		// List<Integer> match_list = new ArrayList<Integer>();
		List<Match> match_list = new ArrayList<Match>();

		Iterator<Myrequest> it = myrequest_list.iterator();
		while (it.hasNext()) {

			// Match match=new Match();

			Myrequest temp_myrequest = (Myrequest) it.next();
			ShoppingType temp_shoppingtype = dao.ShoppingTypeDao
					.findby_requestid(temp_myrequest.getRequestid());
			Restriction temp_restriction = dao.RestrictionDao
					.findby_requestid(temp_myrequest.getRequestid());

			int value = compute.CalculateConverter.get_match_value(myrequest,
					temp_myrequest, shoppingtype, temp_shoppingtype,
					restriction, temp_restriction);

			Match match = new Match(value, temp_myrequest, temp_shoppingtype,
					temp_restriction);
			match_list.add(match);
			//shoppingtype_list.add(temp_shoppingtype);
			//restriction_list.add(temp_restriction);

		}
		
		Collections.sort(match_list, new ComparatorMatch());

	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		get_form_and_saveit();
		set_to_session();
		get_match_list();

		return "success";
	}

}
