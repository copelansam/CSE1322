public class Book extends Item{
    private int isbn_number;
    private String author;
    Book(){

    }

    Book(String title, int isbn, String author){
        setTitle(title);
        setIsbn_number(isbn);
        setAuthor(author);
    }

    public String getListing(){
        return "Book Name - " + getTitle() + "\nAuthor - " + getAuthor() +"\nISBN # - " + getIsbn();
    }

    public void setIsbn_number(int isbn){
        isbn_number = isbn;
    }
    public int getIsbn(){
        return isbn_number;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
}
