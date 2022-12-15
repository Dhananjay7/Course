public class QuickSort {

    public static int Partiton(int [] arr, int l , int h){
        int pivot = arr[l];
        int i =l;
        int j = h;
        while (i<j){
            while (arr[i]<pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = pivot;
        arr[i] = temp;
        return j;
    }
    public static void QuickSort(int[] arr,int l,int h){
        if (l<h){
            int pivotpos =Partiton(arr,l,h);
            QuickSort(arr,l,pivotpos-1);
            QuickSort(arr,pivotpos+1,h);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,7,9,6,1};
        QuickSort(arr,0,arr.length-1);
        for (int ele: arr){
            System.out.println(ele);
        }
    }
}
