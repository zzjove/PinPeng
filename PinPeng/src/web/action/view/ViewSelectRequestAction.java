package web.action.view;

import java.util.ArrayList;
import java.util.List;

import service.MyrequestService;
import service.ShoppingTypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;
import domain.Myrequest;
import domain.ShoppingType;

public class ViewSelectRequestAction extends ActionSupport {

	private int shop;
	public int getShop() {
		return shop;
	}

	public void setShop(int shop) {
		this.shop = shop;
	}

	@Override
	public String execute() throws Exception {
		List sortedRequests = new ArrayList();
		ShoppingTypeService shoppingTypeService = new ShoppingTypeService();
		if(shop < 1 || shop > 7 ){
			ActionContext.getContext().put("systemMsg", "�벻Ҫ����۸�URL");
			return "error";
		}
		if(shop >= 1 && shop <= 7){
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");
		MyrequestService service = new MyrequestService();
		List requests = service.getRequests(customer.getCustomerid());
		for(int i = 0;i < requests.size();i ++ ){
			Myrequest temp = (Myrequest)requests.get(i);
			ShoppingType stemp = shoppingTypeService.getShoppingType(temp.getRequestid());
			if(shop == stemp.getShoppingStore())
				sortedRequests.add(temp);
		}
		String shopName = "";
		switch (shop) {
		case 1:
			shopName = "1�ŵ�";
			break;
		case 2:
			shopName = "��è����";
			break;
		case 3:
			shopName = "�Ա�";
			break;
		case 4:
			shopName = "����";
			break;
		case 5:
			shopName = "׿Խ/����ѷ";
			break;
		case 6:
			shopName = "����";
			break;
		case 7:
			shopName = "��Ѹ";
			break;
		default:
			break;
		}
		ActionContext.getContext().put("shopName", shopName);
		int size = sortedRequests.size();
		ActionContext.getContext().put("size", size);
		ActionContext.getContext().put("requests", sortedRequests);
		return "success";
		}
		else{
			ActionContext.getContext().put("systemMsg", "�����ҳ�����");
			return "error";
		}
	}
}
