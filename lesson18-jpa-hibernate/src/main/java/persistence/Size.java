package persistence;

import java.util.Objects;

import common.SizeName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T12_SIZE")
public class Size {
	
	@Id
	@Column(name = "C12_SIZE_ID")
	private Integer id;
	
	@Enumerated(EnumType.STRING) // mapping string from database to enum in entity
	@Column(name = "C12_SIZE_NAME")
	private SizeName sizeName;
	
	@Column(name = "C12_GENDER")
	private Boolean gender;
	
	@Column(name = "C12_SIZE_DESC")
	private String desc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SizeName getSizeName() {
		return sizeName;
	}

	public void setSizeName(SizeName sizeName) {
		this.sizeName = sizeName;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Size that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Size [id=" + id + ", sizeName=" + sizeName + ", gender=" + gender + ", desc=" + desc + "]";
	}
}
