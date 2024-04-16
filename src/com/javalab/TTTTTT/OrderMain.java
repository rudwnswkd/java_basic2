package com.javalab.TTTTTT;

import java.util.Date;

public class OrderMain {
    private int number;
    private Date day;
    private int id;
    private int idd;
    private int amount;


    public void Order(int number, Date day, int id, int idd, int amount){
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


public static void main(String[] args) {
        Order order = new Order();

        order.setNumber(38167668);
        order.setDay("2017-09-13 10:15");
        order.setId(201);
        order.setIdd(1);
        order.setAmount(1);

        Order order2 = new Order();

        order2.setNumber(89217297);
        order2.setDay("2017-09-13 10:15");
        order2.setId(202);
        order2.setIdd(12);
        order2.setAmount(2);

        Order order3 = new Order();

        order3.setNumber(39178816);
        order3.setDay("2017-09-13 10:15");
        order3.setId(203);
        order3.setIdd(13);
        order3.setAmount(3);

        Order order4 = new Order();

        order4.setNumber(63105816);
        order4.setDay("2017-09-13 10:15");
        order4.setId(204);
        order4.setIdd(14);
        order4.setAmount(4);

        Order order5 = new Order();

        order5.setNumber(47018158);
        order5.setDay("2017-09-13 10:15");
        order5.setId(205);
        order5.setIdd(15);
        order5.setAmount(5);

        Order order6 = new Order();

        order6.setNumber(46078737);
        order6.setDay("2017-09-13 10:15");
        order6.setId(201);
        order6.setIdd(16);
        order6.setAmount(6);

        Order order7 = new Order();

        order7.setNumber(32215456);
        order7.setDay("2017-09-13 10:15");
        order7.setId(202);
        order7.setIdd(17);
        order7.setAmount(7);

        Order order8 = new Order();

        order8.setNumber(60728464);
        order8.setDay("2017-09-13 10:15");
        order8.setId(203);
        order8.setIdd(18);
        order8.setAmount(3);

        Order order9 = new Order();

        order9.setNumber(99145980);
        order9.setDay("2017-09-13 10:15");
        order9.setId(201);
        order9.setIdd(19);
        order9.setAmount(2);

        Order order10 = new Order();

        order10.setNumber(65700654);
        order10.setDay("2017-09-13 10:15");
        order10.setId(202);
        order10.setIdd(20);
        order10.setAmount(1);

        Order[] orders = new Order[10];
        orders[0] = order;
        orders[1] = order2;
        orders[2] = order3;
        orders[3] = order4;
        orders[4] = order5;
        orders[5] = order6;
        orders[6] = order7;
        orders[7] = order8;
        orders[8] = order9;
        orders[9] = order10;
        System.out.println();

        printOrder(orders);
    }

    public static void printOrder(Order[] orders){
        System.out.println("주문번호              주문날짜          주무처리직원id    판매상품id    판매수량");
        for (Order o : orders) {
            if (o != null) {
                System.out.println(o.getNumber() + "       " + o.getDay() + "        " + o.getId() + "             " + o.getIdd() +
                        "          " + o.getAmount());
            }
        }
    }
}
