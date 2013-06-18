package web.action.control;

import java.util.Iterator;

import service.MyorderService;
import service.MyrequestService;
import service.RestrictionService;
import utils.CalculateConverter;

import com.opensymphony.xwork2.ActionSupport;

import domain.Myorder;
import domain.Myrequest;
import domain.Restriction;

public class PinDanAction extends ActionSupport {

	int requestid;
	int orderid;

	public int getRequestid() {
		return requestid;
	}

	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		MyrequestService myrequestService = new MyrequestService();
		MyorderService myorderService = new MyorderService();
		RestrictionService restrictionService = new RestrictionService();

		Myrequest myrequest = myrequestService
				.getRequest_by_requestid(requestid);// 我的request
		Myorder otherOrder = myorderService.get(orderid); // 我要进行拼单的他人的order
		Myorder myorder = new Myorder();// 我这个request最开始对应的order

		Iterator<Myorder> it = myrequest.getMyorders().iterator();
		if (it.hasNext()) {
			myorder = (Myorder) it.next();
			myorder.setStatus(0);// 将初始的order的状态置为0
			myrequest.getMyorders().clear();// 清空我的request
			myrequestService.update(myrequest);// 将我发布的这个request和对应的这个order从
												// order_request关系表中删除

		}

		Restriction otherRestriction = restrictionService
				.get_by_orderid(orderid);// 找到otherOrder对应的restriction
		Restriction myRestriction = restrictionService
				.get_by_requestid(requestid);// 找到我的request对应的restriction
		CalculateConverter.plus_restriction(myRestriction, otherRestriction);// 将restriction进行加权
		restrictionService.update(otherRestriction);// 更新数据库


		otherOrder.setNumberPeople(otherOrder.getNumberPeople() + 1);//将otherOrder的人数+1
		myorderService.update(myorder);//更新数据库
		
		myrequest.getMyorders().add(otherOrder);
		myrequestService.update(myrequest);// 将我的request加入到这个order中

		//发！！！！！！！！
		//消！！！！！！！！
		//息！！！！！！！！
		
		return "success";
	}
}
