public class Que3 {
    public static void main(String[] args) {
        for (int i = 7; i >= 1; i--)
        {
            for (int j = 7; j >= 1+7-i; j--)
            {
                System.out.print("*");
            }

            for (int j= i*2 ; j < 7*2-1; j++)
            {
                System.out.print(" ");
            }

            for (int l = 1+6-i; l<=7; l++)
            {
                if (l==7 && i==7){
                    System.out.print("");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 14; j++) {
                if (j==0 || i==6 || j==13){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
