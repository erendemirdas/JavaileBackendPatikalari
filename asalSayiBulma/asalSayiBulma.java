public class asalSayiBulma {
    public static void main(String[] args) {
        System.out.println("0 ile 100 arasındaki asal sayılar = ");

        for (int i = 2 ; i <= 100 ; i++){
            boolean asalmi = true ;
            for (int x = 2 ; x < i ; x++){
                if (i % x == 0) {
                    asalmi = false;
                    break;
                }
            }

            if (asalmi){
                System.out.print(i + " ");
            }

        }
    }
}