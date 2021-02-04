public class IceCream extends DesertItem{
    private int iceCreams;
    private int iceCreamPrice;
    public IceCream(int iceCreamPrice){
        iceCreams=0;
        this.iceCreamPrice=iceCreamPrice;
    }
    @Override
    public int getCost() {
        return 0;
    }
    public int addIceCreams(int iceCreams){
        this.iceCreams+=iceCreams;
        return this.iceCreams;
    }
    public int getIceCreamPrice() {
        return iceCreamPrice;
    }
    public int getIceCreams() {
        return iceCreams;
    }
    public void takeIceCreams(int iceCreams) {
        this.iceCreams-=iceCreams;
    }
}
