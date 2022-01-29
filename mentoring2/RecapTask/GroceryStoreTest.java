package mentoring2.RecapTask;

public class GroceryStoreTest {
    public static void main(String[] args) {
        groceryStore houstonStore=new groceryStore(534,0.99,429,0.87,"Houston");

        System.out.println("Apples sold ="+ houstonStore.soldApplesPY+"\n"+ "Apple retail price ="+
                houstonStore.priceApple+"\n"+"Oranges sold ="+houstonStore.soldOrangePY+"\n"+ "Orange retail Price ="+
                houstonStore.priceOrange );

        groceryStore seattleStore=new groceryStore(765,0.86,842,0.91,"Seattle");

        System.out.println("Apples sold ="+ seattleStore.soldApplesPY+"\n"+ "Apple retail price ="+
                seattleStore.priceApple+"\n"+"Oranges sold ="+seattleStore.soldOrangePY+"\n"+ "Orange retail Price ="+
                seattleStore.priceOrange );

        double houstonRevenue= houstonStore.GrossRevenue(houstonStore.city);
        double seattleRevenue= seattleStore.GrossRevenue(seattleStore.city);
        double totalRevenue=houstonRevenue+seattleRevenue;
        System.out.println("Total revenue is ="+totalRevenue);



    }
}
