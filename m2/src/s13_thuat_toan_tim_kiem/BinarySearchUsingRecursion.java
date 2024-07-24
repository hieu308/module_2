package s13_thuat_toan_tim_kiem;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,0,arr.length-1,6));

    }
    public static int binarySearch(int[] arr,int minIndex,int maxIndex,int value){
        if(minIndex > maxIndex){
            return -1;
        }
        int midIndex = (maxIndex + minIndex) / 2;
        if(arr[midIndex] == value){
            return midIndex;
        }else if(value < arr[midIndex]){
            return binarySearch(arr,minIndex,midIndex-1,value);
        }else {
            return binarySearch(arr,midIndex+1,maxIndex,value);
        }
    }
}
