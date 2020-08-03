package com.clbsach.entity;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "replyfeedback", catalog = "clbsach")
public class Replyfeedback implements java.io.Serializable {

	private static final long serialVersionUID = 6426125898959256681L;
	
	private Integer replyfeedbackId;
	private Account account;
	private Feedback feedback;
	private String replycontent;
	private Date createDate;

	public Replyfeedback() {
		Calendar calendar = Calendar.getInstance();
		this.createDate = calendar.getTime();
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "replyfeedbackId", unique = true, nullable = false)
	public Integer getReplyfeedbackId() {
		return this.replyfeedbackId;
	}

	public void setReplyfeedbackId(Integer replyfeedbackId) {
		this.replyfeedbackId = replyfeedbackId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accountId", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feedbackId", nullable = false)
	public Feedback getFeedback() {
		return this.feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	@Column(name = "replycontent", nullable = false, length = 65535)
	public String getReplycontent() {
		return this.replycontent;
	}

	public void setReplycontent(String replycontent) {
		this.replycontent = replycontent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 26)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
