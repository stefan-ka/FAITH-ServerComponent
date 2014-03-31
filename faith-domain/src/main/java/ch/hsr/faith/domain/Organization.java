package ch.hsr.faith.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Organization implements BaseEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int level;
	@ManyToOne(fetch = FetchType.EAGER)
	private OrganizationGroup organizationGroup;
	@ManyToOne(fetch = FetchType.EAGER)
	private UserAccount userAccount;
	@OneToOne(fetch = FetchType.EAGER)
	private Contact contact;
	@OneToOne(fetch = FetchType.EAGER)
	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public OrganizationGroup getOrganizationGroup() {
		return organizationGroup;
	}

	public void setOrganizationGroup(OrganizationGroup organizationGroup) {
		this.organizationGroup = organizationGroup;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
