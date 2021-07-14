package if_statement;

public class OddEven {
    //odd numbers: 1,3,5,7
    //even numbers: 2,4,6,8,10
    public static void main(String[] args) {

        int number =11;

        // == comparison operator

        if(number%2==0){
            System.out.println("Number is even.");
        }
        else {
            System.out.println("Number is odd.");
        }
    }
}
