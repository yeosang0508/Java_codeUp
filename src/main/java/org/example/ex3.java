package org.example;
// 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
public class ex3 {
    public static void main(String[] args) {
        자동차3 cars1 = new 자동차3();
        cars1.최고속력 = 230;
        cars1.달리다();

        자동차3 cars2 = new 자동차3();
        cars2.최고속력 = 210;
        cars2.달리다();

    }
}
class 자동차3 {
    int 최고속력;
    void 달리다() {
        System.out.println("자동차가 최고속력 " + 최고속력 + "km로 달립니다.");
    }
}
