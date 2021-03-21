import java.util.*;
import java.util.stream.Collectors;

public class Assignment5Q4 {

    //Find all transactions in the year 2011 and sort them by value (small to high).
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        return (List<Transaction>) transactions.stream().filter(transaction -> transaction.getYear()==2011).
                sorted(Comparator.comparing(Transaction::getValue));
    }

    //Print all transactions’ values from the traders living in Delhi.
    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Delhi"))
                .map(transaction -> transaction.getValue())
                .collect(Collectors.toList());
    }

    //What’s the highest value of all the transactions?
    public static int highestTransaction(List<Transaction> transactions){
        return transactions.stream().mapToInt(Transaction::getValue).max().orElseThrow(NoSuchElementException::new);
    }

    // Find the transaction with the smallest value.
    public static int smallestTransaction(List<Transaction> transactions){
        return transactions.stream().mapToInt(Transaction::getValue).min().orElseThrow(NoSuchElementException::new);
    }

    public static void main(String[] args) {
         List<Transaction> transactions=new ArrayList<>();
         Transaction transaction=new Transaction();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter transaction details : ");
        while(true)
        {
            System.out.println("\tTrader Associated :");
            System.out.print("\t\tName : ");
            transaction.getTrader().setName(input.next());
            System.out.print("\t\tCity  : ");
            transaction.getTrader().setCity(input.next());
            System.out.print("\tYear : ");
            transaction.setYear(input.nextInt());
            System.out.print("\tvalue : ");
            transaction.setValue(input.nextInt());
            System.out.println("Enter \n\t1:- For more entry\n\t0:- to stop");
            transactions.add(transaction);
            if(input.nextInt()==0)
                break;
        }
        System.out.println("Transactions in the year 2011 and sorted them by value (small to high) : "+
                sortTransactions(transactions));
        System.out.println("Transactions’ values from the traders living in Delhi : " +
                transactionsValuesDelhi(transactions));
        System.out.println("Highest value of all the transactions : "+
                highestTransaction(transactions));
        System.out.println("Transaction with smallest value : "+
                smallestTransaction(transactions));
    }
}
