import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sayı Tahmin Etme Oyununa Hoşgeldiniz !");
        Scanner inp = new Scanner(System.in);
        int[] wrong = new int[5];
        int number = (int)(Math.random() * 100);
        int a , right = 0 ;
        boolean isWin = false , isWrong = false ;
        System.out.println(number);

            while (right != 5){
            System.out.print("Tahmininizi giriniz : ");
            a = inp.nextInt();

                if (a < 0 || a > 99){
                    System.out.println("Hatalı giriş yaptınız !! Lütfen 0-100 arası bir sayı giriniz.");
                    if (!isWrong){
                        isWrong = true;
                        System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir !!");
                    }else {
                        System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak = " + (5 - ++right));
                    }
                    continue;
                }

                if (number == a){
                    System.out.println("\n"+"Doğru tahmin ettiniz. Tahmin ettiğiniz sayı : " + a);
                    isWin = true;
                    break;
                }else {
                    wrong[right++] = a ;
                    System.out.println("Yanlış tahmin ettiniz , kalan hak = " + (5 - right));
                    if (right != 5) {
                        if (a > number) {
                            System.out.println("Girdiğiniz sayı gizli sayıdan büyük.");
                        } else {
                            System.out.println("Girdiğiniz sayı gizli sayıdan küçük.");
                        }
                    }
                }
            }

        if (!isWin){
            System.out.println("\n"+"Kaybettiniz ! Doğru cevap = " + number);
            System.out.println("Girdiğiniz sayılar = " + Arrays.toString(wrong));
        }
    }
}