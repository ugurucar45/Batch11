package practiceMyself.WeeklyProject4;

import java.util.Scanner;

public class AlexCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter type of music you prefer of the following: Classical, Pop, Country.");
        String musicCategory = sc.nextLine();
        Scanner scan = new Scanner(System.in);
        String usersAnswer;
        Scanner scaner = new Scanner(System.in);
        String answer;
        int priceClassical = 2;
        int priceCountry = 3;
        int pricePop = 4;
        do {
            if (musicCategory.equalsIgnoreCase("classical")) {
                System.out.println("You can choose one of the following:Four Seasons, Fur Elise, Finlandia, Vocalise, The Planets");
                Scanner input = new Scanner(System.in);
                String nameOfSong = input.nextLine();
                if ((nameOfSong.equalsIgnoreCase("Four Seasons")) || (nameOfSong.equalsIgnoreCase("Fur Elise")) ||
                        (nameOfSong.equalsIgnoreCase("finlandia")) || (nameOfSong.equalsIgnoreCase("vocalise")) ||
                        (nameOfSong.equalsIgnoreCase("the Planets"))) {
                    System.out.println("Please enter the " + priceClassical + " $ for this song");
                    int takenFromCustomer = input.nextInt();
                    if (takenFromCustomer == priceClassical) {
                        System.out.println("Chosen song is playing. Enjoy with the song");
                    } else if (takenFromCustomer > priceClassical) {
                        takenFromCustomer -= priceClassical;
                        System.out.println("You have entered " + takenFromCustomer + " dollar more. Please wait for change. Chosen song is playing." +
                                " Enjoy with the song");
                        System.out.println("Do you want to listen this song again and spend rest of your money? yes/no");
                        answer = scaner.nextLine();
                        if ((answer.equalsIgnoreCase("yes")) && (takenFromCustomer >= priceClassical)) {
                            do {
                                takenFromCustomer -= priceClassical;
                                System.out.println("Chosen song is playing. Please enjoy the song. Here what left " + takenFromCustomer + " $");
                                if ((takenFromCustomer) == 0) {
                                    System.out.println("You spend all your change on our music");
                                } else if (!((takenFromCustomer - priceClassical) == 0)) {
                                    System.out.println("Please take your change --> " + takenFromCustomer + " $");
                                }
                            } while (takenFromCustomer >= priceClassical);
                        } else if ((answer.equalsIgnoreCase("no"))) {
                            System.out.println("Have a good day. You will see previous option");
                        } else {
                            System.out.println("Sorry, you don't have enough on your change. Please add rest of the amount and come back later");
                        }
                    } else {
                        System.out.println(takenFromCustomer + " $ is not enough. Please add rest of the amount and come back later");
                    }
                } else {
                    System.out.println(nameOfSong + " is not available");
                }
            } else if (musicCategory.equalsIgnoreCase("country")) {
                System.out.println("You can choose one of the following:Meant to Be, Heaven, Simple, One Number Away" +
                        "Get Along is available songs under County music");
                Scanner input = new Scanner(System.in);
                String nameOfSong = input.nextLine();
                if ((nameOfSong.equalsIgnoreCase("Meant to Be")) || (nameOfSong.equalsIgnoreCase("Heaven")) ||
                        (nameOfSong.equalsIgnoreCase("Simple")) || (nameOfSong.equalsIgnoreCase("One Number Away")) ||
                        (nameOfSong.equalsIgnoreCase("Get Along"))) {
                    System.out.println("Please enter the " + priceCountry + " $ for this song");
                    int takenFromCustomer = input.nextInt();
                    if (takenFromCustomer == priceCountry) {
                        System.out.println("Chosen song is playing. Enjoy with the song");
                    } else if (takenFromCustomer > priceCountry) {
                        takenFromCustomer -= priceCountry;
                        System.out.println("You have entered " + takenFromCustomer + " dollar more. Please wait for change. Chosen song is playing." +
                                " Enjoy with the song");
                        System.out.println("Do you want to listen this song again and spend rest of your money? yes/no");
                        answer = scaner.nextLine();
                        if ((answer.equalsIgnoreCase("yes")) && (takenFromCustomer >= priceCountry)) {
                            do {
                                takenFromCustomer -= priceCountry;
                                System.out.println("Chosen song is playing. Please enjoy the song. Here what left " + takenFromCustomer + " $");
                                if ((takenFromCustomer) == 0) {
                                    System.out.println("You spend all your change on our music");
                                } else if (!((takenFromCustomer - priceCountry) == 0)) {
                                    System.out.println("Please take your change --> " + takenFromCustomer + " $");
                                }
                            } while (takenFromCustomer >= priceCountry);
                        } else if ((answer.equalsIgnoreCase("no"))) {
                            System.out.println("Have a good day. You will see previous option");
                        } else {
                            System.out.println("Sorry, you don't have enough on your change. Please add rest of the amount and come back later");
                        }
                    } else {
                        System.out.println(takenFromCustomer + " $ is not enough. Please add rest of the amount and come back later");
                    }
                } else {
                    System.out.println(nameOfSong + " is not available");
                }
            } else if (musicCategory.equalsIgnoreCase("pop")) {
                System.out.println("You can choose one of the following:Bad guy, Talk, Please Me, 7 Ring, Without Me is available " +
                        "songs under Pop music");
                Scanner input = new Scanner(System.in);
                String nameOfSong = input.nextLine();
                if ((nameOfSong.equalsIgnoreCase("Bad guy")) || (nameOfSong.equalsIgnoreCase("Talk")) ||
                        (nameOfSong.equalsIgnoreCase("Please Me")) || (nameOfSong.equalsIgnoreCase("7 Ring")) ||
                        (nameOfSong.equalsIgnoreCase("Without Me"))) {
                    System.out.println("Please enter the " + pricePop + " $ for this song");
                    int takenFromCustomer = input.nextInt();
                    if (takenFromCustomer == pricePop) {
                        System.out.println("Chosen song is playing. Enjoy with the song");
                    } else if (takenFromCustomer > pricePop) {
                        takenFromCustomer -= pricePop;
                        System.out.println("You have entered " + takenFromCustomer + " dollar more. Please wait for change. Chosen song is playing." +
                                " Enjoy with the song");
                        System.out.println("Do you want to listen this song again and spend rest of your money? yes/no");
                        answer = scaner.nextLine();
                        if ((answer.equalsIgnoreCase("yes")) && (takenFromCustomer >= pricePop)) {
                            do {
                                takenFromCustomer -= pricePop;
                                System.out.println("Chosen song is playing. Please enjoy the song. Here what left " + takenFromCustomer + " $");
                                if ((takenFromCustomer) == 0) {
                                    System.out.println("You spend all your change on our music");
                                } else if (!((takenFromCustomer - pricePop) == 0)) {
                                    System.out.println("Please take your change --> " + takenFromCustomer + " $");
                                }
                            } while (takenFromCustomer >= pricePop);
                        } else if ((answer.equalsIgnoreCase("no"))) {
                            System.out.println("Have a good day. You will see previous option");
                        } else {
                            System.out.println("Sorry, you don't have enough on your change. Please add rest of the amount and come back later");
                        }
                    } else {
                        System.out.println(takenFromCustomer + " $ is not enough. Please add rest of the amount and come back later");
                    }
                } else {
                    System.out.println(nameOfSong + " is not available");
                }
            } else {
                System.out.println(musicCategory + " TYPE OF MUSIC is not available");
                break;
            }
            System.out.println("Do you want to listen songs again? yes/no");
            usersAnswer = scan.nextLine();
        } while (usersAnswer.equalsIgnoreCase("yes"));
    }
}