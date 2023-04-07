public class ToolStore extends NorLoc{
    public ToolStore(Player player){
        super(player , "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz !");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz =");

            int selectCase = input.nextInt();
            while (selectCase <  1 || selectCase > 3){
                System.out.print("Lütfen geçerli bir değer giriniz !! : ");
                selectCase = input.nextInt();
            }

            switch (selectCase){
                case 1 :
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmour();
                    buyArmour();
                    break;
                case 3:
                    System.out.println("Marketten çıkış yapılıyor , Yine bekleriz !");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("- - - - Silahlar - - - -");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            System.out.println("-"+w.getId()+ "-\t" + w.getName() + "\t --->"+"\tPara :" + w.getMoney() + " \t Hasar : " + w.getDamage());
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyWeapon(){

        System.out.println("Bir silah seçiniz : ");
        int selectWeaponID = input.nextInt();

        while (selectWeaponID <  0 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Lütfen geçerli bir değer giriniz !! : ");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID !=0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if ( selectedWeapon != null){
                if (selectedWeapon.getMoney() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır !");
                }else {
                    System.out.println(selectedWeapon.getName() + " silahını satın adldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getMoney();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız = " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void printArmour(){
        System.out.println("- - - - Zırhlar - - - -");
        for(Armour a : Armour.armours()){
            System.out.println("-"+a.getId()+ "-\t" + a.getName() + "\t --->"+"\tPara :" + a.getMoney() + " \t Block : " + a.getBlock());
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyArmour(){
        System.out.println("Bir zırh seçiniz : ");
        int selectArmourID = input.nextInt();

        while (selectArmourID <  0 || selectArmourID > Armour.armours().length){
            System.out.print("Lütfen geçerli bir değer giriniz !! : ");
            selectArmourID = input.nextInt();
        }

        if (selectArmourID != 0){
            Armour selectedArmour = Armour.getArmourObjById(selectArmourID);

            if(selectedArmour != null){
                if (selectedArmour.getMoney() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır !");
                }else {
                    System.out.println(selectedArmour.getName() + " satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmour.getMoney();
                    this.getPlayer().setMoney(balance);
                    this.getPlayer().getInventory().setArmour(selectedArmour);
                    System.out.println("Kalan paranız :" +this.getPlayer().getMoney());
                }
            }
        }
    }
}