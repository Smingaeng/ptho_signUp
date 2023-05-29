package com.example.ptho;

//찜 목록에 쓸 프로덕트 item
//DB 연동 필요
public class ProductItem {

    String brand;
    String name;
    int price;
    int productresourceId;
    public int getpResourceId() {
        return productresourceId;
    }

    public ProductItem(int resId, String brand, String name, int price) {
        this.productresourceId = resId;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}