package mentoring2.RecapTask;

public class groceryStore {
    int soldApplesPY;
    double priceApple;
    int soldOrangePY;
    double priceOrange;
    String city;

    public groceryStore(int soldApplesPY, double priceApple, int soldOrangePY, double priceOrange,String city) {
        this.soldApplesPY = soldApplesPY;
        this.priceApple = priceApple;
        this.soldOrangePY = soldOrangePY;
        this.priceOrange = priceOrange;
        this.city=city;
    }

    public double GrossRevenue(String city){
        double sum= priceApple* soldApplesPY+ priceOrange* soldOrangePY;
        System.out.println("The revenue of the "+city+" is = "+sum);
        return sum;
    }
    public void GrossRevenue1(String city){
        double sum= priceApple* soldApplesPY+ priceOrange* soldOrangePY;
        System.out.println("The revenue of the "+city+" is = "+sum);
        }

}
