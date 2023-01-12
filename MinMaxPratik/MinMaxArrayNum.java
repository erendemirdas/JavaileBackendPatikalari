import java.util.Scanner;
import java.util.Arrays;
public class MinMaxArrayNum {
    public static void main(String[] args) {
        int a;
        System.out.println("Dizi : " + "{15,12,788,1,-1,-778,2}");
        Scanner inp = new Scanner(System.in);
        System.out.print("Girilen sayı : ");
        a = inp.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,a};
        Arrays.sort(list);
        int index = Arrays.binarySearch(list, a);

        if (index == list.length-1){
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[index-1]);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + "Girdiğiniz sayı dizedeki sayılardan daha büyüktür !") ;
        }else if (index == 0){
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + "Girdiğiniz sayı dizedeki sayılardan daha küçüktür !");
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[index+1]) ;
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[index-1]);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[index+1]) ;
        }
    }
}