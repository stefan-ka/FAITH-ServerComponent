package ch.hsr.faith.domain;

public class ItemNeeded implements BaseEntity {

	private Long id;
	private String description;
	private Integer amount;
	private PieceOfFurniture pieceOfFurniture;
	private Facility facility;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public PieceOfFurniture getPieceOfFurniture() {
		return pieceOfFurniture;
	}
	public void setPieceOfFurniture(PieceOfFurniture pieceOfFurniture) {
		this.pieceOfFurniture = pieceOfFurniture;
	}
	public Facility getFacility() {
		return facility;
	}
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((facility == null) ? 0 : facility.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pieceOfFurniture == null) ? 0 : pieceOfFurniture.hashCode());
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
		ItemNeeded other = (ItemNeeded) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (facility == null) {
			if (other.facility != null)
				return false;
		} else if (!facility.equals(other.facility))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pieceOfFurniture == null) {
			if (other.pieceOfFurniture != null)
				return false;
		} else if (!pieceOfFurniture.equals(other.pieceOfFurniture))
			return false;
		return true;
	}

}
