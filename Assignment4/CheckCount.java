public class CheckCount {
    public static void main(String[] args) {
        String str = "Hello, how are you?";
        int vowelcount=0,consonantcount=0,spechar=0;
        for (int i=0;i<str.length();i++){
            if ((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')){
                String st = str.toLowerCase();
                if (st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i'|| st.charAt(i)=='o' || st.charAt(i)=='u'){
                    vowelcount++;
                }else {
                    consonantcount++;
                }
            }else {
                spechar++;
            }
        }
        System.out.println("No. of vowels are "+vowelcount);
        System.out.println("No. of consonants are "+consonantcount);
        System.out.println("No. of Special characters are "+spechar);
    }
}
