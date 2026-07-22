
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books= new ArrayList<>();

    public boolean addBook(Book book){
        for (Book b : books) {
            if (book.getIsbn().equals(b.getIsbn())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    public boolean removeBook(String isbn){
        for (int i = 0; i < books.size(); i++){
            if(books.get(i).getIsbn().equals(isbn)){
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public Book searchBook(String isbn){
        for (Book b : books){
            if(b.getIsbn().equals(isbn)){
                return b;
            }
        }
        return null;
    }

    public boolean updatePrice(String isbn, double newPrice){
        for (Book b : books){
            if (b.getIsbn().equals(isbn)){
                b.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    public boolean updateStock(String isbn, int newStock){
        for (Book b : books){
            if (b.getIsbn().equals(isbn)){
                b.setStock(newStock);
                return true;
            }
        }
        return false;
    }

    public void displayBooks(){
        for(Book b : books){
            System.out.println(b);
            System.out.println();
        }
    }
}
