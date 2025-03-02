package persistence;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "T09_PAYMENT_METHOD")
public class PayMethod {

    @Id
    @Column(name = "C09_PAYMENT_METHOD_ID")
    private Integer id;

    @Column(name = "C09_PAYMENT_METHOD_TYPE")
    private String type;

    @OneToMany(mappedBy = "paymentMethod")
    private List<Order> orders;

    public PayMethod() {
    }

    public PayMethod(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "PaymentMethod [id=" + id + ", type=" + type + "]";
    }
}