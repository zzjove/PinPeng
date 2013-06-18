package web.formbean;

import java.util.HashMap;
import java.util.Map;

//�û�profile��
public class UserProfileForm {

	private String email;
	private String qqNumber;
	private String telNumber;
	private String dormitory;
	private Map errors = new HashMap();


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getQqNumber() {
		return qqNumber;
	}


	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}


	public String getTelNumber() {
		return telNumber;
	}


	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}


	public String getDormitory() {
		return dormitory;
	}


	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
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

		if (this.qqNumber == null || this.qqNumber.trim().equals("")) {
			isOK = false;
			errors.put("qqNumber", "QQ�Ų���Ϊ��");
		} 
		if (this.telNumber == null || this.telNumber.trim().equals("")) {
			isOK = false;
			errors.put("telNumber", "�绰����Ϊ��");
		}
		if (this.dormitory == null || this.dormitory.trim().equals("")) {
			isOK = false;
			errors.put("dormitory", "���ҺŲ���Ϊ��");
		}else {
			if (!this.dormitory.matches("[0-9]{3,3}")) {
				isOK = false;
				errors.put("dormitory", "���Һ�ӦΪ3λ����");
			}
		}
		if (this.email == null || this.email.trim().equals("")) {
			isOK = false;
			errors.put("email", "���䲻��Ϊ��");
		}else{
			if(!this.email.matches("\\w+@\\w+(\\.\\w+)+")){
				isOK = false;
				errors.put("email", "�����ʽ����");
			}
		}
		return isOK;
	}

}
