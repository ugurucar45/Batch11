package practiceMyself.WeeklyProject7;

import java.util.Scanner;

public class Products {

    /*
     * Please add more vending machine features
     * - Buy a product
     * - Search for a product
     * - Get list of products
     */

    private static String[] products = new String[]{"Monitor", "Mouse", "Keyboard", "USB cable", "Charger", "Mouse pad"};
    private static int[] prices = new int[]{100, 70, 89, 17, 99, 5};
    private static int[] inventory = new int[]{4, 10, 5, 10, 5, 7};

    public void itemsName() {
    }

    public void listAll() {
        for (int i = 0; i < products.length; i++) {

            if (i == products.length - 1) {
                System.out.print(products[i]);
            } else {
                System.out.print(products[i] + ", ");
            }
        }
    }

    public static String[] getAllPrices() {
        System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j] + ": $" + prices[j]);
        }
        return products;
    }

    public static int getProductPrice(String productName) {
        int pri = prices[selectProduct(productName)];
        return pri;
    }

    public static int selectProduct(String productName) {
        int a = 0;
        //loop over the product list to find out if it is available in our vending machine
        //if yes find the price (tip: call a specific method)
        //and verify this product is available in inventory
        //ask if customer wants to buy it -> if yes call another method to buy a product
        //								-> if no call method to cancel it
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(productName)) {
                a = i;
            }
        }
        return a;
    }

    public static String selectProductName(String productName) {
        String aa = products[selectProduct(productName)];
        return aa;
    }

    public static void selectProductPrice(String productName) {
        int pri = prices[selectProduct(productName)];
        System.out.println(productName + "'s price is " + pri + " $");
    }

    public static int selectPrice(String productName) {
        int pri = prices[selectProduct(productName)];
        return pri;
    }

    public static void selectProductInventoryNumber(String productName) {
        int num = selectProduct(productName) + 1;
        System.out.println(productName + "'s inventory number is " + num);
    }

    public static void allInventoryNumbers() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + "'s inventory Numbers is " + (i + 1));
        }
    }

    public static void remainInventory(String productName) {
        int a = selectProduct(productName);
        System.out.println(inventory[a] + " " + productName + " left in our stock");
    }


    public static void buyAProduct(String productName) {

        /*
        Apply payment logic.
        Apply give back change logic
        Apply inventory update logic: if someone buys an item, we should decrement number of available items.
         */
        int payment = 0;

        int price = getProductPrice(productName);
        Scanner pr = new Scanner(System.in);
        System.out.println("Please Pay " + price + " Dollar");
        payment = pr.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (products[i].toLowerCase().equals(productName.toLowerCase())) {
                // Create  a do while loop logict and do not continue until user wants to stop or
                // gives the right amount money
                if (payment == price) {
                    inventory[i] -= 1;
                    System.out.println("Enjoy your " + productName);
                } else if (payment > prices[i]) {
                    inventory[i] -= 1;
                    System.out.println("Enjoy your " + productName + " your Change is = " + (payment - prices[i]));
                } else {
                    System.out.println("You need " + (prices[i] - payment) + " dollar more");
                }
            }
        }
    }

    public static void yourBudget(int budge) {
        for (int i = 0; i < products.length; i++) {
            if (budge > prices[i]) {
                System.out.println(products[i] + "in your price range \n"+products[i]+"'s prices is "+prices[i]);
            } else {
            }
        }
    }
    public void instru(){
        System.out.println(" * Vending machine options are:\n" +
                "                 * 1 - List all items/products, names of products\n" +
                "                 * 2 - Get item/product info (details, availability), price and inventory number\n" +
                "                 * 3 - Select a product\n" +
                "                 * 4 - Get item/product price\n" +
                "                 * 5 - List all prices\n" +
                "                 * 6 - Set price range\n" +
                "                 * 7 - Exit\n" +
                "                 * 8 - Buy an item");
    }


}
