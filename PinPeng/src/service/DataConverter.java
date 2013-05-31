package service;

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

	public static String convert_yes_no(int juege) {
		if (juege == 1)
			return "��";
		if (juege == 0)
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

	public static String conver_sex(int sex) {
		if (sex == 0)
			return "����";
		if (sex == 1)
			return "��";
		if (sex == 2)
			return "Ů";
		return null;
	}
}
