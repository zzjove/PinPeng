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
