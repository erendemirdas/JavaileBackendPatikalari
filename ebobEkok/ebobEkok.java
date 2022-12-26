import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1 , n2;
        do {
            System.out.print("n1 Sayısını giriniz : ");
            n1 = inp.nextInt();
            System.out.print("n2 Sayısını giriniz : ");
            n2 = inp.nextInt();

            if (n1 > 0 && n2 > 0) {
                int i = n1, ebob = 1;
                while (i >= 1) {
                    i--;
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                        break;
                    }
                }
                System.out.println("\n"+"Ebob = " + ebob);
                int ekok = (n1 * n2) / ebob;
                System.out.println("Ekok = " + ekok);
            }else {
                System.out.println("Lütfen girdiğiniz sayıların 0'dan büyük olduğuna emin olun !!!" + "\n");
            }
        }while (n1 <0 || n2 <0);
    }
}