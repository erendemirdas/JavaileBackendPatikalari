import java.util.Arrays;
public class Harmon {
        static double f(int a){  /* "a" değerinin harmonik serisini buluyor */
        double num = 0;
        for (int i = 1 ; i <=a ; i++){
            num += 1.0 / i;
        }
        return num;
    }
    public static void main(String[] args) {

        int[] list = {15,6,7,12,7,9,3};
        double sumPlus = 0 ;
        for (int j : list) {
            sumPlus += f(j);  /* DİZEDEKİ ELEMANLARIN HARMONİK SERİLERİNİ BULUYOR ve TOPLUYOR */
        }

        double harmonicAvarage = list.length / sumPlus; /*  DİZENİN BOYUTUNU - DİZEDEKİ ELEMANLARIN HARMONİK SERİ TOPLAMLARINA BÖLÜYOR */
        System.out.println("Dizedeki sayılar : " + Arrays.toString(list));
        System.out.println("Dizedeki sayıların harmonik ortalaması : "+harmonicAvarage);

    }
}