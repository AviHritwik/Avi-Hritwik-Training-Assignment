public class Candy extends DesertItem {
    private int candies;
    private int candyPrice;
    public Candy(int candyPrice){
        candies=0;
        this.candyPrice=candyPrice;
    }
    @Override
    public int getCost() {
        return 0;
    }
    public int addCandies(int candies) {
        this.candies+=candies;
        return this.candies;
    }
    public int getCandies() {
        return candies;
    }
    public int getCandyPrice() {
        return candyPrice;
    }

    public void takeCandies(int candies) {
        this.candies-=candies;
    }
}
