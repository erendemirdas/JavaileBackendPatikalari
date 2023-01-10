public class Employee {
    String name ;
    double salary ;
    int workHours ;
    int hereYear ;

    Employee(String name ,double salary ,int workHours , int hereYear ){
        this.name = name ;
        this.salary = salary;
        this.workHours = workHours;
        this.hereYear = hereYear;

    }

    public double tax(){
        double tax = 0 ;
        if (this.salary >= 1000){
            tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus(){
        double bonuce = 0;
        if (this.workHours > 40) {
            for (int i = this.workHours; i > 40; i--) {
                bonuce +=30;
            }
        }
            return bonuce;
    }

    public double raiseSalary(){
        int year = 2021;
        double kidemZammi = 0.0;
        int kacYil = year - this.hereYear;
        if (kacYil <= 9){
            kidemZammi = this.salary * 0.05 ;
        }
        if (kacYil >= 10 && kacYil <= 19){
            kidemZammi = this.salary * 0.10 ;
        }
        if (kacYil >= 20){
            kidemZammi = this.salary * 0.15 ;
        }

        return kidemZammi;
    }

    public void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("İşe Başlama Yılı : " + this.hereYear);
        System.out.println("Vergi = " + tax());
        System.out.println("Bonus = " + bonus());
        System.out.println("Maaş Artışı = " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + ((this.salary - tax()) + bonus()));
        System.out.println("Toplam Maaş : " + ((this.salary - tax()) + bonus() + raiseSalary()));
    }


}
