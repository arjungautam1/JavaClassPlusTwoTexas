package oop.methodoverload;

class Calculate{
    //parameterized value
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a-b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculate calculate=new Calculate();
        calculate.add(10,20);
        calculate.add(10,20,30);


    }
}
