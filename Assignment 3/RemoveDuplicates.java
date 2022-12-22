import java.util.HashSet;

public class RemoveDuplicates {
    public static void approach1(StringBuffer sb){
//        1st Approach
//        time-complexity O(n^2)

        for (int i=0;i<sb.length();i++){
            for (int j=i+1;j<sb.length();j++){
                if ((sb.charAt(i) == sb.charAt(j)) && i!=j){
                    sb.deleteCharAt(j);
                }
            }
        }
        System.out.println(sb);
    }

    public static void approach2(StringBuffer sb){
//        2nd Approach using set.
//        time-complexity O(n) and space complxity O(n)

        HashSet <Character> charset = new HashSet<>(sb.length());
        for (int i=0;i<sb.length();i++){
            charset.add(sb.charAt(i));
        }
        for (char s : charset){
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer s1 = new StringBuffer("Google");
        approach1(sb);
        approach2(s1);
    }
}
