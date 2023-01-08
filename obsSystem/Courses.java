public class Courses  {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note = 0;
    double sozlu = 0;

    Courses(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor !");
        }
    }

    void printTeacher(){
        System.out.println("<><><><><><><><><><><><><><><><><>");
        this.teacher.print();
    }

}
