package web.formbean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.Customer;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class SendRequestForm {

	String shoppingstore;
	String subshoppingstore;
	String discounttype;
	String price;
	// 新加的
	String moneyAmountNeed;

	public String getMoneyAmountNeed() {
		return moneyAmountNeed;
	}

	public void setMoneyAmountNeed(String moneyAmountNeed) {
		this.moneyAmountNeed = moneyAmountNeed;
	}

	String itemstype;

	public String getItemstype() {
		return itemstype;
	}

	public void setItemstype(String itemstype) {
		this.itemstype = itemstype;
	}

	//
	String amount;
	String weight;
	String endday;
	String maxpeople;
	String dormlimited;
	String payer;
	String othertakelimited;
	String goodsfree;
	String manlimited;
	String notice;
	String buylimited;
	private Map errors = new HashMap();

	// 校验表单是否合法
	public boolean vaild() {
		boolean isOK = true;

		if (this.price == null || this.price.trim().equals("")) {
			isOK = false;
			errors.put("price", "已消费 金额不能为空");
		}
		if (this.moneyAmountNeed == null
				|| this.moneyAmountNeed.trim().equals("")) {
			isOK = false;
			errors.put("moneyAmountNeed", "优惠需要金额不能为空");
		}
		if (this.amount == null || this.amount.trim().equals("")) {
			isOK = false;
			errors.put("amount", "购买件数不能为空");
		}
		if (this.weight == null || this.weight.trim().equals("")) {
			isOK = false;
			errors.put("weight", "物品重量不能为空");
		}
		if (this.endday == null || this.endday.trim().equals("")) {
			isOK = false;
			errors.put("endday", "结束日期不能为空");
		}
		if (this.maxpeople == null || this.maxpeople.trim().equals("")) {
			isOK = false;
			errors.put("maxpeople", "拼单人数不能为空");
		}
		return isOK;
	}

	public String getBuylimited() {
		return buylimited;
	}

	public void setBuylimited(String buylimited) {
		this.buylimited = buylimited;
	}

	public String getShoppingstore() {
		return shoppingstore;
	}

	public void setShoppingstore(String shoppingstore) {
		this.shoppingstore = shoppingstore;
	}

	public String getSubshoppingstore() {
		return subshoppingstore;
	}

	public void setSubshoppingstore(String subshoppingstore) {
		this.subshoppingstore = subshoppingstore;
	}

	public String getDiscounttype() {
		return discounttype;
	}

	public void setDiscounttype(String discounttype) {
		this.discounttype = discounttype;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getEndday() {
		return endday;
	}

	public void setEndday(String endday) {
		this.endday = endday;
	}

	public String getMaxpeople() {
		return maxpeople;
	}

	public void setMaxpeople(String maxpeople) {
		this.maxpeople = maxpeople;
	}

	public String getDormlimited() {
		return dormlimited;
	}

	public void setDormlimited(String dormlimited) {
		this.dormlimited = dormlimited;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getOthertakelimited() {
		return othertakelimited;
	}

	public void setOthertakelimited(String othertakelimited) {
		this.othertakelimited = othertakelimited;
	}

	public String getGoodsfree() {
		return goodsfree;
	}

	public void setGoodsfree(String goodsfree) {
		this.goodsfree = goodsfree;
	}

	public String getManlimited() {
		return manlimited;
	}

	public void setManlimited(String manlimited) {
		this.manlimited = manlimited;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Map getErrors() {
		return errors;
	}

	public void setErrors(Map errors) {
		this.errors = errors;
	}

	public Myrequest get_myrequest() {

		Myrequest myrequest = new Myrequest();
		Customer customer = (Customer) ActionContext.getContext().getSession()
				.get("customer");

		myrequest.setMyrequestTime(new Date());
		myrequest.setCustomer(customer);
		myrequest.setPrice((double) Integer.parseInt(price));
		myrequest.setStatus(1);
		myrequest.setAmount(Integer.parseInt(amount));
		myrequest.setWeight(Integer.parseInt(weight));

		return myrequest;
	}

	public Restriction get_restriction(Myrequest myrequest) {

		Restriction restriction = new Restriction();

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date tempdate = new Date();
		try {
			tempdate = sf.parse(endday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		restriction.setRequestid(myrequest.getRequestid());
		restriction.setMaxPeople(Integer.parseInt(maxpeople));
		restriction.setEndDay(tempdate);
		restriction.setPayer(Integer.parseInt(payer));
		restriction.setDormLimited(Integer.parseInt(dormlimited));
		restriction.setOthertakeLimited(Integer.parseInt(othertakelimited));
		restriction.setGoodsFree(Integer.parseInt(goodsfree));
		restriction.setManLimited(Integer.parseInt(manlimited));
		restriction.setBuyLimited(Integer.parseInt(buylimited));
		restriction.setNotice(notice);

		return restriction;
	}

	public ShoppingType get_shoppingtype(Myrequest myrequest) {

		ShoppingType shoppingtype = new ShoppingType();

		shoppingtype.setRequestid(myrequest.getRequestid());

		shoppingtype.setDiscountType(Integer.parseInt(discounttype));
		shoppingtype.setShoppingStore(Integer.parseInt(shoppingstore));
		shoppingtype.setSubShoppingStore(subshoppingstore);

		return shoppingtype;
	}
	// public Order get_order(Myrequest myrequest,Restriction restriction){
	//
	// Order order=new Order();
	//
	// order.setBeginTime(myrequest.getMyrequestTime());
	// order.setBuyLimited(buyLimited)
	//
	// order.setStatus(1);
	// order.setBeginTime(myrequest.getMyrequestTime());
	// order.setMaxPeople(1);
	// order.setDiscountMoney(0);
	// order.setPrice(myrequest.getPrice());
	//
	// return order;
	// }

}
