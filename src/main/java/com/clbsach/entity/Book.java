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
@Table(name = "book", catalog = "clbsach")
public class Book implements java.io.Serializable {

	private static final long serialVersionUID = 5995246079985713393L;
	
	private Integer bookId;
	private Author author;
	private Category category;
	private Publishing publishing;
	private String bookName;
	private String image;
	private int quantity;
	private Date yearPublishing;
	private Date createDate;
	private Set<Ticketpay> ticketpays = new HashSet<Ticketpay>(0);
	private Set<Ticketborrow> ticketborrows = new HashSet<Ticketborrow>(0);

	public Book() {
		Calendar calendar = Calendar.getInstance();
		this.createDate = calendar.getTime();
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bookId", unique = true, nullable = false)
	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "authorId", nullable = false)
	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categoryId", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "publishingId", nullable = false)
	public Publishing getPublishing() {
		return this.publishing;
	}

	public void setPublishing(Publishing publishing) {
		this.publishing = publishing;
	}

	@Column(name = "bookName", nullable = false)
	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Column(name = "image", nullable = false)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "yearPublishing", nullable = false, length = 10)
	public Date getYearPublishing() {
		return this.yearPublishing;
	}

	public void setYearPublishing(Date yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 26)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	public Set<Ticketpay> getTicketpays() {
		return this.ticketpays;
	}

	public void setTicketpays(Set<Ticketpay> ticketpays) {
		this.ticketpays = ticketpays;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	public Set<Ticketborrow> getTicketborrows() {
		return this.ticketborrows;
	}

	public void setTicketborrows(Set<Ticketborrow> ticketborrows) {
		this.ticketborrows = ticketborrows;
	}

}
