package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import domain.ShoppingType;

public class DataConverter {

	public static String convert_shoppingstore(int shoppingstore) {

		switch (shoppingstore) {
		case 1:
			return "1�ŵ�";
		case 2:
			return "��è����";
		case 3:
			return "�Ա�";
		case 4:
			return "����";
		case 5:
			return "׿Խ/����ѷ";
		case 6:
			return "����";
		case 7:
			return "��Ѹ";
		default:
			return null;
		}

	}

	public static String convert_yes_no(int judge) {
		if (judge == 1)
			return "��";
		if (judge == 0)
			return "��";
		return null;
	}

	public static String convert_me_other(int person) {
		if (person == 0)
			return "����";
		if (person == 1)
			return "������";
		if (person == 2)
			return "��";
		return null;
	}

	public static String convert_sex(int sex) {
		if (sex == 0)
			return "����";
		if (sex == 1)
			return "��";
		if (sex == 2)
			return "Ů";
		return null;
	}

	public static String convert_discountinfo(ShoppingType shoppingtype) {
		switch (shoppingtype.getShoppingTypeid()) {
		case 1:
			return "��" + shoppingtype.getAmountTo() + "Ԫ��"
					+ shoppingtype.getDiscountDown() + "Ԫ";
		case 2:
			return "��" + shoppingtype.getAmountTo() + "Ԫ"
					+ shoppingtype.getDiscountRate() * 10 + "��";
		case 3:
			return "��" + shoppingtype.getQuantityTo() + "����"
					+ shoppingtype.getDiscountDown() + "Ԫ";
		case 4:
			return "��" + shoppingtype.getQuantityTo() + "��"
					+ shoppingtype.getDiscountRate() * 10 + "Ԫ";
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
			return "δ����";
		case 0:
			return "�ѹ���";
		default:
			return null;
		}
	}

	public static String convert_order_status(int status) {

		switch (status) {
		case 0:
			return "��ɱ����TOT";
		case 1:
			return "�ȴ�����ƴ��";
		case 2:
			return "��������ϵ��";
		case 3:
			return "���ڲɹ�";
		case 4:
			return "�����";
		case 5:
			return "������";
		default:
			return null;
		}
	}
}
