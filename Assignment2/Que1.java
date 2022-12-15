import java.util.*;

//Que. WAP to find duplicates in the array.

public class Que1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3,4,5,6,7,8,8,9,10};

//        1st Approach using two for loops   time-complexity is O(n^2) and space is O(1).
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }


//        2nd Approach using Set data structure    time-complxity = O(n) and extra space of O(n)

            Set<Integer> Values = new HashSet<>();

            for (int ele : arr) {
                if (Values.add(ele) == false) {
                    System.out.println("The duplicate element is: " + ele);
                }
            }



//        3rd Approach using HashMap   time-complexity = O(2n) and extra space of O(n)
        HashMap<Integer,Integer> Values2 = new HashMap<>();
        int count =0;
        for (int ele:arr) {
            if (Values2.containsKey(ele) == false){
                    Values2.put(ele, count);
                }else{
                    Values2.put(ele,count+1);
                }
        }
             System.out.print(Values2);
        System.out.println("\nDuplicate values are: ");
        for(Map.Entry<Integer, Integer> en : Values2.entrySet()) {
            if(en.getValue()>0){
                System.out.print(en.getKey()+"  ");
                }
        }
    }
}
