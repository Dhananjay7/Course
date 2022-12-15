public class MergeSort {


    public static void Merge(int[] arr,int l, int mid, int r){

        int i =l;
        int j= mid+1;
        int k = l;
//        Do modification in b array.
        int[] b = new int[arr.length];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
            }else{
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while (j<=r){
                b[k]=arr[j];
                j++;
                k++;
            }
        }else {
            while (i<=mid){
                b[k]=arr[i];
                k++;
                i++;
            }
        }
//        copy contents of b into arr.
        for (k=l;k<=r;k++){
            arr[k]=b[k];
        }
    }
    public static void MergeSort(int[] ar, int l,int r){
        if(l<r){
            int mid = (l+r)/2;
//            System.out.println(mid);
            MergeSort(ar,l,mid);
            MergeSort(ar,mid+1,r);
            Merge(ar,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,3,8,5,7,2,9,6,1,10,4,11};
        MergeSort(arr,0,arr.length-1);
        for(int ele: arr){
            System.out.println(ele);
        }
    }
}
