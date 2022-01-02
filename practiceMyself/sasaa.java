package practiceMyself;

public class sasaa {
    public static void main(String[] args) {

        /*
        users input 5
        1                   // 1st      1
        2 3                 // 2nd      2
        4 5 6               // 3rd      3
        7 8 9 10            // 4th      4
        11 12 13 14 15      // 5th      5

 for (counting line number){
    for(counting how many number printing)
    sout(counting numbers printing count)
 }
         */
        int input = 5, j = 0, count = 1;
        for (int i = 1; input >= i; i++) {
            j = 1;
            for (; j <= i; j++) {
                if (j == i) {
                    System.out.print(count);

                } else {
                    System.out.print(count + " ");

                }
                count++;
            }
            System.out.println();
        }


    }
}
