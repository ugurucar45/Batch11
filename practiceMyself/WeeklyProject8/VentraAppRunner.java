package practiceMyself.WeeklyProject8;


import java.util.Scanner;

public class VentraAppRunner {

    VentraCardMachine machine = new VentraCardMachine("Chicago");

    public static void main(String[] args){
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
    }

    private static void makeAChoice(String choice){
        int a=0;
        do {
            VentraCardMachine machine = new VentraCardMachine("Chicago");
            switch (choice) {
                case "0":
                    System.out.println("Thank you for working with us");
                    a=1;
                    break;
                case "1":
                /*
                1- Using scanner get the information of User (FullName, PhoneNumber, Email)
                2- Create new card According to this information(Call createCard method)
                3- Call addCard method from VentraCard Machine and add new card
                 */
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Full Name");
                    String fullName = sc.nextLine();
                    System.out.println("Enter Phone Number");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Enter email");
                    String email = sc.nextLine();
                    machine.addCard(fullName,phoneNumber,email);
                    break;
                case "2":
                    machine.cardHoldersNameAndCardName(machine.getAllCards());
                    break;
                case "3":
                    machine.printCardNumbers(machine.getAllCards());
                    break;
                case "4":
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter Full Name");
                    String fullName1 = sc1.nextLine();
                    System.out.println("Enter Phone Number");
                    String phoneNumber1 = sc1.nextLine();
                    System.out.println("Enter email");
                    String email1 = sc1.nextLine();
                    System.out.println("Enter oldCarNumber");
                    long oldCardNumber = sc1.nextLong();
                    VentraCard num1 = new VentraCard(fullName1, phoneNumber1, email1);
                    machine.updateCard(oldCardNumber, num1);
                    break;
                case "5":
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter oldCarNumber");
                    long oldCardNumber1 = sc3.nextLong();
                    System.out.println("Enter newCarNumber");
                    long newCardNumber1 = sc3.nextLong();
                    machine.updateCardNumber(oldCardNumber1, newCardNumber1);
                    break;
                case "6":
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Enter oldCarNumber");
                    long oldCardNumber2 = sc4.nextLong();
                    System.out.println("Enter email");
                    String email2 = sc4.nextLine();
                    machine.replaceEmail(oldCardNumber2, email2);
                    break;
                case "7":
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter phone Number");
                    long phoneNumber2 = sc2.nextLong();
                    machine.showInfo(phoneNumber2);
                    break;
                case "8":
                    printOptions();
                    break;
            }
        }while(a==0);
    }

    public static void welcome(){

        System.out.println("Welcome to the Ventra card");
    }

    public static void printOptions(){

        System.out.println("Hello. Please choose one of the following options");
        System.out.println("1 - For new card");
        System.out.println("2 - To print all card holders name and card number");
        System.out.println("3 - To print ventra card numbers");
        System.out.println("4 - To update the Ventra Card  with New Card");
        System.out.println("5 - To update the card number");
        System.out.println("6 - To update existing card email address");
        System.out.println("7 - To search the card with phone number and print all card information");
        System.out.println("8 - To print available options");
        System.out.println("0 - To exit");
    }
}
