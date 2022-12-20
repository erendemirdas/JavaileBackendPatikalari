import java.util.Scanner;
public class donguler {
    public static void main(String[] args) {
        int a , i=1 , b = 0 , k =0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        a = inp.nextInt();

        while (i <= a ){
            if( i % 3 == 0 && i % 4 ==0) {
                System.out.println(i);
                b++;
                k += i;
            }
            i++;
        }
        System.out.println("Girilen sayıya kadar 3'e ve 4'e tam bölünen sayıların ortalaması = " + k / b);
    }
}
