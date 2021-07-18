package array;
//Program to find min number in array java
public class MinimumNumberArray {
    public static void main(String[] args) {
        int[] arr={3,5,1,2,6};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum No is:"+min);
    }
}
