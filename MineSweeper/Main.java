import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a , b;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("LÜTFEN OYNAMAK İSTEDİĞİNİZ MAP BÜYÜKLÜĞÜNÜ GİRİNİZ");
            System.out.println("ÖRNEK :  2x2 - 3x3 - 3x4 - 4x4 - A x B ...");
            System.out.print("A = ");
            a = inp.nextInt();
            System.out.print("B = ");
            b= inp.nextInt();
            if (a <= 1 || b <= 1){
                System.out.println("MAP BOYUTU 2 satır ve 2 sütundan daha küçük oluşturulamaz !!!" + "\n");
            }
        }while (a <= 1 || b <= 1);

        MineSweeper game = new MineSweeper(a , b);

        game.play();
    }
}