package mentoring2.RecapTask;

public class GroceryStoreTest {
    public static void main(String[] args) {
        groceryStore houstonStore=new groceryStore(534,0.99,429,0.87);

        System.out.println("Apples sold ="+ houstonStore.soldApplesPY+"\n"+ "Apple retail price ="+
                houstonStore.priceApple+"\n"+"Oranges sold ="+houstonStore.soldOrangePY+"\n"+ "Orange retail Price ="+
                houstonStore.priceOrange );

        groceryStore seattleStore=new groceryStore(765,0.86,842,0.91);

        System.out.println("Apples sold ="+ seattleStore.soldApplesPY+"\n"+ "Apple retail price ="+
                seattleStore.priceApple+"\n"+"Oranges sold ="+seattleStore.soldOrangePY+"\n"+ "Orange retail Price ="+
                seattleStore.priceOrange );

        double houstonRevenue= houstonStore.GrossRevenue(houstonStore.priceApple,houstonStore.soldApplesPY,
                houstonStore.priceOrange,houstonStore.soldOrangePY);
        double seattleRevenue= seattleStore.GrossRevenue(seattleStore.priceApple,seattleStore.soldApplesPY,
                seattleStore.priceOrange,seattleStore.soldOrangePY);
        double totalRevenue=houstonRevenue+seattleRevenue;
        System.out.println("Total revenue is ="+totalRevenue);



    }
}
