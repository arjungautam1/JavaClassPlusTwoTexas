package oop.methodoverload;

class Adder{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}

public class DataTypeDemo {
    public static void main(String[] args) {
        Adder adder=new Adder();
        int a=adder.add(10,20);
        double b=adder.add(10,10);
        System.out.println(a);
        System.out.println(b);

    }
}
