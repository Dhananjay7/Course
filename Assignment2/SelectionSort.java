public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {23,89,1,2,25,6,10};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int minvalue = arr[min];
            arr[min] = arr[i];
            arr[i] = minvalue;
        }
        for(int ele: arr){
            System.out.println(ele);
        }
    }
}
