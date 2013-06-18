package service;

import dao.RestrictionDao;
import domain.Restriction;

public class RestrictionService {

	private RestrictionDao restrictionDao = new RestrictionDao();

	public Restriction get_by_restrictionid(int restrictionid) {
		return restrictionDao.findby_restrictionid(restrictionid);
	}

	public Restriction get_by_requestid(int requestid) {
		return restrictionDao.findby_requestid(requestid);
	}

	public Restriction get_by_orderid(int orderid) {
		return restrictionDao.findby_orderid(orderid);
	}

	public void update(Restriction restriction) {
		restrictionDao.modify_restriction(restriction);
	}

}
