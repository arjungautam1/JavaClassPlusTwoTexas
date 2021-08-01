package linkedintest;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Hello World");
        }
        catch (Exception e){
            System.out.println("e");
        }
       /* catch (ArithmeticException e){
            System.out.println("e");
        }*/
        //Compile time error
        finally {
            System.out.println("i");
        }
    }
}
