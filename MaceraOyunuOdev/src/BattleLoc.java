import java.util.Random;

public abstract class BattleLoc extends Location{
    Random a = new Random();
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;


    public BattleLoc(Player player , String name , Obstacle obstacle , String award, int maxObstacle ){
        super(player,name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }


    @Override
    public boolean onLocation(){
        int obsNumber = randomObstacleNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol ! Burada "+ obsNumber + " tane " + this.obstacle.getName() + " yaşıyor !");
        System.out.println("<S>avaş veya <K>aç");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("S") && combat(obsNumber)){
            System.out.println(this.getName() + " tüm düşmanları yendiniz !");
            switch (this.getName()){
                case "Mağara" :
                    Cave.setCheckloc(true);
                    break;
                case "Orman" :
                    Forest.setCheckloc(true);
                    break;
                case "Nehir" :
                    River.setCheckloc(true);
                    break;
                case "Maden":
                    Coal.setCheckloc(true);
                    break;
            }
            if (!this.getObstacle().getName().equals("Yılan")){
                this.getPlayer().getInventory().onAwardNumber(1);
            }
            if (this.getPlayer().getInventory().getAwardNumber() == 3){
                System.out.println();
                System.out.println("Bütün Ödülleri Toplayarak Oyunu KAZANDINIZ !!!!");
                return false;
            }
            return true;
        }

        if (this.getPlayer().getHealty() <= 0){
            System.out.println("ÖLDÜNÜZ !");
            return false;
        }
        return true;
    }


    public boolean combat(int obsNumber){
        for (int i = 1 ; i <= obsNumber ; i++){

            int firstKick = a.nextInt(2);
            this.getObstacle().setHealth(this.getObstacle().getOrginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealty() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<S>avaş veya <K>aç");
                String selectCombat = input.nextLine().toUpperCase();
                yilanDamage(); //YILAN RANDOM DAMAGE
                if (selectCombat.equals("S")){

                    if (firstKick == 0){
                        System.out.println();
                        System.out.println("Canavara vurdunuz !");
                        this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0){
                            System.out.println();
                            System.out.println("Canavar size vurdu !");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmour().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }

                            this.getPlayer().setHealty(this.getPlayer().getHealty() - obstacleDamage);
                            afterHit();
                        }
                    }else{
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmour().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealty(this.getPlayer().getHealty() - obstacleDamage);
                        afterHit();

                        if (this.getPlayer().getHealty() > 0){
                            System.out.println();
                            System.out.println("Canavara vurdunuz !");
                            this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }
                    }
                }else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealty()){
                System.out.println("Düşmanı yendiniz !");
                if (!obstacle.getName().equals("Yılan")){
                    System.out.println(this.getObstacle().getAwardCoin() + " para kazandınız !");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAwardCoin());
                    System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
                }else {
                    randomItemSnake();
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public void playerStats(){
        System.out.println();
        System.out.println("Oyuncu Değerleri" );
        System.out.println("--------------------------" );
        System.out.println("Sağlık : " + this.getPlayer().getHealty());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Silah :" + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh :" + this.getPlayer().getInventory().getArmour().getName());
        System.out.println("Blocklama :" + this.getPlayer().getInventory().getArmour().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
    }

    public void obstacleStats(int i){
        System.out.println();
        System.out.println(i + "."  +this.getObstacle().getName() + " değerleri :");
        System.out.println("--------------------------" );
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ganimet : " + this.getObstacle().getAwardCoin());
    }

    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealty());
        System.out.println(this.getObstacle().getName() + " kalan can : " + this.getObstacle().getHealth());
    }

    public int randomObstacleNumber(){
        return a.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    // YILANDAN İTEM DÜŞÜRME VE HER YILAN İÇİN RASGELE HASAR TANIMLAMA
    public void randomItemSnake(){
        Weapon awardWeapon = Weapon.getWeaponObjById(randomItems());
        Armour awardArmour = Armour.getArmourObjById(randomItems());
        randomNumber();

        if (randomNumber() >= 0 && randomNumber() <= 14){
            System.out.println(awardWeapon.getName() + " yere düştü ! Almak istermisiniz ? ");
            System.out.print("<E>vet / <H>ayır  : ");
            String take = input.nextLine().toUpperCase();
            if (take.equals("E")){
                this.getPlayer().getInventory().setWeapon(awardWeapon);
                printBosluk();
                System.out.println(awardWeapon.getName() + " kazandınız !");
                printBosluk();
            }else {
                System.out.println("Yerdeki itemi almadın !!!");
            }

        }else if(randomNumber() >= 15 && randomNumber() <= 29){
            System.out.println(awardArmour.getName() + " yere düştü ! Almak istermisiniz ? ");
            System.out.print("<E>vet / <H>ayır  : ");
            String take = input.nextLine().toUpperCase();
            if (take.equals("E")){
                this.getPlayer().getInventory().setArmour(awardArmour);
                printBosluk();
                System.out.println(awardArmour.getName() + " kazandınız !");
                printBosluk();
            }else {
                System.out.println("Yerdeki itemi almadın !!!");
            }

        }else if(randomNumber() >= 30 && randomNumber() <= 54){
            this.getPlayer().setMoney(this.getPlayer().getMoney() + randomMoney());
            printBosluk();
            System.out.println(randomMoney() + " para kazandınız.");
            printBosluk();

        }else{
            printBosluk();
            System.out.println("Üzgünüm burada hiçbir şey yok !!!");
            printBosluk();
        }
    }

    public int randomNumber(){
        int randomNumber = a.nextInt(99);
        return randomNumber;
    }

    public void printBosluk(){
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
    }
    public int yilanDamage(){
        if (this.getObstacle().getName().equals("Yılan")){
            int randomDamage = a.nextInt(4) + 3;
            obstacle.setDamage(randomDamage);
        }
        return obstacle.getDamage();
    }

    public int randomItems(){
        int q = a.nextInt(99);

        if (q >= 0 && q <= 19){
            return 3;
        }else if (q >= 20 && q <= 49){
            return 2;
        }else if (q >= 50 && q <= 99){
            return 1;
        }
        return 0;
    }

    public int randomMoney(){
        int q = a.nextInt(99);
        if (q >= 0 && q <= 19){
            return 10;
        }else if (q >= 20 && q <= 49){
            return 5;
        }else if (q >= 50 && q <= 99){
            return 1;
        }
        return 0;
    }
}