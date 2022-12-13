import java.util.Scanner;
public class ucgenAlanHesaplama {
    public static void main(String[] args) {
        int a , b , c ;
        double u , cevre, alan ;

        Scanner input = new Scanner(System.in);
        System.out.print("A kenar uzunluğunu giriniz : ");
        a = input.nextInt();

        System.out.print("B kenar uzunluğunu giriniz : ");
        b = input.nextInt();

        System.out.print("C kenar uzunluğunu giriniz : ");
        c = input.nextInt();

        u = (a+b+c) / 2 ;
        cevre = u * 2 ;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin çevresi = " + cevre);
        System.out.println("Üçgenin alanı = " + alan);

    }
}
