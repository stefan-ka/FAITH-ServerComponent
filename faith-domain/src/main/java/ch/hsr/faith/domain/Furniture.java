package ch.hsr.faith.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Furniture implements BaseEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne(fetch = FetchType.EAGER)
	private FurnitureCategory furnitureCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FurnitureCategory getFurnitureCategory() {
		return furnitureCategory;
	}

	public void setFurnitureCategory(FurnitureCategory furnitureCategory) {
		this.furnitureCategory = furnitureCategory;
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
		return this.getId() == other.getId() && this.getName().equals(other.getName());
	}
}
