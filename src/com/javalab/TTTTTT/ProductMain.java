package com.javalab.TTTTTT;

public class ProductMain {
    private int number;
    private String name;
    private int category;
    private int price;

    public void Product(int number, String name, int price) {
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



public static void main(String[] args) {

        Product product = new Product();
        product.setNumber(1);
        product.setName("카라멜마끼야또");
        product.setCategory(1);
        product.setPrice(5000);

        Product product2 = new Product();
        product2.setNumber(2);
        product2.setName("홍차라떼");
        product2.setCategory(2);
        product2.setPrice(5000);

        Product product3 = new Product();
        product3.setNumber(3);
        product3.setName("초코라떼");
        product3.setCategory(2);
        product3.setPrice(5000);

        Product product4 = new Product();
        product4.setNumber(4);
        product4.setName("오레오");
        product4.setCategory(3);
        product4.setPrice(5000);

        Product product5 = new Product();
        product5.setNumber(5);
        product5.setName("카라멜마끼야또");
        product5.setCategory(1);
        product5.setPrice(5000);

        Product product6 = new Product();
        product6.setNumber(6);
        product6.setName("초코라떼");
        product6.setCategory(2);
        product6.setPrice(4500);

        Product product7 = new Product();
        product7.setNumber(7);
        product7.setName("복숭아 스무디");
        product7.setCategory(4);
        product7.setPrice(5000);

        Product product8 = new Product();
        product8.setNumber(8);
        product8.setName("커피콩빵");
        product8.setCategory(5);
        product8.setPrice(3000);

        Product product9 = new Product();
        product9.setNumber(9);
        product9.setName("바나나라떼");
        product9.setCategory(1);
        product9.setPrice(5000);

        Product product10 = new Product();
        product10.setNumber(10);
        product10.setName("매실차");
        product10.setCategory(6);
        product10.setPrice(4500);

        Product product11 = new Product();
        product11.setNumber(11);
        product11.setName("깔라만시");
        product11.setCategory(6);
        product11.setPrice(4500);

        Product product12 = new Product();
        product12.setNumber(12);
        product12.setName("카페라떼");
        product12.setCategory(1);
        product12.setPrice(4000);

        Product product13 = new Product();
        product13.setNumber(13);
        product13.setName("헤이즐넛라떼");
        product13.setCategory(1);
        product13.setPrice(5000);

        Product product14 = new Product();
        product14.setNumber(14);
        product14.setName("카라멜마끼야또");
        product14.setCategory(1);
        product14.setPrice(5000);

        Product product15 = new Product();
        product15.setNumber(15);
        product15.setName("아메리카노");
        product15.setCategory(1);
        product15.setPrice(4000);

        Product product16 = new Product();
        product16.setNumber(16);
        product16.setName("캐모마일");
        product16.setCategory(6);
        product16.setPrice(4500);

        Product product17 = new Product();
        product17.setNumber(17);
        product17.setName("아포가토");
        product17.setCategory(3);
        product17.setPrice(5500);

        Product product18 = new Product();
        product18.setNumber(18);
        product18.setName("비엔나커피");
        product18.setCategory(1);
        product18.setPrice(5000);

        Product product19 = new Product();
        product19.setNumber(19);
        product19.setName("베이글");
        product19.setCategory(5);
        product19.setPrice(3500);

        Product product20 = new Product();
        product20.setNumber(20);
        product20.setName("카푸치노");
        product20.setCategory(1);
        product20.setPrice(4000);

        Product product21 = new Product();
        product21.setNumber(21);
        product21.setName("허니브레드");
        product21.setCategory(5);
        product21.setPrice(6000);

        Product product22 = new Product();
        product22.setNumber(22);
        product22.setName("카페모카");
        product22.setCategory(1);
        product22.setPrice(5000);

        Product product23 = new Product();
        product23.setNumber(23);
        product23.setName("얼그레이");
        product23.setCategory(6);
        product23.setPrice(4500);

        Product product24 = new Product();
        product24.setNumber(24);
        product24.setName("히비아이스트");
        product24.setCategory(3);
        product24.setPrice(5000);

        Product product25 = new Product();
        product25.setNumber(25);
        product25.setName("플레인 와플");
        product25.setCategory(5);
        product25.setPrice(6000);

        Product product26 = new Product();
        product26.setNumber(26);
        product26.setName("요거트");
        product26.setCategory(3);
        product26.setPrice(5500);

        Product product27 = new Product();
        product27.setNumber(27);
        product27.setName("유자 스무디");
        product27.setCategory(4);
        product27.setPrice(5000);

        Product product28 = new Product();
        product28.setNumber(28);
        product28.setName("딸기 스무디");
        product28.setCategory(4);
        product28.setPrice(5000);

        Product[] products = new Product[29];
        products[0] = product;
        products[2] = product2;
        products[3] = product3;
        products[4] = product4;
        products[5] = product5;
        products[6] = product6;
        products[7] = product7;
        products[8] = product8;
        products[9] = product9;
        products[10] = product10;
        products[11] = product11;
        products[12] = product12;
        products[13] = product13;
        products[14] = product14;
        products[15] = product15;
        products[16] = product16;
        products[17] = product17;
        products[18] = product18;
        products[19] = product19;
        products[20] = product20;
        products[21] = product21;
        products[22] = product22;
        products[23] = product23;
        products[24] = product24;
        products[25] = product25;
        products[26] = product26;
        products[27] = product27;
        products[28] = product28;
        System.out.println();

        printProduct(products);
    }

    public static void printProduct(Product[] products) {
        System.out.println("상품번호       상품명        카테고리번호       판매단가");
        for (Product p : products) {
            if (p != null) {
                System.out.println(p.getNumber() + "       " + p.getName() + "        " + p.getCategory() + "             " + p.getPrice());
            }
        }
    }

}
