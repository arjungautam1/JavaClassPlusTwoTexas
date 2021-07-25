package finaldemo;

//If we declare class with final keyword we can't
//extend the class or use inheritance
final class Bank{
    final int interest(){
     return 0;
    }
}

class NMB extends Bank{

    //we can't override if we define method with
    //final keyword
  /*  int interest(){
        return 8;
    }*/
}
public class FinalMethod {

}
