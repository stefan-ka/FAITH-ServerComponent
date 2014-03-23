package ch.hsr.faith.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Furniture {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToOne
	private FurnitureCategory furnitureCategory;

	@ManyToMany
	private Collection<Organization> organizations;
	
	public FurnitureCategory getFurnitureCategory() {
		return furnitureCategory;
	}

	public void setFurnitureCategory(FurnitureCategory furnitureCategory) {
		this.furnitureCategory = furnitureCategory;
	}

	public Collection<Organization> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(Collection<Organization> organizations) {
		this.organizations = organizations;
	}


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

	@Override
	public boolean equals(Object obj) {
		Furniture other = (Furniture) obj;

		return this.getId() == other.getId()
				&& this.getName().equals(other.getName());
	}
}
