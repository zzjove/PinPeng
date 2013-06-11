package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import domain.ShoppingType;

public class DataConverter {

	public static String convert_shoppingstore(int shoppingstore) {

		switch (shoppingstore) {
		case 1:
			return "1号店";
		case 2:
			return "天猫超市";
		case 3:
			return "淘宝";
		case 4:
			return "当当";
		case 5:
			return "卓越/亚马逊";
		case 6:
			return "京东";
		case 7:
			return "易迅";
		default:
			return null;
		}

	}

	public static String convert_yes_no(int judge) {
		if (judge == 1)
			return "是";
		if (judge == 0)
			return "否";
		return null;
	}

	public static String convert_me_other(int person) {
		if (person == 0)
			return "都可";
		if (person == 1)
			return "其他人";
		if (person == 2)
			return "我";
		return null;
	}

	public static String convert_sex(int sex) {
		if (sex == 0)
			return "都可";
		if (sex == 1)
			return "男";
		if (sex == 2)
			return "女";
		return null;
	}

	public static String convert_discountinfo(ShoppingType shoppingtype) {
		switch (shoppingtype.getShoppingTypeid()) {
		case 1:
			return "满" + shoppingtype.getAmountTo() + "元减"
					+ shoppingtype.getDiscountDown() + "元";
		case 2:
			return "满" + shoppingtype.getAmountTo() + "元"
					+ shoppingtype.getDiscountRate() * 10 + "折";
		case 3:
			return "满" + shoppingtype.getQuantityTo() + "件减"
					+ shoppingtype.getDiscountDown() + "元";
		case 4:
			return "满" + shoppingtype.getQuantityTo() + "件"
					+ shoppingtype.getDiscountRate() * 10 + "元";
		default:
			return null;
		}
	}

	public static String convert_date_time(Date date) {

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sf.format(date);
	}

	public static String convert_date_day(Date date) {

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		return sf.format(date);
	}

	public static String convert_request_status(int status) {
		switch (status) {
		case 1:
			return "未过期";
		case 0:
			return "已过期";
		default:
			return null;
		}
	}

	public static String convert_order_status(int status) {

		switch (status) {
		case 0:
			return "扼杀腹中TOT";
		case 1:
			return "等待他人拼单";
		case 2:
			return "与他人联系中";
		case 3:
			return "正在采购";
		case 4:
			return "已完成";
		case 5:
			return "已评价";
		default:
			return null;
		}
	}
}
