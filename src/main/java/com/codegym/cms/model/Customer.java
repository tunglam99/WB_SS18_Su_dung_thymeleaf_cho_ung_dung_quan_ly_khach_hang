package com.codegym.cms.model;


import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String gender;
    private String avatar;

    public Customer(){

    }

    public Customer(String name, String address, String gender, String avatar) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name='%s', address='%s', gender='%s', avatar='%s']", id, name, address,gender,avatar);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
