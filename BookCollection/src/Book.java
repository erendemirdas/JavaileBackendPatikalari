public class Book implements Comparable<Book>{
    private String bookName ;
    private int pageNumb;
    private String writerName;
    private int releaseDate;

    public Book(String bookName, int pageNumb,String writerName, int releaseDate){
        this.setBookName(bookName);
        this.setPageNumb(pageNumb);
        this.setWriterName(writerName);
        this.setReleaseDate(releaseDate);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumb() {
        return pageNumb;
    }

    public void setPageNumb(int pageNumb) {
        this.pageNumb = pageNumb;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }
}