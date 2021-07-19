package assignment;
public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr={4,3,5,8,1,7};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number is :"+max);


    }
}

