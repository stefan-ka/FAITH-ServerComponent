package ch.hsr.faith.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Organization {

	@Id
	@GeneratedValue
	private long Id;

	private String name;
	private int level;

	@ManyToOne
	private OrganizationGroup organizationGroup;

	@ManyToOne
	private UserAccount userAccount;

	@OneToOne
	private Contact contact;

	@OneToOne
	private Address address;

	@ManyToMany
	private Collection<Furniture> furnitures;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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

	public Collection<Furniture> getFurnitures() {
		return furnitures;
	}

	public void setFurnitures(Collection<Furniture> furnitures) {
		this.furnitures = furnitures;
	}

}
