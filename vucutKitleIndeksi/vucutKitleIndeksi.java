import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        double boy , kilo , indeks ;
        //boolean normal , kilolu, zayif ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

        String normal = indeks >= 18.5 &&  indeks <= 25 ? ("KİLONUZ NORMAL") : ("KİLONUZ NORMAL DEĞİL : ") ;
        System.out.print(normal);

        String kilolu = indeks > 25 ? ("KİLOLU") : ("");
        String zayif =  indeks < 18.5 ? ("ZAYIF") : ("");

        System.out.print( kilolu + zayif );
        
    }
}
