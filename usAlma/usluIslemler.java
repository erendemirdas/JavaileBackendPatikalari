import java.util.Scanner;
public class usluIslemler {
    public static void main(String[] args) {
        int n , k , sonuc = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen üs almak istediğiniz sayıyı girin : ");
        n = inp.nextInt();

        System.out.print("Lütfen üs sayısını girin : ");
        k = inp.nextInt();

        for (int i = 1 ; k >= i ; i++ ){
            sonuc *= n;
        }
        System.out.println("Sonuç = " + sonuc);
    }
}
