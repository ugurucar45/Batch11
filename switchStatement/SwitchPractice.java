package switchStatement;

public class SwitchPractice {
    public static void main(String[] args) {


        System.out.println("Before Switch");
        int number = 2000;
        switch (number) {
            default:                                //hic biri calismazsa default calisir
             //   System.out.println("this is default case");
                break;                              //default yoksa hicbiri calismazsa atlanir
            case 110:
                System.out.println("this is second case");
                break;
            case 120:
                System.out.println("this is third case");
                break;
            case 123:
                System.out.println("this is fourth case");
                break;
            case 130:
                System.out.println("this is fifth case");
                break;
            case 100:// if number=100 shows it
                System.out.println("this is first case");
                break;

        }
        System.out.println("After switch");
    }
}
