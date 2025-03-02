package persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "T05_ORDER_DETAIL")
public class OrderDetail {

    @Id
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C05_ORDER_ID")
    private Order order;

    @Id
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C05_ITEM_DETAIL_ID")
    private ItemDetail itemDetail;

    @Column(name = "C05_AMOUNT", nullable = false)
    private Integer amount;

    public OrderDetail() {
    }

    public OrderDetail(Order order, ItemDetail itemDetail, Integer amount) {
        this.order = order;
        this.itemDetail = itemDetail;
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ItemDetail getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(ItemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderDetail [order=" + order.getId() + ", itemDetail=" + itemDetail.getId() + ", amount=" + amount + "]";
    }
}