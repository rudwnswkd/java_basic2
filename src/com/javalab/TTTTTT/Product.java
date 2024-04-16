package com.javalab.TTTTTT;

/**
 * 상품 도메인 클래스
 * - 속성(멤버변수) : 상품id, 상품명, 카테고리id, 상품가격
 */
public class Product {
    private int number;
    private String name;
    private int category;
    private int price;

    public Product() {

    }

    public Product(int number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}




