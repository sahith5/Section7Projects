public class BookDemo {
    public static void main(String[] args) {
    Book b1=new Book("Sahith","Comedy","Helloworld",45);
    Book b2=new Book("Sahith2","Thriller","Devil",60);
    System.out.println("book1 has "+b1.getPages()+"pages  author is "+b1.getAuthor()+"title of book is "+b1.getAuthor()+"and the genre is"+b1.getGenre());
    System.out.println("book2 has "+b2.getPages()+"pages  author is "+b2.getAuthor()+"title of book is "+b2.getAuthor()+"and the genre is"+b2.getGenre());
    b1.PrintDetails();
    b2.PrintDetails();

    }
}
















