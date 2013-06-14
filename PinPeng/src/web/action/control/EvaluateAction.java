package web.action.control;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import web.formbean.EvaluateForm;
import web.formbean.LoginForm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Evaluation;

public class EvaluateAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		customer = dao.CustomerDao.findby_customerid(2);
		Customer toBeRecorded = dao.CustomerDao.findby_customerid(17);

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		EvaluateForm form = utils.WebUtils.requestToBean(request,
				EvaluateForm.class);

		Evaluation evaluation = new Evaluation(customer, toBeRecorded,
				form.getAssess(), new Date());
		dao.EvaluationDao.add_evaluation(evaluation);// Ìí¼Óevaluation¼ÇÂ¼
		toBeRecorded.setCredit(toBeRecorded.getCredit() + form.getAssess());
		dao.CustomerDao.mofidy_customer(toBeRecorded);

		return "success";
	}
}
