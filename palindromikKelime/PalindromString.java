import java.util.Scanner;

public class PalindromString {
    static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length()-1;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++ ;
            j-- ;
        }
        return true;
    }
    public static void main(String[] args) {
        String a ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Palindromik Kelime Sorgulama Programına Hoşgeldiniz");
        System.out.print("Sorgulamak istediğiniz kelimeyi yazınız : ");
        a = inp.nextLine();

        if(isPalindrom(a)){
            System.out.println("\""+ a +"\" Palindromik bir kelimedir.");
        }else {
            System.out.println("\"" + a + "\" Palindromik bir kelime değildir.");
        }
    }
}