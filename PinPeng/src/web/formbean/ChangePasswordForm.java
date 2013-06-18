package web.formbean;

import java.util.HashMap;
import java.util.Map;

public class ChangePasswordForm {

	private String oldpassword;
	private String newpassword1;
	private String newpassword2;
	public String getOldpassword() {
		return oldpassword;
	}



	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}



	public String getNewpassword1() {
		return newpassword1;
	}



	public void setNewpassword1(String newpassword1) {
		this.newpassword1 = newpassword1;
	}



	public String getNewpassword2() {
		return newpassword2;
	}



	public void setNewpassword2(String newpassword2) {
		this.newpassword2 = newpassword2;
	}



	public Map getErrors() {
		return errors;
	}



	public void setErrors(Map errors) {
		this.errors = errors;
	}



	private Map errors = new HashMap();



	// У����Ƿ�Ϸ�
	public boolean vaild() {
		boolean isOK = true;
		if (this.oldpassword == null || this.oldpassword.trim().equals("")) {
			isOK = false;
			errors.put("oldpassword", "ԭ���벻��Ϊ��");
		} else {
			if (!this.oldpassword.matches("[a-z[A-Z[0-9]]]{6,}")) {
				isOK = false;
				errors.put("oldpassword", "ԭ��������Ϊ6λ");
			}
		}
		if (this.newpassword1 == null || this.newpassword1.trim().equals("")) {
			isOK = false;
			errors.put("newpassword1", "�����벻��Ϊ��");
		} else {
			if (!this.newpassword1.matches("[a-z[A-Z[0-9]]]{6,}")) {
				isOK = false;
				errors.put("newpassword1", "����������Ϊ6λ");
			}

		}
		if (this.newpassword2 == null || this.newpassword2.trim().equals("")) {
			isOK = false;
			errors.put("newpassword2", "ȷ�����벻��Ϊ��");
		} else {
			if (!this.newpassword2.matches("[a-z[A-Z[0-9]]]{6,}")) {
				isOK = false;
				errors.put("newpassword2", "ȷ����������Ϊ6λ");
			}
			if (!this.newpassword2.equals(this.newpassword1)) {
				isOK = false;
				errors.put("newpassword2", "ȷ��������ԭ���벻��ͬ");
			}
		}
		return isOK;
	}

}
