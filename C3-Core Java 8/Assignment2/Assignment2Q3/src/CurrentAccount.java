public class CurrentAccount extends Assignment2Q3{
    private int totalDeposits ;
    private int creditLimit ;
    public CurrentAccount()
    {
        totalDeposits=10000;
        creditLimit=2000;
    }

    /**
     * Return the totalDeposit in that account
     */
    @Override
    public int getCash() {
        return totalDeposits;
    }
}
