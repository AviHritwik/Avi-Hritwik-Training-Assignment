public class SavingsAccount extends Assignment2Q3{
    private int totalDeposits;
    private int fixedDepositAmount;
    public SavingsAccount()
    {
        totalDeposits=10000;
        fixedDepositAmount=5000;
    }

    /**
     * the function is concerned to provide total cash in account
     * so it is returning totalDeposits
     */
    @Override
    public int getCash() {
        return totalDeposits;
    }
}
