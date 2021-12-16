package Loops.ForLoop;

public class MonthsOfYears {
    public static void main(String[] args) {
        /*
        print out months for the years between 2020 to 2023
        2020-> 1,2,3, ..... 12
         */
        for (int year = 2020; year <= 2023; year++) {
            System.out.print(year + " ->");
            for (int months = 1; months < 13; months++) {
                if(months==1){System.out.print(" " +months+ " January -");}
                if(months==2){System.out.print(" " + months+" February -");}
                if(months==3){System.out.print(" " + months+" March -");}
                if(months==4){System.out.print(" " +months+ " April -");}
                if(months==5){System.out.print(" " + months+" May -");}
                if(months==6){System.out.print(" " + months+" June -");}
                if(months==7){System.out.print(" " + months+" July -");}
                if(months==8){System.out.print(" " + months+" August -");}
                if(months==9){System.out.print(" " + months+" October -");}
                if(months==10){System.out.print(" " + months+" September -");}
                if(months==11){System.out.print(" " + months+" November -");}
                if (months == 12) {System.out.print(" " + months+" December");}

            }
            System.out.println();
        }
    }
}
