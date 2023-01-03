import java.util.Scanner;
public class recursivePower {
    static int f(int a , int b ){
        if (b != 0){
            return  a * f(a , b - 1)  ;
        }else return 1;

    }
    public static void main(String[] args) {
        int sub , sup ;
        Scanner inp = new Scanner(System.in);
        System.out.println("+++ ÜS ALMA PROGRAMI +++");
        System.out.print("Taban değeri giriniz : ");
        sub = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        sup = inp.nextInt();

        System.out.println(f(sub,sup));

    }
}
