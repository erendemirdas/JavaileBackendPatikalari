import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {
        double fiyat , kdvOran1 = 0.18 , kdvOran2 = 0.08 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        fiyat = inp.nextDouble();

        double kdvTutari = fiyat >= 1000 ? (fiyat * kdvOran2) : (fiyat * kdvOran1);
        double kdvliFiyat = fiyat >= 1000 ? ((fiyat * kdvOran2) + fiyat) : ((fiyat * kdvOran1) + fiyat);

        System.out.println("KDV\'siz Fiyat : " + fiyat);
        System.out.println("KDV\'li Fiyat = " + kdvliFiyat);
        System.out.println("KDV tutarı = " + kdvTutari);

    }
}
