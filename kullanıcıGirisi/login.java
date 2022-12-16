import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        String userName , password, cevap , newPassword;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = inp.nextLine();

        if (userName .equals("patika") && password .equals("java123")){
            System.out.print("Giriş başarılı !!");
        }else {
            System.out.println("Kullanıcı bilgileriniz yanlış !!");
            System.out.print("Şifrenizi yenilemek istermisiniz ? (evet/hayır) : ");
            cevap = inp.nextLine();

            if (cevap .equals("evet")){
                System.out.print("Lütfen yeni şifrernizi giriniz : ");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                    newPassword = inp.nextLine();
                    System.out.println("\nYENİ ŞİFRE BAŞARIYLA OLUŞTURULDU !");
                }else {
                    System.out.println("\nYENİ ŞİFRE OLUŞTURULDU !");
                }

            }else {
                System.out.println("\nGİRİŞ BAŞARISIZ !!");
            }
        }

    }
}
