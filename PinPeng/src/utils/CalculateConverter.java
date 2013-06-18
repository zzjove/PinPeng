package utils;

import domain.Myorder;
import domain.Myrequest;
import domain.Restriction;
import domain.ShoppingType;

public class CalculateConverter {

	public static int get_match_value(Myorder myorder, Myorder temp_myorder,
			ShoppingType shoppingtype, ShoppingType temp_shoppingtype,
			Restriction restriction, Restriction temp_restriction) {

		if ((int) shoppingtype.getDiscountType() != (int) temp_shoppingtype
				.getDiscountType()) {
			return -1;
		}
		if ((int) shoppingtype.getShoppingStore() != (int) temp_shoppingtype
				.getShoppingStore()) {
			return -2;
		}
		if (shoppingtype.getAmountTo() > myorder.getPrice()
				+ temp_myorder.getPrice()) {
			return -3;
		} else {
			int result = 0;

			if (temp_restriction.getPayer() == 0
					|| temp_restriction.getPayer() == restriction.getPayer()) {
				result = result + utils.ConstantValue.PAYER_VALUE;
			}

			if (temp_restriction.getDormLimited() == 0
					|| temp_restriction.getDormLimited() == restriction
							.getDormLimited()) {
				result = result + utils.ConstantValue.DORM_VALUE;
			}

			if (temp_restriction.getOthertakeLimited() == 0
					|| temp_restriction.getOthertakeLimited() == restriction
							.getOthertakeLimited()) {
				result = result + utils.ConstantValue.OTHERTAKE_VALUE;
			}

			if (temp_restriction.getManLimited() == 0
					|| temp_restriction.getManLimited() == restriction
							.getManLimited()) {
				result = result + utils.ConstantValue.MAN_VALUE;
			}

			if (temp_restriction.getBuyLimited() == 0
					|| temp_restriction.getBuyLimited() == restriction
							.getBuyLimited()) {
				result = result + utils.ConstantValue.BUY_VALUE;
			}

			if (temp_restriction.getGoodsFree() == 0
					|| temp_restriction.getGoodsFree() == restriction
							.getGoodsFree()) {
				result = result + utils.ConstantValue.GOODSFREE_VALUE;
			}

			return result;
		}
	}

	public static int get_match_value(Myrequest myrequest,
			Myorder temp_myorder, ShoppingType shoppingtype,
			ShoppingType temp_shoppingtype, Restriction restriction,
			Restriction temp_restriction) {

		if ((int) shoppingtype.getDiscountType() != (int) temp_shoppingtype
				.getDiscountType()
				|| (int) shoppingtype.getShoppingStore() != (int) temp_shoppingtype
						.getShoppingStore()
				|| shoppingtype.getAmountTo() > myrequest.getPrice()
						+ temp_myorder.getPrice()) {
			return -1;
		} else {
			int result = 0;

			if (temp_restriction.getPayer() == 0
					|| temp_restriction.getPayer() == restriction.getPayer()) {
				result = result + utils.ConstantValue.PAYER_VALUE;
			}

			if (temp_restriction.getDormLimited() == 0
					|| temp_restriction.getDormLimited() == restriction
							.getDormLimited()) {
				result = result + utils.ConstantValue.DORM_VALUE;
			}

			if (temp_restriction.getOthertakeLimited() == 0
					|| temp_restriction.getOthertakeLimited() == restriction
							.getOthertakeLimited()) {
				result = result + utils.ConstantValue.OTHERTAKE_VALUE;
			}

			if (temp_restriction.getManLimited() == 0
					|| temp_restriction.getManLimited() == restriction
							.getManLimited()) {
				result = result + utils.ConstantValue.MAN_VALUE;
			}

			if (temp_restriction.getBuyLimited() == 0
					|| temp_restriction.getBuyLimited() == restriction
							.getBuyLimited()) {
				result = result + utils.ConstantValue.BUY_VALUE;
			}

			if (temp_restriction.getGoodsFree() == 0
					|| temp_restriction.getGoodsFree() == restriction
							.getGoodsFree()) {
				result = result + utils.ConstantValue.GOODSFREE_VALUE;
			}

			return result;
		}
	}

	public static void plus_restriction(Restriction new_Restriction,
			Restriction old_Restriction)// 新旧restriction进行相加
	{
		old_Restriction.setBuyLimited(old_Restriction.getBuyLimited()
				+ new_Restriction.getBuyLimited());
		old_Restriction.setDormLimited(old_Restriction.getDormLimited()
				+ new_Restriction.getDormLimited());
		old_Restriction.setGoodsFree(old_Restriction.getGoodsFree()
				+ new_Restriction.getGoodsFree());
		old_Restriction.setManLimited(old_Restriction.getManLimited()
				+ new_Restriction.getManLimited());
		// old_Restriction.setMaxPeople(maxPeople);
		old_Restriction.setOthertakeLimited(old_Restriction
				.getOthertakeLimited() + new_Restriction.getOthertakeLimited());
		old_Restriction.setPayer(old_Restriction.getPayer()
				+ new_Restriction.getPayer());
	}

}
