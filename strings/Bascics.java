package strings;

public class Bascics {
    public static void main(String[] args) {
        String word="Tech";                          //attach string
        System.out.println(word);

        String word2= new String("Tech");     //attach
        System.out.println(word2);

        String word3= "Tech"+"Torial";
        System.out.println(word3);

        System.out.println(word+"JAVA");
        System.out.println(word);
        System.out.println(word+"77");
        System.out.println(word+7+8);
        //System.out.println(word+7-8);    it doesnt work
        System.out.println(word+(7-8));
        System.out.println(word+7*8);
        System.out.println(7+8+word+7+8); // 15Tech78
                                        // after word it becames string

        word+="torial";
        System.out.println(word);   //Techtorial
        word+=33-11;
        System.out.println(word);   //Techtorial22

        String str="just do it ";
        System.out.println(str);
        String str1= new String("what ever it takes");
        System.out.println(str1);

        System.out.println(str+str1);

        String str2="1234556";

        String result= str+str1+str2;
        System.out.println(result);

    }
}
