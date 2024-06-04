package org.example;

public class ex1_0604 {
    public static void main(String[] args) {
        계산기.더한결과를_화면에_출력(10, 20);
        // 출력 => 결과 : 30

        계산기.더한결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 70

        계산기.뺀결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 30

        계산기.뺀결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 3

        계산기.곱한결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 10
    }
}

class 계산기 {

    static int 더한결과를_화면에_출력(int a, int b){
        int add = a + b;
        System.out.println("결과 : " + add);
        return add;
    }

    static int 뺀결과를_화면에_출력(int a, int b){
        int sub = a - b;
        System.out.println("결과 : " + sub);
        return sub;
    }
    static int 곱한결과를_화면에_출력(int a, int b){
        int mul = a * b;
        System.out.println("결과 : " + mul);
        return mul;
    }
}
