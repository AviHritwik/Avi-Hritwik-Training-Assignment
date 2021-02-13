public class BankAccountServiceImpl implements BankAccountService {

    public BankAccountServiceImpl() {
    }

    @Override
    public double withdraw(long accountId, double balance) {
        BankAccount account= BankAccountRepositoryImpl.accounts.get(accountId);
        account.setAccountBalance(account.getAccountBalance()-balance);
        BankAccountRepositoryImpl.accounts.replace(accountId,account);
        return account.getAccountBalance();
    }

    @Override
    public double deposit(long accountId, double balance) {
        BankAccount account= BankAccountRepositoryImpl.accounts.get(accountId);
        account.setAccountBalance(account.getAccountBalance()+balance);
        BankAccountRepositoryImpl.accounts.replace(accountId,account);
        return account.getAccountBalance();
    }

    @Override
    public double getBalance(long accountId) {
        return (BankAccountRepositoryImpl.accounts.get(accountId)).getAccountBalance();
    }

    @Override
    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
        BankAccount accountFrom=BankAccountRepositoryImpl.accounts.get(fromAccount);
        BankAccount accountTo=BankAccountRepositoryImpl.accounts.get(toAccount);
        if(accountFrom.getAccountBalance()<amount)
            return false;
        accountTo.setAccountBalance(accountTo.getAccountBalance()+amount);
        accountFrom.setAccountBalance(accountFrom.getAccountBalance()-amount);
        BankAccountRepositoryImpl.accounts.replace(fromAccount,accountFrom);
        BankAccountRepositoryImpl.accounts.replace(toAccount,accountTo);
        return true;
    }

}
