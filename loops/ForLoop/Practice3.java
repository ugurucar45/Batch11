package loops.ForLoop;

public class Practice3 {
    public static void main(String[] args) {
        //print out every letter from the string
        //print index number of the letter and a * together with the letter

        String str="Today is Snowy";
        for (int index=0;index<str.length();index++){
            System.out.print(index+"*"+str.charAt(index)+" ");
        }
        //print out only letter "y" from the string
        System.out.println("");
        for (int index=0;index<str.length();index++){
            if(str.charAt(index)=='y')
            System.out.println("Y is here >> "+index+"*"+str.charAt(index)+" ");
        }
        //count the number of letter 'N' in the given String
        int countn=0;
        for (int index=0;index<str.length();index++){
            if(str.charAt(index)=='n')
                countn++;
        }
        System.out.println("There are "+countn+" 'n' in the string");


    }
}
