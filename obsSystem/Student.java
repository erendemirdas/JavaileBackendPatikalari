public class Student {
    Courses c1;
    Courses c2;
    Courses c3;

    String name;
    String stuNo;
    String classes;
    double avarage ;
    boolean isPass;

    Student(String name , String stuNo , String classes, Courses c1 , Courses c2 , Courses c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1 ;
        this.c2 = c2;
        this.c3 = c3 ;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1 , int note2 , int note3 ){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
    }

    void addBulkSozlu(int sozlu1 , int sozlu2 , int sozlu3){
        if (sozlu1 >= 0 && sozlu1 <= 100){
            this.c1.sozlu = sozlu1;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100){
            this.c2.sozlu = sozlu2;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100){
            this.c3.sozlu = sozlu3;
        }
    }

    void isPass() {
        double trh = (this.c1.note * 0.80)+(this.c1.sozlu * 0.20) ;
        double fzk = (this.c2.note * 0.80)+(this.c2.sozlu * 0.20) ;
        double mat = (this.c3.note * 0.80)+(this.c3.sozlu * 0.20) ;

        System.out.println("****************************************");
        this.avarage = (trh + fzk + mat) / 3.0 ;
        if (this.avarage >= 50) {
            System.out.println("Sınıfı Geçtiniz ! ");
        } else {
            System.out.println("Sınıfta Kaldınız !");
        }

        System.out.println("Genel not ortalamanız : " + this.avarage);
        printNote();
    }

    void cikti(Courses a){
        System.out.println("================");
        System.out.println(a.name + " sınavı notu : " + a.note);
        System.out.println(a.name + " sözlü notu : " + a.sozlu);
        System.out.println(a.name + " dersi ortalaması : " + ((a.note * 0.80)+(a.sozlu * 0.20)));
    }

    void printNote(){

        cikti(this.c1);
        cikti(this.c2);
        cikti(this.c3);

    }
}
