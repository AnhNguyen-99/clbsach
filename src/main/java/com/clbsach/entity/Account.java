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
@Table(name = "account", catalog = "clbsach")
public class Account implements java.io.Serializable {

	private static final long serialVersionUID = 3093961100164774729L;

	private Integer accountId;
	private String accountName;
	private String accountPass;
	private String phone;
	private String mail;
	private String address;
	private Boolean accountStatus;
	private Date createDate;
	private Set<Banner> banners = new HashSet<Banner>(0);
	private Set<Replyfeedback> replyfeedbacks = new HashSet<Replyfeedback>(0);
	private Set<Ticketpay> ticketpays = new HashSet<Ticketpay>(0);
	private Set<AccountRole> accountRoles = new HashSet<AccountRole>(0);
	private Set<Ticketborrow> ticketborrows = new HashSet<Ticketborrow>(0);
	private Set<News> newses = new HashSet<News>(0);
	private Set<User> users = new HashSet<User>(0);

	public Account() {
		Calendar calendar = Calendar.getInstance();
		this.createDate = calendar.getTime();
	}
	
	public Account(int accountId) {
		this.accountId = accountId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "accountId", unique = true, nullable = false)
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Column(name = "accountName", nullable = false, length = 100)
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Column(name = "accountPass", nullable = false, length = 100)
	public String getAccountPass() {
		return this.accountPass;
	}

	public void setAccountPass(String accountPass) {
		this.accountPass = accountPass;
	}

	@Column(name = "phone", nullable = false, length = 10)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "mail", nullable = false, length = 100)
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "address", nullable = false, length = 255)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "accountStatus")
	public Boolean getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(Boolean accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 26)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Banner> getBanners() {
		return this.banners;
	}

	public void setBanners(Set<Banner> banners) {
		this.banners = banners;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Replyfeedback> getReplyfeedbacks() {
		return this.replyfeedbacks;
	}

	public void setReplyfeedbacks(Set<Replyfeedback> replyfeedbacks) {
		this.replyfeedbacks = replyfeedbacks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Ticketpay> getTicketpays() {
		return this.ticketpays;
	}

	public void setTicketpays(Set<Ticketpay> ticketpays) {
		this.ticketpays = ticketpays;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<AccountRole> getAccountRoles() {
		return this.accountRoles;
	}

	public void setAccountRoles(Set<AccountRole> accountRoles) {
		this.accountRoles = accountRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Ticketborrow> getTicketborrows() {
		return this.ticketborrows;
	}

	public void setTicketborrows(Set<Ticketborrow> ticketborrows) {
		this.ticketborrows = ticketborrows;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<News> getNewses() {
		return this.newses;
	}

	public void setNewses(Set<News> newses) {
		this.newses = newses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
