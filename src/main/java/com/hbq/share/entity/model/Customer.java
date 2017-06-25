package com.hbq.share.entity.model;

public class Customer {
    private Integer id;

    private String email;

    private String phone;

    private String password;

    private String nickname;

    private String introduction;

    public Customer(Integer id, String email, String phone, String password, String nickname, String introduction) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.nickname = nickname;
        this.introduction = introduction;
    }

    public Customer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}