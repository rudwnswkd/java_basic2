package com.javalab.TTTTTT;

/**
 * 카테고리 클래스
 * - 속성으로(멤버변수) : 카테고리id, 카테고리명, 카테고리설명
 */
public class Category {
    private int number;
    private String name;
    private String explain;

    public Category() {

    }

    public Category(int number, String name, String explain) {
        this.number = number;
        this.name = name;
        this.explain = explain;
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
    public String getExplain(){
        return explain;
    }
    public void setExplain(String explain){
        this.explain = explain;
    }
}


