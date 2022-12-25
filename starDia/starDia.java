import java.util.Scanner;
public class starDia {
    public static void main(String[] args) {
        int n ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int a = 0; a < (n - i); a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * i) - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1 ; i >= 1 ; i--){
            for (int x = 0; x < (n - i); x++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * i) - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}