package service;

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

	public static String convert_yes_no(int juege) {
		if (juege == 1)
			return "是";
		if (juege == 0)
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

	public static String conver_sex(int sex) {
		if (sex == 0)
			return "都可";
		if (sex == 1)
			return "男";
		if (sex == 2)
			return "女";
		return null;
	}
}
