package com.example.ucboyutlucanavar.Models;

import java.io.Serializable;

public class Model implements Serializable {
    private int productId;
    private int sizeId;
    private String productName;
    private String productCatagory;
    private String productCatagoryPic;
    private Integer productSize;
    private Integer productPrice;
    private String tumbnail;
    private String picture2;
    private String picture3;
    private String picture4;
    private String picture5;
    private String picture6;
    private String picture7;
    private String picture8;
    private String picture9;

    public Model(int productId, int sizeId, String productName, String productCatagory, String productCatagoryPic, Integer productSize, Integer productPrice, String tumbnail, String picture2, String picture3, String picture4, String picture5, String picture6, String picture7, String picture8, String picture9) {
        this.productId = productId;
        this.sizeId = sizeId;
        this.productName = productName;
        this.productCatagory = productCatagory;
        this.productCatagoryPic = productCatagoryPic;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.tumbnail = tumbnail;
        this.picture2 = picture2;
        this.picture3 = picture3;
        this.picture4 = picture4;
        this.picture5 = picture5;
        this.picture6 = picture6;
        this.picture7 = picture7;
        this.picture8 = picture8;
        this.picture9 = picture9;
    }

    public String getProductCatagoryPic() {
        return productCatagoryPic;
    }

    public void setProductCatagoryPic(String productCatagoryPic) {
        this.productCatagoryPic = productCatagoryPic;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCatagory() {
        return productCatagory;
    }

    public void setProductCatagory(String productCatagory) {
        this.productCatagory = productCatagory;
    }

    public Integer getProductSize() {
        return productSize;
    }

    public void setProductSize(Integer productSize) {
        this.productSize = productSize;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getTumbnail() {
        return tumbnail;
    }

    public void setTumbnail(String tumbnail) {
        this.tumbnail = tumbnail;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4;
    }

    public String getPicture5() {
        return picture5;
    }

    public void setPicture5(String picture5) {
        this.picture5 = picture5;
    }

    public String getPicture6() {
        return picture6;
    }

    public void setPicture6(String picture6) {
        this.picture6 = picture6;
    }

    public String getPicture7() {
        return picture7;
    }

    public void setPicture7(String picture7) {
        this.picture7 = picture7;
    }

    public String getPicture8() {
        return picture8;
    }

    public void setPicture8(String picture8) {
        this.picture8 = picture8;
    }

    public String getPicture9() {
        return picture9;
    }

    public void setPicture9(String picture9) {
        this.picture9 = picture9;
    }
/*
    private String name;
    private String catagory;
    private int price;

    public Model(String name, String catagory, int price) {
        this.name = name;
        this.catagory = catagory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

*/
}
