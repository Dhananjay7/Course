//WAP to implement Pangram Checking with the least inbuilt methods being used

import java.util.Scanner;

public class CheckPanagram {


    public static boolean checkPn(String str){
    boolean[] check = new boolean[26];
    int index;
    for (int i=0;i<str.length();i++){
        if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
            index = str.charAt(i)-65;
            check[index]=true;
        }else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            index = str.charAt(i) - 97;
            check[index]=true;
        }
    }
        for (boolean b : check) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instr = sc.nextLine();
        if (checkPn(instr)){
            System.out.println(instr+" is panagram");
        }else {
            System.out.println(instr+" it's not panagram");
        }
        sc.close();
    }
}
