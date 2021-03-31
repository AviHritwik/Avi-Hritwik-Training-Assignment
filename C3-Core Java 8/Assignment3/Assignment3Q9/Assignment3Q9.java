package Assignment3Q9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

class SavingAccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;
    public SavingAccount() {
    	
    }
	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
    public void withdraw(int amount) {
    	if(this.acc_balance>=amount) {
    		this.acc_balance -= amount;
    	}
    }
    public void deposit(int amount) {
    	this.acc_balance += amount;
    }
}
class compareAID implements Comparator<SavingAccount>{

	@Override
	public int compare(SavingAccount s1, SavingAccount s2) {
		// TODO Auto-generated method stub
		if(s2.getAcc_ID()>s1.getAcc_ID()) {
			return 1;
		}else
			return -1;}}

class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>(new compareAID());

    public boolean addSavingAccount(SavingAccount savingAccount) {
    	savingAccounts.add(savingAccount);
    	return true;
    }

    public List<Integer> displaySavingAccountIds() {
    	List<Integer> listOFIds = new ArrayList<>();
    	for(SavingAccount s : savingAccounts) {
    		listOfIds.add(s.getAcc_ID());
    	}
    	//List is changing the actual order as it follows insertion order, so reversing the results and sending back
    	List<Integer> listOfIdz = new ArrayList<>();
    	ListIterator<Integer> itr = listOfIds.listIterator(listOfIds.size());
    	while(itr.hasPrevious()) {
    		listOfIdz.add(itr.previous());
    	}
    	return listOfIdz;
    }

	
}

public class Assignment3Q9 {
    public static void main(String[] args) {
    	
    	SavingAccount account1 = new SavingAccount(1000,12,"Kesav",true);
    	SavingAccount account2 = new SavingAccount(1000,13,"kino",true);
    	SavingAccount account3 = new SavingAccount(1000,8,"wake",true);
    	SavingAccount account4 = new SavingAccount(1300,10,"wesly",true);
    	SavingAccount account5 = new SavingAccount(1600,30,"paul",true);
    	SavingAccount account6 = new SavingAccount(1000,20,"beta",true);
    	SavingAccount account7 = new SavingAccount(1000,11,"arnav",true);
    	SavingAccount account8 = new SavingAccount(1000,50,"abhi",true);
    	BankAccountList bankAccountList = new BankAccountList();
    	bankAccountList.addSavingAccount(account1);
    	bankAccountList.addSavingAccount(account2);
    	bankAccountList.addSavingAccount(account3);
    	bankAccountList.addSavingAccount(account4);
    	bankAccountList.addSavingAccount(account5);
    	bankAccountList.addSavingAccount(account6);
    	bankAccountList.addSavingAccount(account7);
    	bankAccountList.addSavingAccount(account8);
    	List<Integer> list = bankAccountList.displaySavingAccountIds();
    	for(Integer i: list) {
    		System.out.println(i);
    	}
    	
    }
}