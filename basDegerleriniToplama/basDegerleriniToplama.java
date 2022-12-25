import java.util.Scanner;
public class amstrongSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int number = inp.nextInt();
        int basValue;
        int resault = 0;

        int tempNumber = number ;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            resault += basValue;
            tempNumber /= 10 ;
        }
        System.out.println( number + " sayısının basamak değerlerinin toplamı = " + resault);
    }
}