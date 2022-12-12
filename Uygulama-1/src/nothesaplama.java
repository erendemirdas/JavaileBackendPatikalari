import java.util.Scanner;
public class nothesaplama {

    public static void main(String[] args){
        int mat,fzk,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fzk = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzük notunuzu giriniz : ");
        muzik = inp.nextInt();

        double ortalama = (mat + fzk + kimya + turkce + tarih + muzik) / 6.0 ;
        String sonuc = ortalama >= 60 ? "Sınıfı geçtiniz !" : "Sınıfta kaldınız !";

        System.out.println("Ders ortalamanız : " + ortalama);        System.out.println("Başarı durumunuz : " + sonuc);




    }

}
