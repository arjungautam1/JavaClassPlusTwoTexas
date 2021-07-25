package finaldemo;

public class FinalDemo {
    public static void main(String[] args) {
        final int i=10;

        //i=11 : we can't redeclare the variable if final keyword is used
        System.out.println(i);
    }
}
