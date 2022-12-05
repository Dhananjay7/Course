public class Que5 {
    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if (i==1){
            }else{
                System.out.println();
            }
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 14; i++) {
            System.out.print("*");
        }
    }
}
