package persistence;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "T12_SIZE")
public class Size {

    @Id
    @Column(name = "C12_SIZE_ID")
    private Integer id;

    @Column(name = "C12_SIZE_NAME")
    private String name;

    @Column(name = "C12_GENDER")
    private Boolean gender; 

    @Column(name = "C12_SIZE_DESC")
    private String description;

    @OneToMany(mappedBy = "size")
    private List<ItemDetail> itemDetails;

    public Size() {
    }

    public Size(String name, Boolean gender, String description) {
        this.name = name;
        this.gender = gender;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ItemDetail> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<ItemDetail> itemDetails) {
        this.itemDetails = itemDetails;
    }

    @Override
    public String toString() {
        return "Size [id=" + id + ", name=" + name + ", gender=" + gender + ", description=" + description + "]";
    }
}