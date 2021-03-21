public class Transaction {
    private Trader trader;
    private int year;
    private int value;


    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }
}
