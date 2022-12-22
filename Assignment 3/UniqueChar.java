import java.util.HashSet;

public class UniqueChar {

    public static void approachFirst(String s){
        s=s.replace(" ","");
        boolean flag = false;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length()-1;j++){
                if (s.charAt(i) == s.charAt(j)){
                    flag = false;
                    break;
                }else {
                    flag=true;
                }
            }
            if (!flag){
                break;
            }
        }
        if (flag){
            System.out.println(s+" contains all unique characters.");
        }else {
            System.out.println(s+" does not contains all unique characters.");
        }
    }

    public static void approachSecond(char[] s){
        HashSet <Character> chrset = new HashSet<>(s.length);
        for (char c : s){
            chrset.add(c);
        }
        if (chrset.size()==s.length){
            System.out.println("Given string contains all unique characters.");
        }else{
            System.out.println("Given String does not contain unique characters.");
        }
    }
    public static void main(String[] args) {
        String str ="abcdefghi";
        approachFirst(str);
        approachSecond(str.toCharArray());
    }
}
