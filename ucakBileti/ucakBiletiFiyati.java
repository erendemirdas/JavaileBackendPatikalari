import java.util.Scanner;
public class ucakBiletiFiyati {
    public static void main(String[] args) {
        int yas, tip;
        double mesafe, normalTutar= 0, ageSale = 0 , indirimliTutar , gidisDonusIndirimi , toplamTutar = 0;
        boolean isError = false ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz ( 1 => Tek Yön , 2 => Gidiş-Dönüş ) : ");
        tip = inp.nextInt();

        // KM BAŞI İNDİRİMSİZ TUTAR
        if (mesafe >= 0){
            normalTutar = mesafe * 0.10 ;
        }else {
            isError = true;
        }

        // YAŞ İNDİRİMİ
        if(yas >= 0){
            if (yas < 12 ){
                ageSale = normalTutar * 0.50;
            }else if (yas <= 24 ){
                ageSale = normalTutar * 0.10;
            }else if (yas >= 65){
                ageSale = normalTutar * 30;
            }
        }else {
            isError = true ;
        }

        indirimliTutar = normalTutar - ageSale;

        // GİDİŞ-DÖNÜŞ İNDİRİMİ ( tip == 1 "tek yön" , tip == 2  "gidiş/dönüş" )
        if (tip == 1 || tip == 2){
            if (tip == 1){
                gidisDonusIndirimi = 0;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) ;
            }else {
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            }
        }else {
            isError = true;
        }

        // PRİNT
        if (isError){
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            System.out.println("Toplam Tutar = " +  toplamTutar + " TL");
        }
    }
}
