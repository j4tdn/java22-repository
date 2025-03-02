package persistence;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t04_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C04_ORDER_ID")
    private Integer id;

    @Column(name = "C04_ORDER_TIME")
    private LocalDateTime orderTime;

    public Order() {
    	
    }

	public Order(Integer id, LocalDateTime orderTime) {
		this.id = id;
		this.orderTime = orderTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderTime=" + orderTime + "]";
	}
    
	
    
}
