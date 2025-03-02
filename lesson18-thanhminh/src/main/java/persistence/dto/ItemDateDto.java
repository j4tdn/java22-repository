package persistence.dto;

import java.time.LocalDate;
import java.util.Objects;

public class ItemDateDto {
	
	public static final String PROP_IT_ID = "itId";
	public static final String PROP_IT_NAME = "itName";
	public static final String PROP_OD_CREATED_AT = "itCreatedTime";
	
	private Integer itId;
	private String itName;
	private LocalDate itCreatedTime;
	
    public ItemDateDto() {		
	}

	public ItemDateDto(Integer itId, String itName, LocalDate itCreatedTime) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.itCreatedTime = itCreatedTime;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public LocalDate getItCreatedTime() {
		return itCreatedTime;
	}

	public void setItCreatedTime(LocalDate itCreatedTime) {
		this.itCreatedTime = itCreatedTime;
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ItemDateDto)) {
			return false;
		}
		
		ItemDateDto that = (ItemDateDto) obj;
		
		return getItId() == that.getItId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getItId());
	}

	@Override
	public String toString() {
		return "ItemDateDto [itId=" + itId + ", itName=" + itName + ", itCreatedTime=" + itCreatedTime + "]";
	}

}
