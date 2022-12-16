import java.util.Scanner;
public class havayaGoreEtkinlik {
    public static void main(String[] args) {
        int hava ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Hava Sıcaklığını Giriniz :");
        hava = inp.nextInt();

        if (hava >= 5 && hava <= 15){
            System.out.println("Sinemaya gidebilirsin.");
        }else if (hava < 5){
            System.out.println("Kayak yapmaya gidebilirsin.");
        }

        if (hava >= 10 && hava <=25){
            System.out.println("Pikniğe gidebilirsin.");
        }else if (hava > 25){
            System.out.println("Yüzmeye Gidebilirsin");
        }
    }
}