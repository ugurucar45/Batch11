package Object;

public class Bank {
    /*
    -accountHolderName, balance, accountNumber, userName, password, isLoggedIn
-create a method that will display all account information
-create a method that will be named as deposit(), and it will update balance
-create a method that will be named as withdraw(), and it will update balance
-create a method that will be named as logIn(),
                        and will check if the user logged in or not and returns true/false
     */
    String accountHolderName;
    double balance;
    int accountNumber;     // = Student.createHour() take random method
    String userName;
    String password;
    boolean isLoggedIn = false;

    public void printInfo() {
        if(isLoggedIn){
        System.out.println(accountHolderName + " " + balance + " " + accountNumber + " " + userName + " " + password +
                " " + isLoggedIn);
    }else{
            System.out.println("Before logIn please");
        }}

    public double deposit(int depositAmaunt) {
        balance += depositAmaunt;
        System.out.println("Your balance is " + balance);
        return balance;
    }

    public double withdraw(int withdrawAmaount) {
        balance -= withdrawAmaount;
        System.out.println("Your balance is " + balance);
        return balance;
    }

    public boolean logIn(String userNAME, String passWORD) {
        if (userName.equals(userNAME) && password.equals(passWORD)) {
            System.out.println("You logged in successfully");

            isLoggedIn = true;
        } else {
            System.out.println("username or password is not matching");
        }
        return isLoggedIn;
    }

    public Bank(String accountHolderName, double balance, String userName, String password) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
        this.accountNumber = Student.createHour();
    }
    public static void main(String[]args){
        Bank c1=new Bank("Zack",200,"zack123","123");//object
        c1.logIn("zack123","333");
        c1.printInfo();

        c1.logIn("zack123","123");
        c1.printInfo();
    }
}
