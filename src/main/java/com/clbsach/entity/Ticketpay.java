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
@Table(name = "ticketpay", catalog = "clbsach")
public class Ticketpay implements java.io.Serializable {

	private static final long serialVersionUID = -3294166626337009990L;

	private Integer ticketPayId;
	private Account account;
	private Book book;
	private Ticketborrow ticketborrow;
	private boolean payStatus;
	private int payFee;
	private String note;
	private Date borrowDate;
	private Date payDate;

	public Ticketpay() {
		Calendar calendar = Calendar.getInstance();
		this.payDate = calendar.getTime();
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ticketPayId", unique = true, nullable = false)
	public Integer getTicketPayId() {
		return this.ticketPayId;
	}

	public void setTicketPayId(Integer ticketPayId) {
		this.ticketPayId = ticketPayId;
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
	@JoinColumn(name = "bookId", nullable = false)
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ticketBorrowId", nullable = false)
	public Ticketborrow getTicketborrow() {
		return this.ticketborrow;
	}

	public void setTicketborrow(Ticketborrow ticketborrow) {
		this.ticketborrow = ticketborrow;
	}

	@Column(name = "payStatus", nullable = false)
	public boolean isPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(boolean payStatus) {
		this.payStatus = payStatus;
	}

	@Column(name = "payFee", nullable = false)
	public int getPayFee() {
		return this.payFee;
	}

	public void setPayFee(int payFee) {
		this.payFee = payFee;
	}

	@Column(name = "note", length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "borrowDate", nullable = false, length = 26)
	public Date getBorrowDate() {
		return this.borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "payDate", length = 26)
	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

}
