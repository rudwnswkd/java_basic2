package com.javalab.TTTTTT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 주문 도메인 클래스
 * - 속성(멤버변수) : 주문id, 주문일자, 상품id, 주문처리사원id, 주문수량
 */
public class Order {
    private int number;
    private Date day;
    private int id;
    private int idd;
    private int amount;

    public Order(){
    }
    public Order(int number, Date day, int id, int idd, int amount){
        this.number = number;
        this.day = day;
        this.id = id;
        this.idd = idd;
        this.amount = amount;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public Date getDay(){
        return day;
    }
    public void setDay(String s){
        Date day;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getIdd(){
        return idd;
    }
    public void setIdd(int idd){
        this.idd = idd;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

}
