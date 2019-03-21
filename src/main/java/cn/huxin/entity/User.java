package cn.huxin.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 7278884624983893698L;

    private Integer id;
    private String username;
    private String password;
    private Integer gender;
    private String phone;
    private String email;
    private String uuid;

    public User() {
        super();
    }

    public User(String username, String password, String phone, String email) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public User(String username, String password, Integer gender, String phone, String email, String uuid) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.uuid = uuid;
    }

    public User(Integer id, String username, String password, Integer gender, String phone, String email, String uuid) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
