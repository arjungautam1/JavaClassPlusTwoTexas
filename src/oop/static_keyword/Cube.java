package oop.static_keyword;

public class Cube {
    static int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        System.out.println(Cube.cube(10));
    }
}
