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
				.getRequest_by_requestid(requestid);// �ҵ�request
		Myorder otherOrder = myorderService.get(orderid); // ��Ҫ����ƴ�������˵�order
		Myorder myorder = new Myorder();// �����request�ʼ��Ӧ��order

		Iterator<Myorder> it = myrequest.getMyorders().iterator();
		if (it.hasNext()) {
			myorder = (Myorder) it.next();
			myorder.setStatus(0);// ����ʼ��order��״̬��Ϊ0
			myrequest.getMyorders().clear();// ����ҵ�request
			myrequestService.update(myrequest);// ���ҷ��������request�Ͷ�Ӧ�����order��
												// order_request��ϵ����ɾ��

		}

		Restriction otherRestriction = restrictionService
				.get_by_orderid(orderid);// �ҵ�otherOrder��Ӧ��restriction
		Restriction myRestriction = restrictionService
				.get_by_requestid(requestid);// �ҵ��ҵ�request��Ӧ��restriction
		CalculateConverter.plus_restriction(myRestriction, otherRestriction);// ��restriction���м�Ȩ
		restrictionService.update(otherRestriction);// �������ݿ�


		otherOrder.setNumberPeople(otherOrder.getNumberPeople() + 1);//��otherOrder������+1
		myorderService.update(myorder);//�������ݿ�
		
		myrequest.getMyorders().add(otherOrder);
		myrequestService.update(myrequest);// ���ҵ�request���뵽���order��

		//������������������
		//������������������
		//Ϣ����������������
		
		return "success";
	}
}
