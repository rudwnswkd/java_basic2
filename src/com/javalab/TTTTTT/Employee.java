package com.javalab.TTTTTT;

/**
 * 사원 도메인 클래스
 * - 속성(멤버변수) : 직원id, 직원명, 직급, 급여
 */
public class Employee {
    private int number;
    private String name;
    private String position;
    private int salary;

    public Employee() {

    }

    public Employee(int number, String name, String position, int salary) {
        this.number = number;
        this.name = name;
        this.position = position;
        this.salary = salary;
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
    public  void setName(String name){
        this.name = name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

}


