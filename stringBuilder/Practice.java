package stringBuilder;

import immutable.Phone;

public class Practice {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        StringBuilder builder1=new StringBuilder("Techtorial");
//        StringBuilder builder2="Text";    //will not compile
        StringBuilder builder2=new StringBuilder(10);

        System.out.println(builder);//          (empty)
        builder.append("Winter");           //append is basicly concat method
        System.out.println(builder);//winter

        builder.append(" is cold");
        System.out.println(builder);//winter is cold
        //==============
        String str="";
        for(char ch='a';ch<='z';ch++){
            str+=ch;
            System.out.println(str);
        }
        //==============
        StringBuilder builder3=new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            builder3.append(ch);
            System.out.println(builder3);
        }
        //=============="Winter is Cold"============
        builder.append(" "+33+" ");
        builder.append(false);

        System.out.println(builder);
        builder.append(" degree").append(" negative").append(" "+'&'+" ");
        System.out.println(builder);

        //===========example1
        StringBuilder success=new StringBuilder("Working Hard");
        success.append(" does not make you successful.");
        StringBuilder truth=success.append("Thinking hard makes you successful.");
        System.out.println(success);
        System.out.println(truth);
        //=============example2
        StringBuilder success1=new StringBuilder("Tech");
        success1.append("torial");
        StringBuilder truth1=success1.append(" 2020");//whatever you change both are same because truth1 is not a new object
        truth1.append(" Best").append(" Summer");
        success1.append("***");
        System.out.println(success1);
        System.out.println(truth1);
        //==============
        Phone phone=new Phone();
        Phone phone1=phone;
    }
}
