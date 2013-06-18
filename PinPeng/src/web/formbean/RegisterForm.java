package web.formbean;

import java.util.HashMap;
import java.util.Map;

import domain.Customer;

public class RegisterForm {

	private String studentid;
	private String name;
	private String password;
	private String repassword;
	private String email;
	private String qqnumber;
	private String telnumber;
	private String sex;
	private String dormitory;
	private String randomNum;
	private String checkcode;
	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	private Map errors = new HashMap();

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQqnumber() {
		return qqnumber;
	}

	public void setQqnumber(String qqnumber) {
		this.qqnumber = qqnumber;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDormitory() {
		return dormitory;
	}

	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
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
		//
		//
		if (this.studentid == null || this.studentid.trim().equals("")) {
			isOK = false;
			errors.put("studentid", "学号不能为空");
		} else {
			if (!this.studentid.matches("[0-9]{6,6}")) {
				isOK = false;
				errors.put("studentid", "学号应为6位数字");
			}
		}
		if (this.name == null || this.name.trim().equals("")) {
			isOK = false;
			errors.put("name", "姓名不能为空");
		}
		if (this.qqnumber == null || this.qqnumber.trim().equals("")) {
			isOK = false;
			errors.put("qqnumber", "qq号不能为空");
		} 
		if (this.telnumber == null || this.telnumber.trim().equals("")) {
			isOK = false;
			errors.put("telnumber", "电话不能为空");
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
		if (this.repassword == null || this.repassword.trim().equals("")) {
			isOK = false;
			errors.put("repassword", "确认密码不能为空");
		} else {
			if (!this.repassword.matches("[a-z[A-Z[0-9]]]{6,}")) {
				isOK = false;
				errors.put("repassword", "确认密码至少为6位");
			}
			if (!this.repassword.equals(this.password)) {
				isOK = false;
				errors.put("repassword", "确认密码与原密码不相同");
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

	public Customer get_customer() {
		Customer customer = new Customer();

		customer.setStudentid(Integer.parseInt(studentid));
		customer.setName(name);
		customer.setPassword(password);
		customer.setEmail(email);
		customer.setQqNumber(qqnumber);
		customer.setTelNumber(telnumber);
		if (sex.equals("male")) {
			customer.setSex(true);
		} else {
			customer.setSex(false);
		}
		customer.setDormitory(Integer.parseInt(dormitory));

		return customer;
	}
}
