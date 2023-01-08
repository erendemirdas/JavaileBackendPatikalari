public class Main {
    public static void main(String[] args){

        Teacher t1 = new Teacher("Selami", "TRH" ,"0541" );
        Teacher t2 = new Teacher("Faruk" , "FZK" , "0531");
        Teacher t3 = new Teacher("Derbeder" , "MAT" , "0521");

        Courses tarih = new Courses("Tarih" , "101","TRH" );
        tarih.addTeacher(t1);

        Courses fizik = new Courses("Fizik" , "101","FZK" );
        fizik.addTeacher(t2);

        Courses mat = new Courses("Matematik" , "101","MAT" );
        mat.addTeacher(t3);

        Student s1 = new Student("İnek Şaban" , "123" , "4 . Sınıf" , tarih , fizik , mat);
        s1.addBulkExamNote(50,60,70);
        s1.addBulkSozlu(100,100,100);
        s1.isPass();
        Student s2 = new Student("Güdük Necmi" , "456" , "4 . Sınıf" , tarih , fizik , mat);
        s2.addBulkExamNote(100,100,100);
        s2.addBulkSozlu(50,60,70);
        s2.isPass();

        Student s3 = new Student("İnek Şaban" , "789" , "4 . Sınıf" , tarih , fizik , mat);
        s3.addBulkExamNote(20,40,60);
        s3.addBulkSozlu(60,40,20);
        s3.isPass();

        tarih.printTeacher();
        fizik.printTeacher();
        mat.printTeacher();
    }
}