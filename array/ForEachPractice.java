package array;

public class ForEachPractice {
        public static void main(String[] args) {
            /*
        in the for loop
        for (int i=0;i<numbers.lenght;i++){
            numbers[i]
        }
        ========================================
        For Each Loop

        int[] numbers = {12, 34, 7, 8, 9, 10};
        for (int num : numbers) {
            num
        }
    */
            int[] numbers = {45,23,5,7,21,66,100};
            //print out each element from this array by using for-each loop

            for (int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println("\n===");
            for ( int num:numbers){
                System.out.print(num+" ");
            }
            System.out.println("\n===");
            String flowers[]={"rose","lily","orchid","violet","tulip"};
            for(String flower:flowers){
                System.out.print(flower+" ");
                System.out.println("\t"+flowers[0]);
            }
            System.out.println("===");
        }
    }


