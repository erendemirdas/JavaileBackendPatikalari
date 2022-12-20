import java.util.Scanner;
public class donguler {
    public static void main(String[] args) {
       int a , b=0 , c= 0;
       Scanner inp = new Scanner(System.in);
       System.out.print("Sınır sayısını giriniz : ");
       a = inp.nextInt();
       for (int i = 1 ; i <= a ; i *= 4 ){
           System.out.println(i + "\t = 4'ün "+ b + ". Kuvveti");
           b++;
       }
        System.out.println();
        for (int n = 1 ; n <= a ; n *= 5){
            System.out.println(n + "\t = 5'in "+ c + ". Kuvveti");
            c++;
        }
    }
}