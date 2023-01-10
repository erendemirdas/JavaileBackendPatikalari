public class Main {
    public static void main(String[] args){
        Fighther f1 = new Fighther("A" , 15 , 140 , 100 , 0 );
        Fighther f2 = new Fighther("B" , 13 , 150 , 85 , 0);

        Match match = new Match(f1 , f2 ,85 , 100 );
        match.run();
    }
}