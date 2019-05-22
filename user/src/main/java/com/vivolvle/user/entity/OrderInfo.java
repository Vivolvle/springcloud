package com.vivolvle.user.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author: weilz
 * @Date: 2019/5/22 16:11
 */
@Entity
@Table(name = "order_info", schema = "map")
public class OrderInfo {
    private int id;
    private String name;
    private int number;
    private byte status;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "status")
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderInfo orderInfo = (OrderInfo) o;
        return id == orderInfo.id &&
                number == orderInfo.number &&
                status == orderInfo.status &&
                Objects.equals(name, orderInfo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, number, status);
    }
}
