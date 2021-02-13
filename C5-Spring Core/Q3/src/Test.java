import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


/**
 *
 */
public class Test {
    public static void printStar()
    {
        System.out.println();
        for(int i=0;i<5;i++)
            System.out.println("****************************************************************************");
    }

    public static void main(String[] args) {
        int i=1;
        Scanner input=new Scanner(System.in);
        ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("Enter the account details : ");
        while (true)
        {
            BankAccount account=new BankAccount();
            System.out.println("\tAccount"+i+" :");
            System.out.print("\t\tAccount ID : ");
            account.setAccountId(input.nextLong());
            System.out.print("\t\tAccount holder name : ");
            account.setAccountHolderName(input.next());
            System.out.print("\t\tAccount Type : ");
            account.setAccountType(input.next());
            System.out.print("\t\tAccount Balance : ");
            account.setAccountBalance(input.nextDouble());
            BankAccountRepositoryImpl.accounts.put(account.getAccountId(),account);
            System.out.println("**************************************");
            System.out.print("Enter \n\t 1)more entry\n\t 0)stop\n\t");
            if(input.nextInt()==0)
                break;
            i++;
            printStar();
        }


        BankAccountController controller = (BankAccountController) context.getBean("controller");

        printStar();
        while (controller.operations(controller)){
            printStar();
        }

        System.out.println("Thank you !!!!!");


    }
}
