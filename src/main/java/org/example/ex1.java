package org.example;

public class ex1 {
    public static void main(String[] args) {
        자동차1 Car1 = new 자동차1();

        Car1.cars();
        Car1.cars();
        Car1.cars();
    }
}
class 자동차1 {
    void cars(){
        System.out.println("자동차가 달린다.");
    }
}