import java.util.Scanner;

public class Assignment1Q5 {
    public static void main(String[] args) {
        int temp;
        while (true)
        {
            System.out.println("Enter the income: ");
            Scanner input= new Scanner(System.in);
            temp=input.nextInt();
            TaxAmount obj= new TaxAmount(temp);
            System.out.println("Tax percentage for this income: "+obj.calTaxPercent());
            System.out.println("Want to query for more salary: (0- if not , 1- to continue) ");
            temp=input.nextInt();
            if(temp==0)
                break;
        }
    }
}
