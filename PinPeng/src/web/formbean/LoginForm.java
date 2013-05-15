package web.formbean;

import java.util.HashMap;
import java.util.Map;

//登录表单信息
public class LoginForm {

	private String password;
	private String studentid;
	private String checkcode;
	private String randomNum;
	private Map errors = new HashMap();

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
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

	// 校验表单是否合法
	public boolean vaild() {
		boolean isOK = true;

		if (this.studentid == null || this.studentid.trim().equals("")) {
			isOK = false;
			errors.put("username", "用户名不能为空");
		} else {
			if (!this.studentid.matches("[0-9]{6,6}")) {
				isOK = false;
				errors.put("username", "用户名应为6位数字");
			}
		}

		if (this.password == null || this.password.trim().equals("")) {
			isOK = false;
			errors.put("password", "密码不能为空");
		} else {
			if (!this.password.matches("[a-z[A-Z[0-9]]]{6,}")) {
				isOK = false;
				errors.put("password", "密码至少为6位");
			}
		}

		if (this.checkcode == null || this.checkcode.trim().equals("")) {
			isOK = false;
			errors.put("checkcode", "验证码不能为空");
		} else {
			if (!this.checkcode.equals(this.randomNum)) {
				isOK = false;
				errors.put("checkcode", "验证码输入有误");
			}

		}
		return isOK;
	}

}
