import java.util.Arrays;

public class Que6 {
       public static void main(String[] args) {

       int[] arr ={23,12,4,3,5,6,3,2,9,10,11,35};
        int[] arr2 ={4,3,11,10};
        Arrays.sort(arr);
        int m = arr.length;
        int n = arr2.length;


//        1st Approach.
        int cnt=0;
        for (int i =0;i<arr2.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr2[i]==arr[j]){
                    cnt++;
                }
            }
        }
        if (cnt >= arr2.length){
            System.out.println("arr2 is subset of arr.");
        }else{
            System.out.println("2nd array is not subset of the the first array.");
        }



//        2nd Approach (Using sortiong and binarysearch).


        if (issubset(arr,arr2,m,n)){
            System.out.println("Array2 is subset of Arry1.");
        }else {
            System.out.println("Array2 is not subset of Array1.");
        }
    }
    public static boolean issubset(int[] arr,int[] arr2,int m,int n){
        for(int i=0;i<n;i++){
            if(binarySearch(arr,0,m-1,arr2[i]) == -1){
                return false;
            }
        }
        return true;
    }
    public static int binarySearch(int[] arr,int l, int h,int x){
           if (h>=l){
               int mid = (l+h)/2;
               if(arr[mid]== x){
                   return mid;
               } else if (x>arr[mid]) {
                   return binarySearch(arr,mid+1,h,x);
               }else if (x<arr[mid]){
                   return binarySearch(arr,l,mid-1,x);
               }
           }
           return -1;
    }

}
