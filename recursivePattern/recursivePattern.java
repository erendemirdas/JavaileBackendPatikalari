import java.util.Scanner;
public class recursivePattern {
    static int f(int a , int b, int c, int d ){
        if(0 < a){
            System.out.print(a + " ");
            return  f(a - 5 , b -5 , c , d + 1);
        }
        if ( d != c ){
            System.out.print(b + " ");
            return f(a , b + 5, c + 1 , d );
        }
        return b;
    }
    public static void main(String[] args) {
        int a ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        a = inp.nextInt();

        System.out.println(f(a , a , 0 , 0));
    }
}