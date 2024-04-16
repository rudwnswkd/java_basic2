package com.javalab.TTTTTT;

public class CategoryMain {
    private int number;
    private String name;
    private String explain;


    public void Category(int number, String name, String explain) {
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

    public static void main(String[] args) {
        Category category = new Category();
        category.setNumber(1);
        category.setName("coffee");
        category.setExplain("All types of coffee drinks");

        Category category2 = new Category();
        category.setNumber(2);
        category.setName("Latte");
        category.setExplain("Various kinds of lattes");

        Category category3 = new Category();
        category.setNumber(3);
        category.setName("Ade/Shake");
        category.setExplain("Fresh ades and shakes");

        Category category4 = new Category();
        category.setNumber(4);
        category.setName("Smoothie/Juice");
        category.setExplain("Healthy smoothies and juices");

        Category category5 = new Category();
        category.setNumber(5);
        category.setName("Bakery");
        category.setExplain("Fresh baked goods");

        Category category6 = new Category();
        category.setNumber(6);
        category.setName("Tea");
        category.setExplain("Traditional and herbal teas");

        Category[] categories = new Category[6];
        categories[0] = category;
        categories[1] = category2;
        categories[2] = category3;
        categories[3] = category4;
        categories[4] = category5;
        categories[5] = category6;
        System.out.println();

        printCategory(categories);

    }

    public static void printCategory(Category[] categories) {
        System.out.println("카테고리번호       카테고리명        카테고리설명");
        for (Category c : categories) {
            if (c != null) {
                System.out.println(c.getNumber() + "       " + c.getName() + "        " + c.getExplain());
            }
            System.out.println();
        }
    }

}
