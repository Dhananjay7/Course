public class Palindrome {
    public static void main(String[] args) {
        String s1 = "2552";
        int j=s1.length()-1;
        int i=0;
        int cnt =0;
        while (i<j){
            if (s1.charAt(i) == s1.charAt(j)){
                cnt++;
            }
            i++;
            j--;
        }
        if (cnt == (s1.length()/2)){
            System.out.println("2552 is palindrome string.");
        }
    }
}
