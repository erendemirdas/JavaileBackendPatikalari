import java.util.Scanner;
public class kucuktenBuyuge {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen A sayısını giriniz :");
        a = inp.nextInt();
        System.out.print("Lütfen B sayısını giriniz : ");
        b = inp.nextInt();
        System.out.print("Lütfen C sayısını giriniz :");
        c= inp.nextInt();

        if (a > b && a > c){
            if (b>c) {
                System.out.println("C < B < A");
            }else {
                System.out.println("B < C < A");
            }
        }else if (b > c){
            if (a > c){
                System.out.println("C < A < B");
            }else {
                System.out.print("A < C < B");
            }
        }else{
            if (a > b) {
                System.out.println("B < A < C");
            }else {
                System.out.println("A < B < C");
            }
        }
    }
}
