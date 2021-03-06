package com.weblaptop.backend.models.ENTITY;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    private String phone;
    private String status;
    private long totalPrice;
    private Date orderDay;
    private String orderCode;
    // cart detail
    @OneToMany(mappedBy = "ordersEntity")
    private List<CartDetailEntity> cartDetailEntities;
    // user
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "idUser", nullable = true)
    private User user;

    public OrdersEntity() {
    }

    public OrdersEntity(String name, String address, String phone, String status, User user) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.user = user;
    }

    public OrdersEntity(long id, String name, String address, String phone, String status, List<CartDetailEntity> cartDetailEntities, User user) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.cartDetailEntities = cartDetailEntities;
        this.user = user;
    }

    public OrdersEntity(long id, String name, String address, String phone, String status, long totalPrice, List<CartDetailEntity> cartDetailEntities, User user) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.totalPrice = totalPrice;
        this.cartDetailEntities = cartDetailEntities;
        this.user = user;
    }

    public OrdersEntity(long id, String name, String address, String phone, String status, long totalPrice, Date orderDay, String orderCode, List<CartDetailEntity> cartDetailEntities, User user) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.totalPrice = totalPrice;
        this.orderDay = orderDay;
        this.orderCode = orderCode;
        this.cartDetailEntities = cartDetailEntities;
        this.user = user;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Date getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(Date orderDay) {
        this.orderDay = orderDay;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CartDetailEntity> getCartDetailEntities() {
        return cartDetailEntities;
    }

    public void setCartDetailEntities(List<CartDetailEntity> cartDetailEntities) {
        this.cartDetailEntities = cartDetailEntities;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
