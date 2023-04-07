public class Inventory {
    private Weapon weapon;
    private Armour armour;
    private int awardNumber = 0 ;
    public Inventory() {
        this.weapon = new Weapon(-1, 0 , 0 ,"Yumruk");
        this.armour = new Armour(-1 , "Çıplak" , 0,0);
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int onAwardNumber(int a){
        this.awardNumber += a;
        return awardNumber;
    }

    public int getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(int awardNumber) {
        this.awardNumber = awardNumber;
    }
}
