import java.util.Scanner;
public class sinifBasarisi {
    public static void main(String[] args) {
        double mat, fzk,turk,kim,muz, notlar= 0, dersSayisi = 0;

        Scanner inp = new Scanner(System.in);

        // ****** Lesson grade ******

        System.out.print("Matematik notunuz : ");
        mat = inp.nextDouble();
        if (mat >= 0 && mat <= 100){
            dersSayisi += 1;
            notlar += mat;
        }else {
            dersSayisi += 0;
            notlar += 0;
        }

        System.out.print("Fizik notunuz : ");
        fzk = inp.nextDouble();
        if (fzk >= 0 && fzk <= 100){
            dersSayisi += 1;
            notlar += fzk;
        }else {
            dersSayisi += 0;
            notlar += 0;
        }

        System.out.print("Türkçe notunuz : ");
        turk = inp.nextDouble();
        if (turk >= 0 && turk <= 100){
            dersSayisi += 1;
                notlar += turk;
        }else {
            dersSayisi += 0;
            notlar += 0;
        }

        System.out.print("Kimya notunuz : ");
        kim = inp.nextDouble();
        if (kim >= 0 && kim <= 100){
            dersSayisi += 1;
            notlar += kim;
        }else {
            dersSayisi += 0;
            notlar += 20;
        }

        System.out.print("Müzik notunuz : ");
        muz = inp.nextDouble();
        if (muz >= 0 && muz <= 100){
            dersSayisi += 1;
            notlar += muz;
        }else {
            dersSayisi += 0;
            notlar += 0;
        }

        // ****** AVARAGE ******
        double avarage = notlar / dersSayisi ;
        System.out.println("Ortalamanız = " + avarage);

        if (avarage >=0 && avarage <=100 ){
            if (avarage < 55){
                System.out.println("Sınıfta KALDINIZ , seneye görüşmek üzere :)");
            }else {
                System.out.println("Sınıfı GEÇTİNİZ !");
            }
        }else {
            System.out.println("GİRDİĞİNİZ NOTLAR GEÇERSİZ !!");
        }
    }
}
