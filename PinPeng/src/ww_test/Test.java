package ww_test;

import hibernatesession.HibernateSessionFactory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import service.ComparatorMatch;
import service.Match;

import com.opensymphony.xwork2.ActionContext;

import dao.MyrequestDao;
import domain.Customer;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		Myrequest myrequest = dao.MyrequestDao.findby_requestid(33);
		ShoppingType shoppingtype = dao.ShoppingTypeDao.findby_requestid(33);
		Restriction restriction = dao.RestrictionDao.findby_requestid(33);

		List<Myrequest> myrequest_list = dao.MyrequestDao.find_valid_request();
		List<Match> match_list = new ArrayList<Match>();

		Iterator<Myrequest> it = myrequest_list.iterator();
		while (it.hasNext()) {

			Myrequest temp_myrequest = (Myrequest) it.next();
			ShoppingType temp_shoppingtype = dao.ShoppingTypeDao
					.findby_requestid(temp_myrequest.getRequestid());
			Restriction temp_restriction = dao.RestrictionDao
					.findby_requestid(temp_myrequest.getRequestid());
			Customer temp_customer = temp_myrequest.getCustomer();

			int value = service.CalculateConverter.get_match_value(myrequest,
					temp_myrequest, shoppingtype, temp_shoppingtype,
					restriction, temp_restriction);
			
			if (value != -1) {
				Match match = new Match(value, temp_myrequest,
						temp_shoppingtype, temp_restriction, temp_customer);
				match_list.add(match);
			}
		}

		Collections.sort(match_list, new ComparatorMatch());
		if (match_list.size() >= 5)
			match_list = match_list.subList(0, 5);

		List<Myrequest> new_myrequest_list = new ArrayList();
		List<ShoppingType> new_shoppingtype_list = new ArrayList();
		List<Restriction> new_restriction_list = new ArrayList();
		List<Customer> new_customer_list = new ArrayList();

		Iterator<Match> new_it = match_list.iterator();
		while (new_it.hasNext()) {

			Match match = (Match) new_it.next();
			new_myrequest_list.add(match.getMyrequest());
			new_shoppingtype_list.add(match.getShoppingType());
			new_restriction_list.add(match.getRestriction());
			new_customer_list.add(match.getCustomer());

		}

	}

}
