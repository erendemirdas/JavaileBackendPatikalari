public class Teacher {
    String name ;
    String branch ;
    String mpno ;

    Teacher(String name , String branch , String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mpno);
        System.out.println("Bölüm : " + this.branch);
    }
}
