package Library;
import java.util.ArrayList;
import java.util.Scanner;
public class ViewOrders implements I00peration  {
    @Override
    public void oper(Database database, User user) {
        System.out.println("\nEnter book name:");
        Scanner s = new Scanner(System.in);
        String bookname = s.next();
        int i = database.getBook(bookname);
        if(i>-1){
            System.out.println("Book\t\tUser\t\tQty\tPrice");
            for (Order order : database.getAllOrders()){
                System.out.println(order.getBook().getName() +"\t\t"
                + order.getUser().getName()+"\t\t"+order.getQty()+"\t\t"+order.getPrice());
            }
            System.out.println();
        }else {
            System.out.println("Book doesn't exist!\n");
        }
    user.menu(database, user);
    }
}
