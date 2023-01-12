import java.util.Scanner;
import java.util.Arrays;
public class ArrayOrder {
    public static void main(String[] args) {
        int a ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        a = inp.nextInt();

        int[] list = new int[a];

        for(int i = 0 , y = 1; i < list.length ; i++ , y++){
            System.out.print( y + ". Elemanı : ");
            a = inp.nextInt();
            list[i] = a ;
        }
        Arrays.sort(list);
        System.out.print("Sıralama : " + Arrays.toString(list));
    }
}