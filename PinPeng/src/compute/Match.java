package compute;

import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class Match {

	private int value;
	private Myrequest myrequest;
	private ShoppingType shoppingtype;
	private Restriction restriction;

	public Match(int value, Myrequest myrequest, ShoppingType shoppingtype,
			Restriction restriction) {
		this.value = value;
		this.myrequest = myrequest;
		this.shoppingtype = shoppingtype;
		this.restriction = restriction;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Myrequest getMyrequest() {
		return myrequest;
	}

	public void setMyrequest(Myrequest myrequest) {
		this.myrequest = myrequest;
	}

	public ShoppingType getShoppingType() {
		return shoppingtype;
	}

	public void setShoppingType(ShoppingType shoppingType) {
		this.shoppingtype = shoppingType;
	}

	public Restriction getRestriction() {
		return restriction;
	}

	public void setRestriction(Restriction restriction) {
		this.restriction = restriction;
	}

}
