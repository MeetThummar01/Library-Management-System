import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("""
                    ===== Library Management =====
                    1. Add Book
                    2. Remove Book
                    3. Search Book
                    4. Display Books
                    5. Update Price
                    6. Update Stock
                    7. Exit
                    Enter Choice : 
                    """);
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1 :
                    System.out.println("Enter Book Title : ");
                    String title = sc.nextLine();
                    System.out.println("Enter Author Name : ");
                    String author = sc.nextLine();
                    System.out.println("Enter ISBN Number : ");
                    String isbn = sc.nextLine();
                    System.out.println("Enter Price : ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Stock : ");
                    int stock = sc.nextInt();

                    Book book = new Book(title, author, isbn, price, stock);
                    if (library.addBook(book)){
                        System.out.println("Book Added");
                    }else{
                        System.out.println("Book Already Exists");
                    }
                    break;
                case 2 :
                    System.out.println("Enter ISBN Number : ");
                    String isbn2 = sc.nextLine();
                    if (library.removeBook(isbn2)){
                        System.out.println("Book Removed");
                    }else{
                        System.out.println("Book does not exists");
                    }
                    break;
                case 3 :
                    System.out.println("Enter ISBN Number : ");
                    String isbn3 = sc.nextLine();
                    if(library.searchBook(isbn3) != null){
                        System.out.println(library.searchBook(isbn3));
                    }else{
                        System.out.println("Book not found");
                    }
                    break;
                case 4 :
                    library.displayBooks();
                    break;
                case 5 :
                    System.out.println("Enter New Price : ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter ISBN Number : ");
                    String isbn4 = sc.nextLine();
                    if(library.updatePrice(isbn4,newPrice)){
                        System.out.println("Price Updated");
                    }else {
                        System.out.println("Book not found");
                    }
                    break;
                case 6 :
                    System.out.println("Enter New Stock : ");
                    int newStock = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter ISBN Number : ");
                    String isbn5 = sc.nextLine();
                    if(library.updateStock(isbn5, newStock)){
                        System.out.println("Stock updated");
                    }else{
                        System.out.println("Book not found");
                    }
                    break;
                case 7:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }

        }while (choice != 7);
        sc.close();
    }

}
