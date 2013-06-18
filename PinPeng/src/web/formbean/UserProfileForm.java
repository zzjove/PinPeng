package web.formbean;

import java.util.HashMap;
import java.util.Map;

//用户profile表单
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


	// 校验表单是否合法
	public boolean vaild() {
		boolean isOK = true;

		if (this.qqNumber == null || this.qqNumber.trim().equals("")) {
			isOK = false;
			errors.put("qqNumber", "QQ号不能为空");
		} 
		if (this.telNumber == null || this.telNumber.trim().equals("")) {
			isOK = false;
			errors.put("telNumber", "电话不能为空");
		}
		if (this.dormitory == null || this.dormitory.trim().equals("")) {
			isOK = false;
			errors.put("dormitory", "寝室号不能为空");
		}else {
			if (!this.dormitory.matches("[0-9]{3,3}")) {
				isOK = false;
				errors.put("dormitory", "寝室号应为3位数字");
			}
		}
		if (this.email == null || this.email.trim().equals("")) {
			isOK = false;
			errors.put("email", "邮箱不能为空");
		}else{
			if(!this.email.matches("\\w+@\\w+(\\.\\w+)+")){
				isOK = false;
				errors.put("email", "邮箱格式有误");
			}
		}
		return isOK;
	}

}
