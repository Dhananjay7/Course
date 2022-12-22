import java.util.HashMap;

public class MaxFrequency {

    public static void usingNestedForLoop(char[] c){
        int maxCount=0;
        int count;
        int index =0;
        for (int i=0;i<c.length;i++){
            count=0;
            for (int j=i+1;j<c.length-1;j++){
                if (c[i] == c[j]){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount = count;
                index = i;
            }
            i+=count;
        }
        System.out.println("Max occuring character is "+c[index]+" ["+(maxCount+1)+" times occured]");
    }


    public static void usingHashmap(String str){
        HashMap <Character,Integer> charmap = new HashMap<>();
        for (int i =0;i<str.length();i++){
           if (charmap.containsKey(str.charAt(i))){
               charmap.put(str.charAt(i), charmap.get(str.charAt(i))+1);
           }else {
               charmap.put(str.charAt(i),1);
           }
        }
        char maxChar =str.charAt(0);
        for (Character key : charmap.keySet()){
            if (charmap.get(key) > charmap.get(maxChar)){
                maxChar = key;
            }
        }
        System.out.println("The maximum occuring character is "+maxChar+" occured "+charmap.get(maxChar)+" times");
    }


    public static void main(String[] args) {
        String  s1 = "aabbcd";
        usingNestedForLoop(s1.toCharArray());
        usingHashmap(s1);
    }
}
