package org.example;

public class ex4 {
    public static void main(String[] args) {
        자동차5 a자동차1 = new 자동차5();
        a자동차1.번호 =1;
        a자동차1.최고속력 =230;
        a자동차1.달리다();

        자동차5 a자동차2 = new 자동차5();
        a자동차2.번호 = 2;
        a자동차2.최고속력 = 210;
        a자동차2.달리다();
    }
}

class 자동차5{
    int 번호;
    int 최고속력;

    void 달리다(){
        System.out.println(번호 + "번 자동차가 최고속력 " + 최고속력 + "km로 달립니다.");
    }
}