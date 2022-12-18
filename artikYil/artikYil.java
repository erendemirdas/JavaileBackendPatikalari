import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        int yil , mod1 , mod2 ,mod3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();

        mod1 = yil % 4 ;
        mod2 = yil % 100;
        mod3 = yil % 400;

        if (yil >= 0){
            if (mod2==0){
                if (mod3==0){
                    System.out.println(yil + " bir artık yıldır !");
                }else {
                    System.out.println(yil + " bir artık yıl değildir !");
                }
            }else if(mod1 == 0){
                System.out.println(yil + " bir artık yıldır !");
            }else {
                System.out.println(yil + " bir artık yıl değildir !");
            }
        }else {
            System.out.println("Yanlış bir değer girdiniz !");
        }
    }
}
