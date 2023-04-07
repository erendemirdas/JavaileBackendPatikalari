public class SafeHouse extends NorLoc{
    public SafeHouse(Player player){
        super(player , "Güvenli Ev");
    }

    @Override
    public boolean onLocation(){
        this.getPlayer().setHealty(this.getPlayer().getOrginalHealt());
        System.out.println("Güvenli evdesiniz !");
        System.out.println("Canınız yenilendi !");
        return true;
    }

}
