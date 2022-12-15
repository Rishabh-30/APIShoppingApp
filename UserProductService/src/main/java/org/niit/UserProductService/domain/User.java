package org.niit.UserProductService.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {

    @Id
    private String userId;
    private String userName;
    private String address;
    private List<Product> productList;

    private String password;

    public User() {
    }

    public User(String userId, String userName, String address, List<Product> productList, String password) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.productList = productList;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", productList=" + productList +
                ", password='" + password + '\'' +
                '}';
    }
}
