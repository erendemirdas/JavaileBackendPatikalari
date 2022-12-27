import java.util.Scanner;
public class maxMinSayiBulma {
    public static void main(String[] args) {
        int sayi, n , buyuk = 0 , kucuk = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz ? : ");
        sayi = inp.nextInt();

        for(int i = 1 ; i <= sayi ; i++ ){
            System.out.print(i + ". Sayıyı Giriniz = ");
            n = inp.nextInt();
            if (n > buyuk){
                buyuk = n;
            }else if (n < kucuk){
                kucuk = n ;
            }

        }
        System.out.println("En büyük sayı = " + buyuk);
        System.out.println("En küçük sayı = " + kucuk);
    }
}