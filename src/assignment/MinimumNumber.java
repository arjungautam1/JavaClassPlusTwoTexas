package assignment;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr={4,3,5,8,1,7};

        //3<4
        //min=3

        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minumum number is :"+min);


    }
}
