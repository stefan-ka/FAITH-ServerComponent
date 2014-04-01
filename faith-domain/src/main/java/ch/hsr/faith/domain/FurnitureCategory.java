package ch.hsr.faith.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FurnitureCategory implements BaseEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne(fetch = FetchType.EAGER)
	private FurnitureCategory parent;

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

	public FurnitureCategory getParent() {
		return parent;
	}

	public void setParent(FurnitureCategory parent) {
		this.parent = parent;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		FurnitureCategory other = (FurnitureCategory) obj;

		if (!this.getId().equals(other.getId())) {
			return false;
		}
		if (!this.getName().equals(other.getName())) {
			return false;
		}
		if (this.getParent() == null && other.getParent() == null) {
			return true;
		} else {
			if (!this.getParent().equals(other.getParent())) {
				return false;
			}
		}
		return true;
	}

}
