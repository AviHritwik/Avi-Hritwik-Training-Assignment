import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int totalCash=cash.stream().mapToInt(i->i).sum();
        return totalCash;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Assignment2Q3 total=new Assignment2Q3();
        Assignment2Q3 savings=new SavingsAccount();
        Assignment2Q3 current =new CurrentAccount();
        ArrayList<Integer> cashInBank= new ArrayList<>();
        while(true)
        {
            System.out.println("Enter \n\t1 : Saving\n\t2 : Current");
            int choice=input.nextInt();
            switch (choice)
            {
                case 1: cashInBank.add(savings.getCash());
                    break;
                case 2: cashInBank.add(current.getCash());
                    break;
                default:
                    System.out.println("!!Invalid input!!");
            }
            System.out.println("Enter \n\t1: More Records\n\t2: Exit");
            if(input.nextInt()==2)
            {
                break;
            }
        }

        System.out.println(total.totalCashInBank(cashInBank));
    }
}
