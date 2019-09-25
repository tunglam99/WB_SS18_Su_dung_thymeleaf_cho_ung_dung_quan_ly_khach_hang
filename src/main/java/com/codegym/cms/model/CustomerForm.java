package com.codegym.cms.model;


import org.springframework.web.multipart.MultipartFile;


public class CustomerForm {

    private Long id;
    private String name;
    private String address;
    private String gender;
    private MultipartFile avatar;

    public CustomerForm(){

    }

    public CustomerForm(String name, String address, String gender, MultipartFile avatar) {
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

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
}
