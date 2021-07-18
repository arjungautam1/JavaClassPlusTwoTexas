package array;

public class ArrayLecture {
    public static void main(String[] args) {

        //declaration
//        int[] arr;
        //initialize
//        arr=new int[5];

        //combine
        int[] arr=new int[5];

        arr[0]=5;
        arr[1]=1;
        arr[2]=3;
        arr[3]=4;
        arr[4]=8;

//        int[] numbers={1,4,2,3,45,23,67};

        System.out.println("Length of array"+arr.length);

//        for each
        for (int number:arr) {
            System.out.println(number);
        }

//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }






    }
}
