package org.example;

public class ex2 {
    public static void main(String[] args) {
        자동차2 cars_run = new 자동차2();

        cars_run.달리기1();
        cars_run.달리기2();
        cars_run.달리기3();
    }
}
class 자동차2 {
    void 달리기1(){
        System.out.println("자동차1이 달리다.");
    }

    void 달리기2(){
        System.out.println("자동차2가 달리다.");
    }

    void 달리기3(){
        System.out.println("자동차3이 달리다.");
    }
        }