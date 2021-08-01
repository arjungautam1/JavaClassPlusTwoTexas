package linkedintest;

public class SubStringDemo {
    public static void main(String[] args) {
      /*  String fruit="strawberries";
        System.out.println(fruit.substring(2,5));*/
        String message="Hello World!";
        String newMessage=message.substring(6,12)+message.substring(12,6);
        System.out.println(newMessage);
    }
}
