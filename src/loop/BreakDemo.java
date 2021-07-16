package loop;

public class BreakDemo {
    public static void main(String[] args) {
        int i;
        for (i=0;i<=20;i++){
            if(i==10){
               continue;
            }
            System.out.println(i);
        }
    }
}
