import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryImpl implements BankAccountRepository {
    public static Map<Long,BankAccount> accounts= new HashMap<>();

    public BankAccountRepositoryImpl() {
    }



    @Override
    public double updateBalance(long accountId, double newBalance) {
        BankAccount account=accounts.get(accountId);
        account.setAccountBalance(newBalance);
        accounts.replace(accountId,account);
        return account.getAccountBalance();
    }
}
