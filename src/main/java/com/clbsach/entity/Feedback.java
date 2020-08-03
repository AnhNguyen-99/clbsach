package com.clbsach.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "feedback", catalog = "clbsach")
public class Feedback implements java.io.Serializable {

	private static final long serialVersionUID = -8167232085173451887L;

	private Integer feedbackId;
	private String username;
	private String mail;
	private String content;
	private boolean status;
	private Date createDate;
	private Set<Replyfeedback> replyfeedbacks = new HashSet<Replyfeedback>(0);

	public Feedback() {
		Calendar calendar = Calendar.getInstance();
		this.createDate = calendar.getTime();
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "feedbackId", unique = true, nullable = false)
	public Integer getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	@Column(name = "username", nullable = false, length = 100)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "mail", nullable = false, length = 100)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "content", nullable = false, length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 26)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "feedback")
	public Set<Replyfeedback> getReplyfeedbacks() {
		return this.replyfeedbacks;
	}

	public void setReplyfeedbacks(Set<Replyfeedback> replyfeedbacks) {
		this.replyfeedbacks = replyfeedbacks;
	}

}
