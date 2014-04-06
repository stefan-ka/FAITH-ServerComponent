package ch.hsr.faith.domain;

public class PieceOfFurniture implements BaseEntity {

	private Long id;
	private String name;
	private Integer value;
	private FurnitureCategory furnitureCategory;

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

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public FurnitureCategory getFurnitureCategory() {
		return furnitureCategory;
	}

	public void setFurnitureCategory(FurnitureCategory furnitureCategory) {
		this.furnitureCategory = furnitureCategory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((furnitureCategory == null) ? 0 : furnitureCategory.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		PieceOfFurniture other = (PieceOfFurniture) obj;
		if (furnitureCategory == null) {
			if (other.furnitureCategory != null)
				return false;
		} else if (!furnitureCategory.equals(other.furnitureCategory))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
