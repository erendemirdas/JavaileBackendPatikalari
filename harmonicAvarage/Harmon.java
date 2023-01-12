import java.util.Arrays;
public class Harmon {
    static double f(double a){  /* "a" değerinin harmonik serisini buluyor */
        double num = 0;
        for (int i = 1 ; i <=a ; i++){
            num += 1.0 / i;
        }
        return num;
    }
    public static void main(String[] args) {

        int[] list = {15 , 6 , 7 , 12 , 7 , 9 , 3};
        double[] list2 = new double[list.length];
        double numPlus = 0 ;
        for (int j : list) {
            numPlus += f(j);  /* DİZEDEKİ ELEMANLARIN HARMONİK SERİLERİNİ BULUYOR ve TOPLUYOR */
        }
        for (int i = 0  ; i < list2.length; i++){
            double deger = f(list[i]);
            list2[i] = deger;
        }

        double harmonicAvarage = list.length / numPlus; /*  DİZENİN BOYUTUNU - DİZEDEKİ ELEMANLARIN HARMONİK SERİ TOPLAMLARINA BÖLÜYOR */
        System.out.println("Dizedeki sayılar : " + Arrays.toString(list));
        System.out.println("Dizedeki sayıların harmonik serileri : " + Arrays.toString(list2));
        System.out.println("Dizedeki sayıların harmonik serileri toplamı = " +numPlus + "\n");
        System.out.println("Dizedeki sayıların harmonik ortalaması =  dizedeki eleman sayısı / dizedeki elemanların harmonik serileri toplamı");
        System.out.println("Dizedeki sayıların harmonik ortalaması : "+harmonicAvarage);
    }
}
