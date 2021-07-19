package oop.methodoverload;

class Calculate{
    //parameterized value
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculate calculate=new Calculate();
        int result=calculate.add(10,20);
        int result1=calculate.add(10,20,30);
        System.out.println(result);
        System.out.println(result1);


    }
}
