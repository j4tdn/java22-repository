package persistence;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "T04_ORDER")
public class Order {

    @Id
    @Column(name = "C04_ORDER_ID")
    private Integer id;

    @Column(name = "C04_RECEIVER_NAME")
    private String receiverName;

    @Column(name = "C04_RECEIVER_PHONE")
    private String receiverPhone;

    @Column(name = "C04_DELIVERY_ADDRESS")
    private String deliveryAddress;

    @Column(name = "C04_ORDER_TIME")
    private LocalDateTime orderTime;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C04_PAYMENT_METHOD_ID")
    private PayMethod payMethod;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C04_CUSTOMER_ID")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    public Order() {
    }

    public Order(String receiverName, String receiverPhone, String deliveryAddress, PayMethod payMethod, Customer customer) {
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.deliveryAddress = deliveryAddress;
        this.payMethod = payMethod;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public PayMethod getPaymentMethod() {
        return payMethod;
    }

    public void setPaymentMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", receiverName=" + receiverName + ", receiverPhone=" + receiverPhone + ", deliveryAddress=" + deliveryAddress + ", orderTime=" + orderTime + "]";
    }
}