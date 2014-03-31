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

}
