package com.clbsach.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_role", catalog = "clbsach")
public class AccountRole implements java.io.Serializable {

	private static final long serialVersionUID = -4001706516123087844L;

	private Integer accountRoleId;
	private Account account;
	private Role role;

	public AccountRole() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "accountRoleId", unique = true, nullable = false)
	public Integer getAccountRoleId() {
		return this.accountRoleId;
	}

	public void setAccountRoleId(Integer accountRoleId) {
		this.accountRoleId = accountRoleId;
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
	@JoinColumn(name = "roleId", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
