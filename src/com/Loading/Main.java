package com.Loading;

public class Main {
    int num1,num2;
    void add() {
        int sum = num1 + num2;
        System.out.println(sum);
    }
    void sub(){
        int subt=num2-num1;
        System.out.println(subt);
    }
    void mult(){
        int result=num1*num2;
        System.out.println(result);
    }

    public static void main(String[] args) {

        Main b1=new Main();
        b1.num1=4;
        b1.num2=3;
        b1.add();
        b1.sub();
        b1.mult();    }
}
