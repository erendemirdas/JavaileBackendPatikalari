import java.util.Scanner;
public class harmonikSeri {
    public static void main(String[] args) {
        int n ;
        double resault = 0.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        for (int i = 1 ; i <= n ; i++){
            resault += (1.0/i);
            }
        System.out.println(resault);
    }
}
