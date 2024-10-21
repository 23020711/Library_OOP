package Library;

import java.util.Scanner;

public class ReturnBook implements I00peration {
    @override
    public void oper(Database database, User user) {
        System.out.println("\nEnter book name:");
        Scanner s = new Scanner(System.in);
        String bookname = s.next();
        if (!database.getBrws().isEmpty()) {
            if (b.getBook().getName().matches(user.getName())){
                Book book = b.getBook();
                if (b.getDaysLeft()<0) {
                    System.out.println("You are late!\n"
                    +"You have to pay" +Math.abs(b.getDaysLeft()*50)+ "as fine\n");
                }
                book.setBrwcopies(book.getBrwcopies()+1);
                database.returnBook(b. book, i);
                System.out.println("Book return\n Thank you!");
                break;
            } else {
                System.out.println("You didn't borrow this book!");
            }
        }else {
            System.out.println("You didn't borrow this book!");
        } 
        user.menu(database, user);
    }
}
