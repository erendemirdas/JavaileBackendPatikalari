import java.util.Scanner;
public class Player {
    private int id ;
    private int damage ;
    private int healty ;
    private int money ;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory ;
    private int orginalHealt;

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};

        System.out.println("-----------------------------------");
        for(GameChar gameChar : charList){
            System.out.println("ID : " + gameChar.getId() +"\t Karakter : "+ gameChar.getName() + "\t\t Hasar : "+ gameChar.getDamage() +"\t Sağlık : "+ gameChar.getHealty() +"\t Para : " + gameChar.getMoney());
        }
        System.out.println("-----------------------------------");

        System.out.print("Lütfen oyuna başlamak için bir karakter seçiniz : ");
        String selectChar = input.nextLine();

        switch (selectChar){
            case "1" :
                initPlayer(new Samurai());
                break;
            case "2":
                initPlayer(new Archer());
                break;
            case "3":
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }

        System.out.println("Karakter : " + this.getCharName() +
                " \t Hasar : " + this.getDamage() +
                " \t Sağlık : " + this.getHealty() +
                " \t Para : " + this.getMoney()  );

    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealty(gameChar.getHealty());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.setOrginalHealt(gameChar.getHealty());
    }


    public void printInfo(){
        System.out.println("Silahınız : " + this.getInventory().getWeapon().getName() +
                "\t\t Zırhınız : " + this.getInventory().getArmour().getName() +
                "\t\t Blocklama : " + this.getInventory().getArmour().getBlock() +
                "\t\t Hasarınız : " + this.getTotalDamage() +
                "\t\t Sağlık : " + this.getHealty() +
                "\t\t Para : " + this.getMoney());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        if(healty < 0){
            healty = 0;
        }
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrginalHealt() {
        return orginalHealt;
    }

    public void setOrginalHealt(int orginalHealt) {
        this.orginalHealt = orginalHealt;
    }
}
