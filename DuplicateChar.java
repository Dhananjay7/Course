import java.util.HashSet;

public class DuplicateChar {
    public static void approach1(String s1){
        for (int i=0;i<s1.length();i++){
            for (int j=i+1;j<s1.length();j++){
                if ((s1.charAt(i)==s1.charAt(j)) && i!=j ) {
                    System.out.println(s1.charAt(j));
                    break;
                }
            }
        }
    }
    public static void approach2(StringBuffer s2){
        HashSet<Character> container = new HashSet<>(s2.length());

        for (int i=0;i<s2.length();i++){
            if (container.add(s2.charAt(i))){
                s2.deleteCharAt(i);
                i-=1;
            }
        }
        System.out.println(s2);
    }
    public static void main(String[] args) {
        String s = "HelloWorld";
        StringBuffer s2 =new StringBuffer("HelloWorld");
//        approach1(s);
        approach2(s2);

    }
}
