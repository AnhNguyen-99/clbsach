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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ticketborrow", catalog = "clbsach")
public class Ticketborrow implements java.io.Serializable {

	private static final long serialVersionUID = -5077360960030078834L;
	
	private Integer ticketBorrowId;
	private Account account;
	private Book book;
	private User user;
	private int quantity;
	private String note;
	private Boolean borrowStatus;
	private Date borrowDate;
	private Set<Ticketpay> ticketpays = new HashSet<Ticketpay>(0);

	public Ticketborrow() {
		Calendar calendar = Calendar.getInstance();
		this.borrowDate = calendar.getTime();
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ticketBorrowId", unique = true, nullable = false)
	public Integer getTicketBorrowId() {
		return this.ticketBorrowId;
	}

	public void setTicketBorrowId(Integer ticketBorrowId) {
		this.ticketBorrowId = ticketBorrowId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "accountId", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bookId", nullable = false)
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "note", length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "borrowStatus")
	public Boolean getBorrowStatus() {
		return this.borrowStatus;
	}

	public void setBorrowStatus(Boolean borrowStatus) {
		this.borrowStatus = borrowStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "borrowDate", length = 26)
	public Date getBorrowDate() {
		return this.borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ticketborrow")
	public Set<Ticketpay> getTicketpays() {
		return this.ticketpays;
	}

	public void setTicketpays(Set<Ticketpay> ticketpays) {
		this.ticketpays = ticketpays;
	}

}
