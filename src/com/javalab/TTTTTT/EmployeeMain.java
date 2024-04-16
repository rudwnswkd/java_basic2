package com.javalab.TTTTTT;

public class EmployeeMain {
    private int number;
    private String name;
    private String position;
    private int salary;



    public void Employee(int number, String name, String position, int salary) {
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


public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setNumber(201);
        employee.setName("Alice");
        employee.setPosition("사원");
        employee.setSalary(30000);

        Employee employee2 = new Employee();
        employee2.setNumber(202);
        employee2.setName("Bob");
        employee2.setPosition("대리");
        employee2.setSalary(40000);

        Employee employee3 = new Employee();
        employee3.setNumber(203);
        employee3.setName("Charlie");
        employee3.setPosition("과장");
        employee3.setSalary(50000);

        Employee employee4 = new Employee();
        employee4.setNumber(204);
        employee4.setName("David");
        employee4.setPosition("사원");
        employee4.setSalary(32000);

        Employee employee5 = new Employee();
        employee5.setNumber(205);
        employee5.setName("Eve");
        employee5.setPosition("대리");
        employee5.setSalary(42000);

        Employee[] employees = new Employee[5];
        employees[0] = employee;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        System.out.println();

        printEmployee(employees);

    }

    public static void printEmployee(Employee[] employees) {
        System.out.println("사원번호       이름        직급       급여");
        for (Employee e : employees) {
            System.out.println(e.getNumber() + "       " + e.getName() + "       " + e.getPosition()
                    + "        " + e.getSalary());
            System.out.println();
        }
    }

}

