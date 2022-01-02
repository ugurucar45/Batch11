package practiceMyself.WeeklyProject4;

import java.util.Scanner;

public class AijanaCode {
    public static void main(String[] args) {
        System.out.println("Please enter the music type");
        Scanner sc = new Scanner(System.in);
        String musicCategory = sc.nextLine();
        Scanner scc=new Scanner(System.in);
        String yesorno;
       do {
           if (musicCategory.equalsIgnoreCase("Classical")) {
               System.out.println("Please select of the following: 1.Fur Seasons 2. Fur Elise 3. Finlandia 4.Vocalise  5.The Planets. Which one do you want to listen?");
               String song = sc.nextLine();
               if (song.equalsIgnoreCase("Fur Seasons") ||
                       song.equalsIgnoreCase("Fur Elise") ||
                       song.equalsIgnoreCase("Finlandia") ||
                       song.equalsIgnoreCase("Vocalise") ||
                       song.equalsIgnoreCase("The Planets")) {
                   System.out.println("Please enter the 2$ for this song");
                   int songPriceCl = 2;
                   int songPriceClUser = sc.nextInt();
                   if (songPriceClUser == songPriceCl) {
                       System.out.println(song + " is playing. Enjoy!");
                   }
                   if (songPriceClUser < songPriceCl) {
                       System.out.println(songPriceClUser + " is not enough,please try later");
                   }
                   if (songPriceClUser > songPriceCl) {
                       System.out.println(songPriceClUser + " you have entered $ " + (songPriceClUser - songPriceCl)
                               + " dollars more. Please wait for change");
                   }
               } else {
                   System.out.println(song + " is not available song");
               }
           } else if (musicCategory.equalsIgnoreCase("Pop")) {
               System.out.println("Please select of the following:1.Bad guy 2. Talk 3. Please me 4.Ring  5.Without me. Which one do you want to listen?");
               String song = sc.nextLine();
               if (song.equalsIgnoreCase("Bad guy") ||
                       song.equalsIgnoreCase("Talk") ||
                       song.equalsIgnoreCase("Please me") ||
                       song.equalsIgnoreCase("7 Ring") ||
                       song.equalsIgnoreCase("Without me")) {
                   System.out.println("Please enter the 3$ for this song");
                   int songPricePop = 3;
                   int songPricePopUser = sc.nextInt();
                   if (songPricePopUser == songPricePop) {
                       System.out.println(song + "is playing. Enjoy");
                   }
                   if (songPricePopUser < songPricePop) {
                       System.out.println(songPricePopUser + " is not enough,please try later");
                   }
                   if (songPricePopUser > songPricePop) {
                       System.out.println(songPricePopUser + " you have entered $ " + (songPricePopUser - songPricePop)
                               + " dollars more. Please wait for change");
                   }
               } else {
                   System.out.println(song + " is not available song");
               }

           } else if (musicCategory.equalsIgnoreCase("Country")) {
               System.out.println("Please select of the following: 1.Meant to be 2. Heaven 3. Simple 4. One Number Away 5. Get Along. " +
                       "Which one do you want to listen?");
               String song = sc.nextLine();
               if (song.equalsIgnoreCase("Meant to be") ||
                       song.equalsIgnoreCase("Heaven") ||
                       song.equalsIgnoreCase("Simple") ||
                       song.equalsIgnoreCase("One Number Away ") ||
                       song.equalsIgnoreCase("Get Along")) {
                   System.out.println("Please enter the 4$ for this song");
                   int songPriceCountry = 4;
                   Scanner input = new Scanner(System.in);
                   int songPriceCountryUser = input.nextInt();
                   if (songPriceCountryUser == songPriceCountry) {
                       System.out.println(song + "is playing. Enjoy");
                   }
                   if (songPriceCountryUser < songPriceCountry) {
                       System.out.println(songPriceCountryUser + " is not enough,please try later");
                   }
                   if (songPriceCountryUser > songPriceCountry) {
                       System.out.println(songPriceCountryUser + " you have entered $" + (songPriceCountryUser - songPriceCountry)
                               + "dollars more. Please wait for change.");
                   }
               } else {
                   System.out.println(song + " is not available song");
               }
           } else {
               System.out.println("The music category is not available");
           }
           System.out.println("Do you want to play again y/n");
           yesorno= scc.nextLine();
       }while(yesorno.equalsIgnoreCase("y"));
    }
}
