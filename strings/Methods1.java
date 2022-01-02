package strings;

public class Methods1 {
    public static void main(String[]args){
//        //============String methods============
//        //.concat();    ---------> adding strings together , takes string parameter
//        //.charAt();    ---------> returning single character, takes int parameter
//
//        //.lenght();    ---------> returns length of the string
//        String name="Zack";
//        name.concat("xxx");//----> Zackxxx
//        name.charAt(1);// ----> 'a'
//
//        name.length();//  ----> 7

//        //indexOf();    ---------> returns index number of given char
//        name.indexOf('a');----> 1
//        name.indexOf("a");----> 1
//
//        //startsWith();---> name.startsWith("Z");     ---> return---> true
//                            name.startsWith("Zac");   ---> return---> true
//                            name.startsWith("ack");   ---> return---> false
//        //endsWith();---> name.endsWith("Z");         ---> return---> false
//                            name.endsWith("Zac");     ---> return---> false
//                            name.endsWith("ack");     ---> return---> true
//                            name.endsWith("k");       ---> return---> true
//                            name.endsWith("K");       ---> false
//
//        //contains(); it will if the string has given value or not, returns true/false
//        //equals(); it will check if the given string has exactly same order of char. will return true/false
//


        String device = "microphone";
        device.concat(" is an input device");
        System.out.println(device); // microphone is an input device
        char ch= device.charAt(1);
        System.out.println(ch);     //i

        int letterCount=device.length();    // mic rop hon e===10
        System.out.println(letterCount);    //10
        device+=" is expensive";            //device lenght 10+13= 23
        System.out.println(device.length());//23

        device.concat(" device");           // no assigment
        System.out.println(device.length());//23

        device =device.concat(" device");   // assigment
        System.out.println(device.length());//30

        //take last char from this last version of string
        System.out.println((int)device.charAt(29));// e last character

        String says= "Yıl boyunca eş güdümlü evrensel zaman (UTC) olduğu için " +
                "yaz saati uygulaması yoktur. Türkiye için IANA zaman dilimi " +
                "tanımlayıcısı Europe/Istanbul'dur. Wikipedia";

        char lastchar=says.charAt(says.length()-1);
        System.out.println(says.charAt(says.length()-1));       //last char character
        System.out.println(lastchar);


        String exapmle= "Thanksgiving is over. The price of the turkey will go down.So you can find more inexpensive purchases";

        char lastone=exapmle.charAt(exapmle.length()-1);
        System.out.println(lastone);


        String school="Techtorial";
        //find the middle char from last string
        char middle=school.charAt((school.length()-1)/2);
        System.out.println(middle);

        //System.out.println(school.charAt(15)); //exception StringIndexOutOfBoundsException, since there is no 15th index

    }
}
