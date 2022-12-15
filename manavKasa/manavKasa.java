import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlican=5.00 , toplam ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armmut Kaç Kilo ? : ");
        armut *= inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elma *= inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domates *= inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muz *= inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican *= inp.nextDouble();

        toplam = armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar = " + toplam + " TL");


    }
}
