public class Match {
    Fighther f1 ;
    Fighther f2;
    int minWeight ;
    int maxWeight ;


    Match(Fighther f1 , Fighther f2 , int minWeight , int maxWeight){
        this.f1 = f1 ;
        this.f2 = f2 ;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight ;
    }

    public void run(){
        System.out.println("DÖVÜŞÇÜ " + this.f1.name + " :");
        System.out.println("CAN : " + this.f1.healty);
        System.out.println("GÜÇ : " + this.f1.damage);
        System.out.println("KİLO : " + this.f1.weight + "\n");
        System.out.println("DÖVÜŞÇÜ " + this.f2.name + " :");
        System.out.println("CAN : " + this.f2.healty);
        System.out.println("GÜÇ : " + this.f2.damage);
        System.out.println("KİLO : " + this.f2.weight );

        if (isCheck()){
            while (this.f1.healty > 0 && this.f2.healty > 0){
                System.out.println("\n"+"<><><><> YENİ ROUND <><><><>");
                if (firstAttac()){
                    this.f2.healty = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.healty = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                }else {
                    this.f1.healty = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.healty = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                }
                /*this.f2.healty = this.f1.hit(f2);
                if (isWin()){
                    break;
                }
                this.f1.healty = this.f2.hit(f1);
                if (isWin()){
                    break;
                */
                remainingHealth();
            }
        }else {
            System.out.println("Sporcuların Sikletleri UYMUYOR !!!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
            if (this.f1.healty == 0){
                remainingHealth();
                System.out.println("\n" + this.f2.name + " KAZANDI !!!");
                return true;
            }

            if (this.f2.healty == 0){
                remainingHealth();
                System.out.println("\n" + this.f1.name + " KAZANDI !!!");
                return true;
            }


        return false;
    }

    public void remainingHealth(){
        System.out.println(this.f1.name + " KALAN CAN = " + this.f1.healty);
        System.out.println(this.f2.name + " KALAN CAN = " + this.f2.healty);
    }

    boolean firstAttac(){
        double randomNumber = Math.random() * 100 ;
        return randomNumber <= 49;
    }

}
