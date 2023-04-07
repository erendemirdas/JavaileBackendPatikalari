import java.util.Scanner;

public class Game {
    Scanner inp = new Scanner(System.in);
    public void start(){
        System.out.println("Macera oyununa hoşeldiniz !");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName  = inp.nextLine();
        Player player = new Player(playerName);

        System.out.println(player.getName() + " Macera Adasına hoşgeldin !");

        player.selectChar();

        Location location = null;

        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("*-*-*-*-*-* BÖLGELER *-*-*-*-*-*");
            System.out.println("1 - Güvenli Ev");
            System.out.println("2 - Eşya Dükkanı");
            System.out.println("3 - Mağara -->\t -----\t Ödül = YEMEK \t ---- ZOMBİ ÇIKABİLİR !!");
            System.out.println("4 - Orman -->\t -----\t Ödül = ODUN \t ---- VAMPİR ÇIKABİLİR !!");
            System.out.println("5 - Nehir -->\t -----\t Ödül = SU \t\t ---- AYI ÇIKABİLİR !!");
            System.out.println("6 - Maden -->\t -----\t Ödül = RANDOM ---- YILAN ÇIKABİLİR !!");
            System.out.println("0 - Oyundan Çıkış Yap");
            System.out.print("Lütfen gitmek istediğiniz yeri seçin :");
            String selectLoc = inp.nextLine();

            switch (selectLoc){

                case "0":
                    location = null;
                    break;
                case "1" :
                    location = new SafeHouse(player);
                    break;
                case "2":
                    location = new ToolStore(player);
                    break;
                case "3":
                    if(Cave.isCheckloc() != true){
                    location = new Cave(player);
                    break;
                    }else{
                        printClosed();
                        continue;
                    }
                case "4":
                    if (Forest.isCheckloc() != true){
                    location = new Forest(player);
                    break;
                    }else {
                        printClosed();
                        continue;
                    }
                case "5" :
                    if (River.isCheckloc() != true){
                    location = new River(player);
                    break;
                    }else {
                        printClosed();
                        continue;
                    }
                case "6" :

                    location = new Coal(player);
                    break;

                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz !!");
                    continue;

            }


            if (location == null){
                System.out.println("Oyundan Çıkış Yapıldı !\n" +
                        "\tGörüşmek Üzere !!");
                break;
            }

            if (!location.onLocation()){
                if (player.getInventory().getAwardNumber() != 3){
                    System.out.println("GAME OVER!");
                }
                break;
            }

        }

    }

    public void printClosed(){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*");
        System.out.println("| BURADAKİ GÖREVİ TAMAMLADINIZ !!! TEKRAR SEÇEMEZSİNİZ !!! |");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*");
        System.out.println();
    }
}