package practiceMyself.WeeklyProject4;

import java.io.IOException;
import java.net.URI;
import java.util.Locale;
import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) throws IOException {
        Scanner stc = new Scanner(System.in);   // string scanner
        Scanner in = new Scanner(System.in);    // in scanner
        Scanner ssss = new Scanner(System.in);
        String str, playAgain;
        int clasprice = 2, popprice = 4, countryprice = 3;
        do {
            String ugur = "";                                                                   // loop beginning
            System.out.println("Please enter the music type: (classical, pop, or country)");
            str = ssss.nextLine().toLowerCase();                                                //
            if (str.equals("classical")) {
                System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The\n" +
                        "Planets is available music under our music box\n Which one do you want to listen? ");
                String nameCl = ssss.nextLine().toLowerCase();
                if (nameCl.equals("four seasons") || nameCl.equals("fur elise") || nameCl.equals("finlandia") || nameCl.equals("vocalise") ||
                        nameCl.equals("the planets")) {
                    System.out.println("Please enter the 2$ for this music");
                    int name = in.nextInt();
                    if (name < clasprice) {
                        System.out.println(name + "$ is not enough. Please try later.");
                    } else {
                        if (nameCl.equals("four seasons")) {
                            ugur = "https://www.youtube.com/watch?v=GRxofEmo3HA";
                        }
                        if (nameCl.equals("fur elise")) {
                            ugur = "https://www.youtube.com/watch?v=_mVW8tgGY_w";

                        }
                        if (nameCl.equals("finlandia")) {
                            ugur = "https://www.youtube.com/watch?v=fE0RbPsC9uE";
                        }
                        if (nameCl.equals("vocalise")) {
                            ugur = "https://www.youtube.com/watch?v=DuBexGEe1S4";
                        }
                        if (nameCl.equals("the planets")) {
                            ugur = "https://www.youtube.com/watch?v=Isic2Z2e2xs";
                        }

                        System.out.println(nameCl.substring(0, 1).toUpperCase() + nameCl.substring(1) + " is playing. Enjoy with the song");
                        if (name > clasprice) {
                            System.out.println("You have " + (name - clasprice) + "$ more. Please wait for change.");
                            name -= clasprice;
                        }
                    }
                } else {
                    System.out.println(nameCl.substring(0, 1).toUpperCase() + nameCl.substring(1) + " is not available song.");
                }
            } else if (str.equals("pop")) {
                System.out.println("Bad guy, Talk, Please Me, 7 Ring, Without Me is\n" +
                        "available songs under Pop music \nWhich one do you want to listen?");
                String namePop = ssss.nextLine().toLowerCase();
                if (namePop.equals("bad guy") || namePop.equals("talk") ||
                        namePop.equals("please me") || namePop.equals("7 ring") || namePop.equals("without me is")) {
                    System.out.println("Please enter the 4$ for this music");
                    int name = in.nextInt();
                    if (name < popprice) {
                        System.out.println(name + "$ is not enough. Please try later.");
                    } else {
                        if (namePop.equals("bad guy")) {
                            ugur = "https://www.youtube.com/watch?v=DyDfgMOUjCI";
                        }
                        if (namePop.equals("talk")) {
                            ugur = "https://www.youtube.com/watch?v=hE2Ira-Cwxo";
                        }
                        if (namePop.equals("please me")) {
                            ugur = "https://www.youtube.com/watch?v=3y-O-4IL-PU";
                        }
                        if (namePop.equals("7 ring")) {
                            ugur = "https://www.youtube.com/watch?v=QYh6mYIJG2Y";
                        }
                        if (namePop.equals("without me is")) {
                            ugur = "https://www.youtube.com/watch?v=YVkUvmDQ3HY";
                        }
                        System.out.println(namePop.substring(0, 1).toUpperCase() + namePop.substring(1) + " is playing. Enjoy with the song");
                        if (name > popprice) {
                            System.out.println("You have " + (name - popprice) + " $ more. Please wait for change.");
                            name -= popprice;
                        }
                    }
                } else {
                    System.out.println(namePop.substring(0, 1).toUpperCase() + namePop.substring(1) + " is not available song.");
                }
            } else if (str.equals("country")) {
                System.out.println("Meant to Be, Heaven, Simple, One Number Away,\n" +
                        "Get Along is available songs under County music \nWhich one do you want to listen?");
                String nameCo = ssss.nextLine().toLowerCase(Locale.ROOT);
                if (nameCo.equals("meant to be") || nameCo.equals("heaven") || nameCo.equals("simple") || nameCo.equals("one number away") || nameCo.equals("get along")) {
                    System.out.println("Please enter the 3$ for this music");
                    int name = in.nextInt();
                    if (name < countryprice) {
                        System.out.println(name + "$ is not enough. Please try later.");
                    } else {
                        if (nameCo.equals("without me is")) {
                            ugur = "https://www.youtube.com/watch?v=zDo0H8Fm7d0";
                        }
                        if (nameCo.equals("heaven")) {
                            ugur = "https://www.youtube.com/watch?v=s6TtwR2Dbjg";
                        }
                        if (nameCo.equals("simple")) {
                            ugur = "https://www.youtube.com/watch?v=3GeaYy6zlXU";
                        }
                        if (nameCo.equals("one number away")) {
                            ugur = "https://www.youtube.com/watch?v=Ct9BFr9XBaI";
                        }
                        if (nameCo.equals("get along")) {
                            ugur = "https://www.youtube.com/watch?v=-LI8X-GhFA8";

                        }
                        System.out.println(nameCo.substring(0, 1).toUpperCase() + nameCo.substring(1) + " is playing. Enjoy with the song");
                        if (name > countryprice) {
                            System.out.println("You have " + (name - countryprice) + "$ more. Please wait for change.");
                            name -= countryprice;
                        }
                    }
                } else {
                    System.out.println(nameCo.substring(0, 1).toUpperCase() + nameCo.substring(1) + " is not available song.");
                }
            } else {
                System.out.println("The " + str + " music category is not available");
            }
            try {
                URI uri = new URI(ugur);
                java.awt.Desktop.getDesktop().browse(uri);
                System.out.println("Web page opened in browser");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Are you want listen again y/n");
            playAgain = ssss.nextLine();
        } while ((playAgain.equals("y")));
    }
}
