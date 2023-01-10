public class Fighther {
    String name;
    int damage ;
    int healty ;
    int weight;
    int dodge;


    Fighther(String name , int damage , int healty , int weight , int dodge ){

        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.healty = healty ;
        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else {
            this.dodge = 0 ;
        }
    }

    int hit(Fighther foe){

        if (foe.isDodge()){
            System.out.println(this.name + "'nin vuruşu " + foe.name + " tarafından BLOKLANDI !!!");
            return foe.healty;
        }else {
            System.out.println(this.name + " -->>" + " " + foe.name + " " + this.damage + " hasar vurdu.");
            if (foe.healty - this.damage < 0 ){
                return 0 ;
            }

        }

        return foe.healty - this.damage ;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100 ;
        return randomNumber <= this.dodge;
    }


}
