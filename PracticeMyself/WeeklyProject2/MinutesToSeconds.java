package PracticeMyself.WeeklyProject2;

public class MinutesToSeconds {
    public static void main(String[] args) {
        //option1
        int min=3456789;
        int days= min/(60*24);
        int years=min/(60*24*365);
        days=days%365;

        System.out.println(min+ " minutes is ---> "+ years+" years "+days+" day");
        //option2
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Input How many years   ===> ");
//        int year= scanner.nextInt();
//        System.out.print("Input How many days    ===> ");
//        int day=scanner.nextInt();
//        System.out.print("Input How many hours   ===> ");
//        int hour=scanner.nextInt();
//        System.out.print("Input How many minutes ===> ");
//        int min=scanner.nextInt();
//
//        year=year+(day/365)+(hour/(8760))+(min/(525600));
//        System.out.println("Total year      = "+year);
//        day=(year*365)+day+(hour/24)+(min/(60*24));
//        System.out.println("Total days      = "+day);
//        hour=(day*24)+hour+(min/60);
//        System.out.println("Total hours     = "+hour);
//        min=(hour*60)+min;
//        System.out.println("Total minutes   = "+min);
//        long sec=(min)*60;
//        System.out.println("Total seconds   = "+sec);


    }
}
