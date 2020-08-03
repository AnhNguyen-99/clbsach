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
@Table(name = "author", catalog = "clbsach")
public class Author implements java.io.Serializable {

	private static final long serialVersionUID = -6192486649051276932L;

	private Integer authorId;
	private String authorName;
	private String note;
	private Date createDate;
	private Set<Book> books = new HashSet<Book>(0);

	public Author() {
		Calendar calendar = Calendar.getInstance();
		this.createDate = calendar.getTime();
	}
	
	public Author(Integer authorId) {
		this.authorId = authorId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "authorId", unique = true, nullable = false)
	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	@Column(name = "authorName", nullable = false, length = 100)
	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Column(name = "note", nullable = false, length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 26)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
	public Set<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}
