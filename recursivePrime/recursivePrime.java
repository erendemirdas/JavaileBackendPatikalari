import java.util.Scanner;
public class recursiveAsal {
    static String isAsal(int a,int b) {
        String isTrue = " sayısı ASALDIR." , isFalse = " sayısı ASAL değildir.";
        if (b <= a) {
            if (a != b) {
                if (a % b == 0) {
                    System.out.print(a);
                    return isFalse;
                }else return isAsal(a, b + 1);
            }else {
                System.out.print(a); return isTrue;
            }
        }else {
            System.out.print(a); return isFalse;
        }
    }
    public static void main(String[] args) {
        int a ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        a = inp.nextInt();
        System.out.println(isAsal(a , 2));
    }
}