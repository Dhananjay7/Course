//WAP to implement Anagram Checking the least inbuilt methods being used.

import java.util.Arrays;

public class CheckAnagram {

    public static String  toLower(String s){
        char[] ct = s.toCharArray();
        String s1 = "";
        for (int i=0;i<ct.length;i++){
            if (ct[i]<'a'){
                ct[i]=(char) (ct[i]+32);
            }
            s1+=ct[i];
        }
        return s1;
    }

    public static void mergeSort(char[] ch, int l, int h){
        if (l<h){
            int mid = (l+h)/2;
            mergeSort(ch,l,mid);
            mergeSort(ch,mid+1,h);
            merge(ch,l,mid,h);
        }
    }
    public static void merge(char[] c,int l,int mid, int h){
     int i=l ,k = l;
     int j = mid+1;
     char[] ch1 = new char[c.length];
     while (i<=mid && j<=h){
         if (c[i]<c[j]){
             ch1[k] = c[i];
             i++;
         }else {
             ch1[k] = c[j];
             j++;
         }
         k++;
     }
     if (i>mid){
         while (j<=h){
             ch1[k]=c[j];
             j++;
             k++;
         }
     }else{
         while (i<=mid){
             ch1[k] = c[i];
             i++;
             k++;
         }
     }
     for (k=l;k<=h;k++){
         c[k]=ch1[k];
     }
    }


    public static void approachFirst(String s1, String s2){
        char [] c = s1.toCharArray();
        char [] c1 = s2.toCharArray();
        mergeSort(c1,0,c1.length-1);
        mergeSort(c,0,c.length-1);
        if (Arrays.equals(c,c1)){
            System.out.println("The given Strings are anagrams");
        }else{
            System.out.println("Strings are not anagram");
        }
    }




    public static void main(String[] args) {
    String s1 = "LISTEN";
    String s2 = "Silent";
    s1= toLower(s1);
    s2 = toLower(s2);
    approachFirst(s1,s2);

    }
}
