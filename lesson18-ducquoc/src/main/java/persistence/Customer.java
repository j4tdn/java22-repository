package persistence;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "T08_CUSTOMER")
public class Customer {

    @Id
    @Column(name = "C08_CUSTOMER_ID")
    private Integer id;

    @Column(name = "C08_CUSTOMER_NAME")
    private String name;

    @Column(name = "C08_CUSTOMER_EMAIL")
    private String email;

    @Column(name = "C08_CUSTOMER_PHONE")
    private String phone;

    @Column(name = "C08_CUSTOMER_ADDRESS")
    private String address;

    @Column(name = "C08_CUSTOMER_PASSWORD")
    private String password;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer() {
    }

    public Customer(String name, String email, String phone, String address, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
    }
}