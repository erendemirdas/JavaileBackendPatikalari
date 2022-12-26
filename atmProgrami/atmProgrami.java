import java.util.Scanner;
public class atmProgrami {
    public static void main(String[] args) {
        String userName , password ;
        Scanner inp = new Scanner(System.in);
        int right = 4 ;
        int balance = 3500 ;
        int select , price;

        while (right > 0) {
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = inp.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = inp.nextLine();
                if (userName.equals("patika") && password.equals("dev123")){
                    System.out.println("\nMerhaba , Kodluyoruz Bankasına Hoşgeldiniz !");
                    do {
                        System.out.println("\n"+"1-Para Yatırma\n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgulama\n" +
                                "4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz = ");
                        select = inp.nextInt();
                        switch (select) {
                            case 1:
                                System.out.print("\n" +"Güncel bakiyeniz = " + balance +
                                        "\nYatırmak istediğiniz tutarı giriniz = ");
                                price = inp.nextInt();
                                balance += price;
                                System.out.println("Para yatırma işlemi başarılı ! Güncel Bakiyeniz = " + balance +"\n");
                                break;
                            case 2:
                                System.out.print("Çekmek istediğiniz tutarı giriniz = ");
                                price = inp.nextInt();
                                if (price > balance){
                                    System.out.println("Bakiyeniz yetersiz ! \n");
                                }else {
                                    balance -= price;
                                    System.out.println("Para çekme işlemi başarılı ! Güncel Bakiyeniz = " + balance +"\n");
                                }break;
                            case 3:
                                System.out.println("Bakiyeniz = " + balance);
                                break;
                        }

                    }while (select != 4);
                    System.out.println("\n" +"Hesabınızdan Çıkış Yapıldı\n"+ "İyi günler dileriz. Tekrar görüşmek üzere...");
                    break;

                }else {
                    right--;
                    if (right == 0){
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz !!!");
                    }else {
                        System.out.println("Kullanıcı Adınız veya Şifreniz Yanlış. Tekrar Deneyiniz !!");
                        System.out.println("Kalan hakkınız = " + right);
                    }
                }
        }
    }
}
