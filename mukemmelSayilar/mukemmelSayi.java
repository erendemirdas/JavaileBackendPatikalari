import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        int n , toplam = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        for (int i = 1 ; i < n ; i++){
            if (n % i == 0){
                toplam += i ;
            }
        }
        if (toplam == n){
            System.out.println(n + " Mükemmel bir sayıdır.");
        }else {
            System.out.println(n + " Mükemmel bir sayı değildir.");
        }
    }
}