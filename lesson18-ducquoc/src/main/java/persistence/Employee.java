package persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "T13_EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "C13_EMPLOYEE_ID")
    private Integer id;

    @Column(name = "C13_EMPLOYEE_NAME")
    private String name;

    @Column(name = "C13_EMPLOYEE_EMAIL")
    private String email;

    @Column(name = "C13_EMPLOYEE_PHONE")
    private String phone;

    @Column(name = "C13_EMPLOYEE_ADDRESS")
    private String address;

    @Column(name = "C13_EMPLOYEE_PASSWORD")
    private String password;

    @ManyToOne
    @JoinColumn(name = "C13_TITLE_ID")
    private Title title;

    public Employee() {
    }

    public Employee(String name, String email, String phone, String address, String password, Title title) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.title = title;
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

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
    }
}