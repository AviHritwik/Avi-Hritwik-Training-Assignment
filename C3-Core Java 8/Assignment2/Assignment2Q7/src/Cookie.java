public class Cookie extends DesertItem{
    private int cookies;
    private int cookiePrice;
    public Cookie(int cookiePrice){
        cookies=0;
        this.cookiePrice=cookiePrice;
    }
    @Override
    public int getCost() {
        return 0;
    }
    public int addCookies(int cookies) {
        this.cookies=cookies;
        return this.cookies;
    }
    public int getCookiePrice() {
        return cookiePrice;
    }
    public int getCookies(){
        return cookies;
    }
    public void takeCookies(int cookies) {
        this.cookies-=cookies;
    }
}
