package PracticeMyself.WeeklyProject7;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static PracticeMyself.WeeklyProject7.Instructions.getInstructions;


/*
 * This is your main page where the vending machine application is going to be triggered and
 * all inputs being accepted.
 */
public class WelcomePage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Techtorial sponsored vending machine!");
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Nice to meet you, " + name);
        System.out.println("Please press 0 for available options...");
        int allOptions = getIntegerInput(scanner, new Integer[]{0});
        getInstructions(allOptions);
        scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);//String sc
        Scanner sc1 = new Scanner(System.in);//Int sc
        System.out.println("Enter what you want to do: ");
        Products pro = new Products();
        String exit = "";
        do {
            pro.instru();
            switch (getIntegerInput(scanner, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8})) {
                case 1:
                    pro.listAll();
                    break;
                case 2:
                    pro.listAll();
                    System.out.println("Please Select any item");
                    String a = sc.nextLine();
                    pro.selectProductPrice(a);
                    pro.remainInventory(a);
                    pro.selectProductInventoryNumber(a);
                    break;
                case 3:
                    int sItemPri = 0;
                    String a11 = "";
                    do {
                        System.out.println("Select your product,\nselect from product's list");
                        pro.listAll();
                        System.out.println();
//                        pro.allInventoryNumbers();
                        String b = sc.nextLine();
                        String names = pro.selectProductName(b);
                        if (pro.selectProductName(b).equals(b)) {
                            pro.selectProductPrice(b);
                            sItemPri += pro.getProductPrice(b);
                            System.out.println("Are you want to buy");
                            pro.buyAProduct(b);
                        } else {
                            System.out.println(b + " is not in our inventory");
                        }
                        System.out.println("You spend totaly " + sItemPri + "$\n Are you want to select another item? y/n");
                        a11 = sc.nextLine();
                    } while (a11.equals("y"));
                    break;
                case 4:
                    pro.listAll();
                    System.out.println("\nPlease get item");
                    String c = sc.nextLine();
                    System.out.println(pro.selectProductName(c) + "'s price is " + pro.selectPrice(c));
                    break;
                case 5:
                    pro.getAllPrices();
                    break;
                case 6:
                    System.out.println("Please enter your price range");
                    int bud = sc1.nextInt();
                    pro.yourBudget(bud);
                    break;
                case 7:
                    exit = "n";
                    break;
                case 8:
                    System.out.println("Which item do you want to buy?");
                    String dd = sc.nextLine();
                    pro.buyAProduct(dd);
                    break;
            }
            if (exit.equals("n")) {
            } else {
                System.out.println("\nAre you want to shopping to y/n");
                exit = sc.nextLine();
            }
        } while (exit.equals("y"));
        System.out.println("\nThanks for shopping with us");
    }
    private static int getIntegerInput(Scanner scanner, Integer[] expected) {
        int allOptions = -1;
        for (int i = 1; i <= 3; i++) {
            scanner = new Scanner(System.in);
            int input;
            try {
                input = scanner.nextInt();
                if (!Arrays.asList(expected).contains(input)) {
                    throw new IOException();
                }
            } catch (Exception e) {
                if (i < 3) {
                    System.out.println("Please enter 0");
                    System.out.printf("You have %d more retries", 3 - i);
                    System.out.println();
                } else {
                    System.out.println("Sorry, try next time");
                    System.exit(1);
                }
                continue;
            }
            allOptions = input;
            break;
        }
        return allOptions;
    }
    private static void getInstructions(int allOptions) {
    }
}
