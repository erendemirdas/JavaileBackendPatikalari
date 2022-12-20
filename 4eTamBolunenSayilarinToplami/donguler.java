import java.util.Scanner;
public class donguler {
    public static void main(String[] args) {
        int a , toplam = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            a = scan.nextInt();
            if  (a % 4 == 0){
                toplam += a;
            }

        }while (a % 2 == 0);

        System.out.println("Toplam = " + toplam);
    }
}