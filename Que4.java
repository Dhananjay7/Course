public class Que4 {
    public static void main(String[] args) {
        int n=8;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                   System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                if ((i==8 && j==8) || (i==8 && j==7)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
