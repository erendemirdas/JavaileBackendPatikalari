import java.util.Scanner ;
public class hipotenusHesaplama {
    public static void main(String[] args) {
        int a , b ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Üçgenin a kenar uzunluğunu giriniz : ");
        a = inp.nextInt();
        System.out.print("Üçgenin b kenar uzunluğunu giriniz : ");
        b = inp.nextInt();

        double c = Math.sqrt((a*a) + (b*b)) ;
        System.out.println("Hipotenüs = " + c);




    }

}
