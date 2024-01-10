package shopping;

public class ItemDetail {
	private Item id;
	private int quality;

	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Item id, int quality) {
		super();
		this.id = id;
		this.quality = quality;
	}

	public Item getId() {
		return id;
	}

	public void setId(Item id) {
		this.id = id;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", quality=" + quality + "]";
	}
	
}
