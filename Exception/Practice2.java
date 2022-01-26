package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Practice2 {
    public static void readFromFile() throws IOException, InterruptedException {

        try {
            FileInputStream file = new FileInputStream("Test.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException exception){
            System.out.println("I couldnt find File to read, please check file name/path");
        }finally {
            System.out.println("This is end of execution");
            System.gc();
        }

                // wait time like this
        Thread.sleep(10000);
        System.out.println("Break Time");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        readFromFile();
    }
}
