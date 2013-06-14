package domain;

import java.util.Date;


/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message  implements java.io.Serializable {


    // Fields    

     private Integer messageid;
     private Customer customerBySendTo;
     private Customer customerByCustomerid;
     private String content;
     private Date sendTime;
     private boolean status;


    // Constructors

    /** default constructor */
    public Message() {
    }

	/** minimal constructor */
    public Message(Customer customerBySendTo, Customer customerByCustomerid, Date sendTime, boolean status) {
        this.customerBySendTo = customerBySendTo;
        this.customerByCustomerid = customerByCustomerid;
        this.sendTime = sendTime;
        this.status = status;
    }
    
    /** full constructor */
    public Message(Customer customerBySendTo, Customer customerByCustomerid, String content, Date sendTime, boolean status) {
        this.customerBySendTo = customerBySendTo;
        this.customerByCustomerid = customerByCustomerid;
        this.content = content;
        this.sendTime = sendTime;
        this.status = status;
    }

   
    // Property accessors

    public Integer getMessageid() {
        return this.messageid;
    }
    
    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Customer getCustomerBySendTo() {
        return this.customerBySendTo;
    }
    
    public void setCustomerBySendTo(Customer customerBySendTo) {
        this.customerBySendTo = customerBySendTo;
    }

    public Customer getCustomerByCustomerid() {
        return this.customerByCustomerid;
    }
    
    public void setCustomerByCustomerid(Customer customerByCustomerid) {
        this.customerByCustomerid = customerByCustomerid;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
   








}