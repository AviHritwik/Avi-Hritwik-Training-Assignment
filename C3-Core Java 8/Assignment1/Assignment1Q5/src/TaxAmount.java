class TaxAmount {
    private int income;
    public TaxAmount(int income)
    {
        this.income=income;
    }
    public String calTaxPercent()
    {
        if(income<=180000)
            return "NIL";
        else if(income <= 300000)
            return "10%";
        else if(income<=500000)
            return "20%";
        else if(income<=1000000)
            return "30%";
        return "No information for amount > 10,00,000";
    }
}
