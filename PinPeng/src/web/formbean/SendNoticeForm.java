package web.formbean;

import java.util.HashMap;
import java.util.Map;

public class SendNoticeForm {

	private String send_to;
	private String content;
	private Map errors = new HashMap();
	public String getSend_to() {
		return send_to;
	}
	public void setSend_to(String send_to) {
		this.send_to = send_to;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Map getErrors() {
		return errors;
	}
	public void setErrors(Map errors) {
		this.errors = errors;
	}
	
}
