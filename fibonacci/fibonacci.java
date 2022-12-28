import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z ;
        int n ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi üretmek istersiniz ?");
        n = inp.nextInt();
        System.out.println(x);
        System.out.println(y);
        for (int i = 0 ; i <= n ; i++){
            z = x + y ;
            x = y ;
            y = z ;
            System.out.println(z);
        }
    }
}
