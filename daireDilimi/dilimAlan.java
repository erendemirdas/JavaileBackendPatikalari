import java.util.Scanner;

public class dilimAlan {
    public static void main(String[] args) {
        int r , a ;
        double pi = 3.14 , alan;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        System.out.print("Dairenin merkez açı ölcüsünü giriniz : ");
        a = inp.nextInt();

        alan = (pi*(r*r)*a)/360 ;

        System.out.println("Merkez açı ölçüsü " +a+ " yarı çapı " +r+ " olan daire diliminin alanı : " + alan);





    }
}
