package week4.exercise.library;
import java.util.HashMap;

public class LibraryCatalog {
    HashMap<String, Book> hash = new HashMap<String, Book>();

    public void init(){

        addBook(new Book("Gulliver's Travel", "Jonathan Swift","101"));
        addBook(new Book("Love and War","Sun Tzu","102"));
        displayCatalog();
        System.out.println(removeBook("103"));
        System.out.println("Your book is \n" + searchBook("101"));

        addBook(new Book("Oliver Twist","Charles Dickens", "9-214124"));
        displayCatalog();


    }

    public void addBook(Book book){
        hash.put(book.ISBN, book);
    }

    public Book searchBook(String isbn){
        return hash.get(isbn);
    }

    public boolean removeBook(String isbn){
        if(hash.containsKey(isbn)){
            hash.remove(isbn);
            return true;
        }
        else{
            return false;
        }
    }

    public void displayCatalog(){
        for(Book book : hash.values()){
            System.out.println(book);
        }
    }




}



