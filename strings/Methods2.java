package strings;

public class Methods2 {
    public static void main(String[]args){

        String flower ="Rose";

        int indexOfR=flower.indexOf('R');
        int indeOfR1=flower.indexOf("R");
        //both is fine both is work
        System.out.println("first implementation "+indexOfR);   //0
        System.out.println("second implementation "+indeOfR1);  //0
        System.out.println(flower.indexOf("o"));                //1
        System.out.println(flower.indexOf("os"));               //1

        System.out.println(flower.indexOf("o,s"));// -1 if it does not find matching char/char sequence
                                                  //it will return -1

        System.out.println(flower.indexOf("r"));    // -1 no have lowercase r
        System.out.println(flower.indexOf("Rose")); //0
        System.out.println(flower.indexOf("rose")); //-1 dont match
        System.out.println(flower.indexOf("Roses")); //-1

        String object="umbrellam";
        System.out.println("----->" +object.indexOf("e",6));
        System.out.println(object.indexOf("l"));//5
        System.out.println(object.indexOf("l",6));//6  find second l

        System.out.println(object.indexOf("m",object.indexOf("m")+1));// find second m

        System.out.println(object.length());

        System.out.println(object.indexOf('r'));
        String sentence="I love lilies";
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')) ); //it finds seconds i

        //toUppercase()---> makes your string as Uppercase
        //toLowercase()---> makes your string as Lowercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        System.out.println(sentence.toLowerCase());

        //think about making single letter uppercase from a string
        String sentence1= "sentence one";
        System.out.println(sentence1.substring(0, 1).toUpperCase() + sentence1.substring(1)); // i found internet
        //                  which character          to upper       +to adding below then
        //it just only to first character upper

        String str="Just do it";
        // indexOf()-----> returning number
        // charAt() -----> returning char

        char Letter= str.charAt(str.indexOf("d"));
        //System.out.println(Letter);

        String str2="";
        str2+=Letter;
        System.out.println(str2.toUpperCase());
    }
}
