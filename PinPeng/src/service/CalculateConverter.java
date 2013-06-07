package service;

import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class CalculateConverter {

	// private int match_value(int master,int servant){
	// if (servant==0)
	// return ;
	// }

	public static int get_match_value(Myrequest myrequest,
			Myrequest temp_myrequest, ShoppingType shoppingtype,
			ShoppingType temp_shoppingtype, Restriction restriction,
			Restriction temp_restriction) {

		if ((int) shoppingtype.getDiscountType() != (int) temp_shoppingtype
				.getDiscountType()
				|| (int) shoppingtype.getShoppingStore() != (int) temp_shoppingtype
						.getShoppingStore()
				|| shoppingtype.getAmountTo() > myrequest.getPrice()
						+ temp_myrequest.getPrice()) {
			return -1;
		} else {
			int result = 0;

			if (temp_restriction.getPayer() == 0
					|| temp_restriction.getPayer() == restriction.getPayer()) {
				result = result + service.ConstantValue.PAYER_VALUE;
			}

			if (temp_restriction.getDormLimited() == 0
					|| temp_restriction.getDormLimited() == restriction
							.getDormLimited()) {
				result = result + service.ConstantValue.DORM_VALUE;
			}

			if (temp_restriction.getOthertakeLimited() == 0
					|| temp_restriction.getOthertakeLimited() == restriction
							.getOthertakeLimited()) {
				result = result + service.ConstantValue.OTHERTAKE_VALUE;
			}

			if (temp_restriction.getManLimited() == 0
					|| temp_restriction.getManLimited() == restriction
							.getManLimited()) {
				result = result + service.ConstantValue.MAN_VALUE;
			}

			if (temp_restriction.getBuyLimited() == 0
					|| temp_restriction.getBuyLimited() == restriction
							.getBuyLimited()) {
				result = result + service.ConstantValue.BUY_VALUE;
			}

			if (temp_restriction.getGoodsFree() == 0
					|| temp_restriction.getGoodsFree() == restriction
							.getGoodsFree()) {
				result = result + service.ConstantValue.GOODSFREE_VALUE;
			}
			///
			return result;
		}

	}
}
