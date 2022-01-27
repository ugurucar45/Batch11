package mentoring2.RecapTask;

public class groceryStore {
    int soldApplesPY;
    double priceApple;
    int soldOrangePY;
    double priceOrange;

    public groceryStore(int soldApplesPY, double priceApple, int soldOrangePY, double priceOrange) {
        this.soldApplesPY = soldApplesPY;
        this.priceApple = priceApple;
        this.soldOrangePY = soldOrangePY;
        this.priceOrange = priceOrange;
    }

    public double GrossRevenue(double priceApple, int soldApplesPY, double priceOrange, int soldOrangePY){
        double sum= priceApple* soldApplesPY+ priceOrange* soldOrangePY;
        return sum;
    }
}
