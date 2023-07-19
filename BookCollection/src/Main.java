import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> newSet = new TreeSet<>();
        newSet.add(new Book("Ankara",105,"Ne Bilim" ,2010));
        newSet.add(new Book("Corum",95,"Ne Bilim" ,2010));
        newSet.add(new Book("Eskişehir",123,"Ne Bilim" ,2010));
        newSet.add(new Book("Istanbul",165,"Ne Bilim" ,2010));
        newSet.add(new Book("Paris",152,"Ne Bilim" ,2010));


        System.out.println("Kitap ismi sıralama :");
        for (Book books : newSet) {
            System.out.println(books.getBookName());
        }

        TreeSet<Book> newSet2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumb() - o2.getPageNumb();
            }
        });

        System.out.println();
        System.out.println("Kitap sayfa sayısı sıralama :");

        newSet2.addAll(newSet);

        for(Book book : newSet2){
            System.out.println(book.getBookName());
        }
    }
}