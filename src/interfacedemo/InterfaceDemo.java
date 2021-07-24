package interfacedemo;

interface Printable {
    void print();

}

class PrintableImpl {
    void print() {
        System.out.println("Hello");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        PrintableImpl printable = new PrintableImpl();
        printable.print();

    }

}
