package PracticeMyself.WeeklyProject2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) throws IOException {

        String USD_TR_Rate_url = "https://free.currconv.com/api/v7/convert?q=USD_TRY&compact=ultra&apiKey=0caa640762c312ee7e19";
        //get a new variable from api sites
        Scanner scanner;        //get scanner

        ///do a get call to DOllar-Turkish Lira API
        URL url = new URL(USD_TR_Rate_url);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        /// convert the api reponse to string
        String content = new String(con.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
                //System.out.println("API response: "+ content);//(i m just just chek that)
        // extract the rate from the response
        double USD_TRY_rate = Double.valueOf(content.substring(content.indexOf(":") + 1, content.length() - 1));
        ///disconnect from HttpURLConnection
        con.disconnect();


        int input;        // create new variable because i want to users input true numbers
        while (true) {    // it is beginning loop from the all programs
            System.out.print("Convert US Dollar to TL => [1]\n" +
                    "Convert TL to US Dollar => [2]" +
                    "\nto Exit =>[0]" +
                    "\nEnter [0/1/2] : ");
            try {// created from the exception, if users input some string i say dont do that and starting program again,
            scanner= new Scanner(System.in);//create scanner for which math
            input = scanner.nextInt();  //scanner input create variable for which math

                        if (input == 2) { // i create if variables for a which exchange rate or exit the program

                            System.out.print("Input How much Turkish Lira to be converted to US Dollars: ₺");
                            double Tl = scanner.nextDouble(); // call scanner and i create new Tl variable from scanner input

                            //do the calculation
                            double dollar = (Tl * (1 / USD_TRY_rate));
                            System.out.println("You have " + Tl + " ₺\nConverted from  $" + dollar+"\n\n");


                            }
                            else if (input == 1) { // i create if variables for a which exchange rate or exit the program

                            System.out.print("Input How much US Dollars to be converted to Turkish Lira : $");
                            double dolar = scanner.nextDouble();// call scanner and i create new Tl variable from scanner input

                            //do the calculation
                            double tll = (dolar * (USD_TRY_rate));
                            System.out.println("You have " + tll + " ₺\nConverted from  $" + dolar+"\n\n");
                            }
                            else if(input == 0){// i create if variables for a which exchange rate or exit the program
                            System.out.println("Thanks for using UGUR's app!");
                            break;// close the program
                            }
                        else {
                        System.out.println("Please only enter 0  1  or  2\n\n");
                        }
            } catch (Exception e) { //all of programs are in this exception colums
            System.out.println("You have an invalid Entry\n\n");
            continue;//(end of loop)
            }


        }
    }
}