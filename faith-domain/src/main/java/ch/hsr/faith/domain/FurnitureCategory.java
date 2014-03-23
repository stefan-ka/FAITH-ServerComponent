package ch.hsr.faith.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class FurnitureCategory {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@ManyToOne
	private FurnitureCategory parent;

	@OneToMany
	private Collection<FurnitureCategory> children;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Collection<FurnitureCategory> getChildren() {
		return children;
	}

	public void setChildren(Collection<FurnitureCategory> children) {
		this.children = children;
	}
}
