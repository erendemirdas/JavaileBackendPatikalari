import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int n, r, nFaktoriyel = 1 , rFaktoriyel = 1 , kombinasyon , nEksiR , sonuc=1;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplama");
        System.out.print("Eleman sayısını giriniz (n) : ");
        n = inp.nextInt();

        System.out.print("Seçim sayısını giriniz (r) : ");
        r = inp.nextInt();

        nEksiR = n - r ;

        for (int i = 1 ; i <= n ; i++){
            nFaktoriyel = nFaktoriyel * i ;
        }
        for(int k = 1 ; k <= r ; k++){
            rFaktoriyel = rFaktoriyel * k;
        }

        for(int c = 1 ; c <= nEksiR ; c++){
            sonuc = sonuc * c ;
        }

        kombinasyon = nFaktoriyel / ((rFaktoriyel)*(sonuc));
        System.out.println("C("+n+","+r+") = "+ kombinasyon);
    }
}