package domain;

public class MessageBox {
	private String content;
	private String sendTo;
	private String send;
	private int sendToid;
	private int sendid;
	public int getSendToid() {
		return sendToid;
	}
	public void setSendToid(int sendToid) {
		this.sendToid = sendToid;
	}
	public int getSendid() {
		return sendid;
	}
	public void setSendid(int sendid) {
		this.sendid = sendid;
	}
	private String sendTime;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSendTo() {
		return sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	public String getSend() {
		return send;
	}
	public void setSend(String send) {
		this.send = send;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	
}
