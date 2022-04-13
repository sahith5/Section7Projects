import java.util.SplittableRandom;

public class Book {
    private String author;
    private String title;
    private String genre;
    private int pages;


    public Book(String author,String genre,String title,int Pages)
    {
        this.author=author;
        this.genre=genre;
        this.title=title;
        this.pages=Pages;

    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }
    public void PrintDetails()
    {
        System.out.println("Author"+author);
        System.out.println("titlr"+title);
        System.out.println("genre"+genre);
        System.out.println("number of pages"+pages);
    }
}
