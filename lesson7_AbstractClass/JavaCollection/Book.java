package lesson7_AbstractClass.JavaCollection;

public class Book extends Product{
    private String author;
    private int pageCount;

    public Book(String name, double price, String author , int pageCount){
        super(name,price);
        this.author = author;
        this.pageCount = pageCount;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
