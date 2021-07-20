package oop.class_obj;

class Calculate{
    //parameterized value
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculate calculate=new Calculate();
        int addition_result=calculate.add(10,20);
        int sub_result=calculate.subtract(20,5);
        System.out.println(addition_result);
        System.out.println(sub_result);
    }
}
