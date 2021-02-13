import java.util.Scanner;

public class BankAccountController {

    BankAccountServiceImpl services;
    BankAccountRepositoryImpl repository;

    /**
     * Constructor with all parameter
     */
    public BankAccountController(BankAccountServiceImpl services, BankAccountRepositoryImpl repository) {
        this.services = services;
        this.repository = repository;
    }

    /**
     * Constructor with no parameter
     */
    public BankAccountController() {
    }

    /**
     * Setter for BankAccountRepositoryImpl
     */
    public void setRepository(BankAccountRepositoryImpl repository) {
        this.repository = repository;
    }

    /**
     * Setter for BankAccountServiceImpl
     */
    public void setServices(BankAccountServiceImpl services) {
        this.services = services;
    }

    /**
     * It updates the account balance to new provided amount uses the BankAccountRepositoryImpl method
     * @param accountId= ID of account that needs to be updated
     * @param newBalance = new balance that needs to be assigned
     * @return  new balance of account
     */
    public double updateBalance(long accountId, double newBalance)
    {
        return repository.updateBalance(accountId,newBalance);
    }

    /**
     * uses BankAccountServiceImpl
     * @param accountId=ID of account that needs to be updated
     * @param balance=amount to be withdrawn
     * @return new balance
     */
    public double withdraw(long accountId, double balance){
        return services.withdraw(accountId,balance);
    }

    /**
     * uses BankAccountServiceImpl
     * @param accountId : ID of account that needs to be updated
     * @param balance : amount to be deposited
     * @return new balance
     */
    public double deposit(long accountId, double balance)
    {
        return services.deposit(accountId,balance);
    }

    /**
     * uses BankAccountServiceImpl
     * @param accountId : ID of account that needs to be updated
     * @return balance in the account
     */
    public double getBalance(long accountId)
    {
        return services.getBalance(accountId);
    }

    /**
     * uses BankAccountServiceImpl method
     * @param fromAccount : Account id from where amount is to be withdrawn
     * @param toAccount : Account id to which amount is transferred
     * @param amount : amount to be transferred
     * @return the status of transfer
     */
    public boolean fundTransfer(long fromAccount, long toAccount, double amount)
    {
        return services.fundTransfer(fromAccount,toAccount,amount);
    }

    /**
     * Method to call different operations
     */
    public boolean operations(BankAccountController controller)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Operations : (Enter the assigned code)");
        System.out.println("\tTo check balance : 1");
        System.out.println("\tTo update balance : 2");
        System.out.println("\tTo withdraw amount : 3");
        System.out.println("\tTo deposit amount : 4");
        System.out.println("\tTo transfer fund : 5");
        System.out.println("\tTo exit : 0");
        int choice=input.nextInt();
            switch (choice)
            {
                case 0:
                    return false;
                case 1:
                    System.out.print("Enter account id : ");
                    System.out.print("Balance : "+controller.getBalance(input.nextLong()));
                    break;
                case 2:
                    System.out.print("Enter account id : ");
                    long Id =input.nextLong();
                    System.out.print("Enter new balance : ");
                    double bal=input.nextDouble();
                    System.out.print("Updated balance : "+ controller.updateBalance(Id,bal));
                    break;
                case 3:
                    System.out.print("Enter account id : ");
                    long id=input.nextLong();
                    System.out.print("Enter amount : ");
                    double amount = input.nextDouble();
                    System.out.println("Updated Balance : "+controller.withdraw(id,amount));
                    break;
                case 4:
                    System.out.print("Enter account id : ");
                    long accountId=input.nextLong();
                    System.out.print("Enter amount : ");
                    double amountDeposit = input.nextDouble();
                    System.out.println("Updated balance : "+controller.deposit(accountId,amountDeposit));
                    break;
                case 5:
                    System.out.print("Enter source account id : ");
                    long fromAccount= input.nextLong();
                    System.out.print("Enter destination id : ");
                    long toAccount= input.nextLong();
                    System.out.print("Enter amount : ");
                    double transferAmount=input.nextDouble();
                    if(controller.fundTransfer(fromAccount,toAccount,transferAmount))
                        System.out.println("Transfer status : SUCCESSFUL");
                    else
                        System.out.println("Transfer status : FAILED");
                    break;
                default :
                    System.out.println("!!!!!! INVALID INPUT !!!!!!!");
                    break;
            }
        return true;
    }

}
