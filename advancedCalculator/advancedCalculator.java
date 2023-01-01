import java.util.Scanner;
public class advancedCalculator {
    static int toplama(int a, int b){
        int result = a + b;
        return result;
    }
    static int cikarma(int a, int b){
        int result = a - b ;
        return result;
    }
    static int carpma(int a, int b) {
        int result = a * b;
        return result;
    }
    static int bolme(int a , int b) {
        int result = a / b ;
        return result;
    }
    static int faktoriyel(int a){
        int result = 1 ;
        for (int i = 1 ; i <= a ; i++){
            result *= i ;
        }
        return result;
    }
    static int uslu(int a, int b){
        int result = 1 ;
        for(int i = 1 ; i <= b ; i++){
            result *= a ;
        }
        return result;
    }
    static int mod(int a ,int b){
        int result = a % b ;
        return result;
    }
    static void dikdortgen(int a , int b){
        System.out.println("Çevre = " + (2 * (a + b)));
        System.out.println("Alan = " + (a*b));
    }
    public static void main(String[] args) {
        int n , a ,b ;
        Scanner inp = new Scanner(System.in);
        String menu = """
                1- Toplama
                2- Çıkarma
                3- Çarpma
                4- Bölme
                5- Üslü Sayı Hesaplama
                6- Faktöriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Çevre ve Alan Hesaplama
                0- Çıkış yap
                """;

        System.out.println(menu);
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        n = inp.nextInt();

       while (n != 0){
           if (n >= 1 && n <= 8){
               if (n == 6){
                   System.out.print("Kaç faktoriyeli hesaplayacaksınız ? = ");
                   a = inp.nextInt();
                   b=1;
               }else {
                   System.out.print("İlk sayıyı giriniz = ");
                   a = inp.nextInt();
                   System.out.print("İkinci sayıyı giriniz = ");
                   b = inp.nextInt();
               }

               switch (n){
                   case 1 :
                       System.out.println("Sonuç = " + toplama(a,b));
                       break;
                   case 2 :
                       System.out.println("Sonuç = " + cikarma(a,b));
                       break;
                   case 3 :
                       System.out.println("Sonuç = " + carpma(a,b));
                       break;
                   case 4 :
                       if (b != 0) {
                       System.out.println("Sonuç = " + bolme(a,b));
                       } else {
                           System.out.println("İkinci sayı sıfırdan farklı olmalı !");
                       }break;
                   case 5 :
                       System.out.println("Sonuç = " + uslu(a,b));
                       break;
                   case 6 :
                       System.out.println("Sonuç = " + faktoriyel(a));
                       break;
                   case 7 :
                       System.out.println("Sonuç = " + mod(a,b));
                       break;
                   case 8 :
                       dikdortgen(a,b);
                       break;
                   default:
               }
           }else {
               System.out.println("Hatalı giriş yaptınız lütfen tekrar deneyin !");
           }
           System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz : ");
           n = inp.nextInt();
       }
        System.out.println("Görüşmek üzere !");
    }
}