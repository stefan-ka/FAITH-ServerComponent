package ch.hsr.faith.domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserAccount implements BaseEntity {

	private Long id;
	@NotNull
	@Size(min = 1)
	private String password;
	@NotNull
	@Size(min = 1)
	private String email;
	private Integer donations;
	private Integer level;
	@JsonIgnore
	private Collection<Facility> facilities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDonations() {
		return donations;
	}

	public void setDonations(Integer donations) {
		this.donations = donations;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Collection<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(Collection<Facility> facilities) {
		this.facilities = facilities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((donations == null) ? 0 : donations.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((facilities == null) ? 0 : facilities.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (donations == null) {
			if (other.donations != null)
				return false;
		} else if (!donations.equals(other.donations))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (facilities == null) {
			if (other.facilities != null)
				return false;
		} else if (!facilities.equals(other.facilities))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
