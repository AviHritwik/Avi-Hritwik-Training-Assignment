import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4Q2 {
    private int totalPrice;
    private String status;
    public Assignment4Q2(int totalPrice,String status)
    {
        this.status=status;
        this.totalPrice=totalPrice;
    }

    @Override
    public String toString() {
        return "Assignment4Q2{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders)
    {
        ArrayList<Assignment4Q2> conditionalOrder=new ArrayList<>();
        orders.forEach((Assignment4Q2 order) -> {if(order.totalPrice>10000 && (order.status.equals("ACCEPTED")||order.status.equals("COMPLETED")))
            conditionalOrder.add(order);});
        return conditionalOrder;
    }

    public static void main(String[] args) {
        ArrayList<Assignment4Q2> orders=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter order details:");
        while(true)
        {
            System.out.print("Enter price of order : ");
            int totalPrice=input.nextInt();
            System.out.print("Enter status of order : ");
            String status = input.next();
            Assignment4Q2 order=new Assignment4Q2(totalPrice,status);
            orders.add(order);
            System.out.println("Enter \n\t0:- To stop adding order \n\t1:- For more order");
            if(input.nextInt()==0)
                break;
        }
        ArrayList<Assignment4Q2> conditionalOrder=Assignment4Q2.listOfOrders(orders);
        conditionalOrder.forEach(order -> System.out.println(order));
    }
}
