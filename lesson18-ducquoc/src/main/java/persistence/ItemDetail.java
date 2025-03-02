package persistence;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "T03_ITEM_DETAIL", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"C03_ITEM_ID", "C03_SIZE_ID", "C03_COLOR"}, name = "UNQ_T03_ITEM_DETAIL")
})
public class ItemDetail {

    @Id
    @Column(name = "C03_ITEM_DETAIL_ID")
    private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C03_ITEM_ID")
    private Item item;
    
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C03_SIZE_ID")
    private Size size;

    @Column(name = "C03_COLOR")
    private String color;

    @Column(name = "C03_AMOUNT")
    private Integer amount;

    @Column(name = "C03_SALES_PRICE")
    private Float salesPrice;

    @OneToMany(mappedBy = "itemDetail")
    private List<OrderDetail> orderDetails;

    public ItemDetail() {
    }

    public ItemDetail(Item item, Size size, String color, Integer amount, Float salesPrice) {
        this.item = item;
        this.size = size;
        this.color = color;
        this.amount = amount;
        this.salesPrice = salesPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Float salesPrice) {
        this.salesPrice = salesPrice;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "ItemDetail [id=" + id + ", item=" + item.getId() + ", size=" + size.getId() + ", color=" + color + ", amount=" + amount + ", salesPrice=" + salesPrice + "]";
    }
}