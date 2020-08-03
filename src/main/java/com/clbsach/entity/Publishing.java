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
@Table(name = "publishing", catalog = "clbsach")
public class Publishing implements java.io.Serializable {

	private static final long serialVersionUID = -1463895200986897103L;
	
	private Integer publishingId;
	private String publishingName;
	private String address;
	private Date createDate;
	private Set<Book> books = new HashSet<Book>(0);

	public Publishing() {
		Calendar calendar = Calendar.getInstance();
		this.createDate = calendar.getTime();
	}

	public Publishing(Integer publishingId) {
		this.publishingId = publishingId;
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "publishingId", unique = true, nullable = false)
	public Integer getPublishingId() {
		return this.publishingId;
	}

	public void setPublishingId(Integer publishingId) {
		this.publishingId = publishingId;
	}

	@Column(name = "publishingName", nullable = false, length = 100)
	public String getPublishingName() {
		return this.publishingName;
	}

	public void setPublishingName(String publishingName) {
		this.publishingName = publishingName;
	}

	@Column(name = "address", nullable = false, length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 26)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "publishing")
	public Set<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}
