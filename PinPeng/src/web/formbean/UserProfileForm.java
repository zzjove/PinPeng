package web.formbean;

import java.util.HashMap;
import java.util.Map;

//��¼����Ϣ
public class UserProfileForm {

	private String password;
	private String customer;
	private String checkcode;
	private String randomNum;
	private Map errors = new HashMap();

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public String getRandomNum() {
		return randomNum;
	}

	public void setRandomNum(String randomNum) {
		this.randomNum = randomNum;
	}

	public Map getErrors() {
		return errors;
	}

	public void setErrors(Map errors) {
		this.errors = errors;
	}

	// У����Ƿ�Ϸ�
	public boolean vaild() {
		boolean isOK = true;

		if (this.customer == null || this.customer.trim().equals("")) {
			isOK = false;
			errors.put("username", "�û�������Ϊ��");
		} else {
			if (!this.customer.matches("[0-9]{6,6}")) {
				isOK = false;
				errors.put("username", "�û���ӦΪ6λ����");
			}
		}

		if (this.password == null || this.password.trim().equals("")) {
			isOK = false;
			errors.put("password", "���벻��Ϊ��");
		} else {
			if (!this.password.matches("[a-z[A-Z[0-9]]]{6,}")) {
				isOK = false;
				errors.put("password", "��������Ϊ6λ");
			}
		}

		if (this.checkcode == null || this.checkcode.trim().equals("")) {
			isOK = false;
			errors.put("checkcode", "��֤�벻��Ϊ��");
		} else {
			if (!this.checkcode.equals(this.randomNum)) {
				isOK = false;
				errors.put("checkcode", "��֤����������");
			}

		}
		return isOK;
	}

}
