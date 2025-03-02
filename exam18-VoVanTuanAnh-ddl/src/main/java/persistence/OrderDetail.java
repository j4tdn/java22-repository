package persistence;

import javax.persistence.*;

@Entity
@Table(name = "t05_order_detail")
@IdClass(OrderDetailId.class)
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "C05_ORDER_ID")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "C05_ITEM_DETAIL_ID")
    private ItemDetail itemDetail;

    @Column(name = "C05_AMOUNT")
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
		return "OrderDetail [order=" + order + ", itemDetail=" + itemDetail + ", amount=" + amount + "]";
	}
    
	
    
}