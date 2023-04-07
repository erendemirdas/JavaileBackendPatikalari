public class Armour {
    private int id;
    private String name ;
    private int block ;
    private int money;

    public Armour(int id , String name , int block , int money){
        this.id = id;
        this.name = name ;
        this.block = block;
        this.money = money;
    }

    public static Armour[] armours(){
        Armour[] armourList = new Armour[3];
        armourList[0] = new Armour(1 , "Hafif Zırh" , 3 ,20 );
        armourList[1] = new Armour(2 , "Orta Zırh" , 5 ,30 );
        armourList[2] = new Armour(3 , "Ağır Zırh" , 9 ,50 );
        return armourList;
    }

    public static Armour getArmourObjById(int id){
        for (Armour a : Armour.armours()){
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
