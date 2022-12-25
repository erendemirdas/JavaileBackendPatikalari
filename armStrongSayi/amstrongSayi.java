import java.util.Scanner;
public class amstrongSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int number = inp.nextInt();
        int numberCounter = 0 , tempNumber = number ;
        int basValue;
        int resault = 0;
        int basPow ;

      while (tempNumber != 0){
           tempNumber /= 10;
           numberCounter++ ;
       }
      tempNumber = number ;
      while (tempNumber != 0){
          basValue = tempNumber % 10;
          basPow = 1;
          for (int i = 1 ; i <= numberCounter ; i++ ){
              basPow *= basValue;
          }
          resault += basPow;
          tempNumber /= 10 ;
      }
        if (resault == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }
    }
}