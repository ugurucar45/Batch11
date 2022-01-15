package stringBuilder;

public class Practice1 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("Techtorial");

        //charAt();
        Character ch=builder.charAt(2);
        System.out.println(ch);                                    //c

        //length();
        double d =builder.length();
        System.out.println(d);                                     //10

        //indexOf()
        System.out.println(builder.indexOf("t"));                  //4
        System.out.println(builder.indexOf("t",3));    //4

        //subsString()
        System.out.println(builder.substring(5));   //orial
        String sub=builder.substring(5);
        //StringBuilder sub1= builder.substring(5);

        StringBuilder sub2= new StringBuilder(builder.substring(5));
        StringBuilder sub3= new StringBuilder(sub);
        System.out.println(builder.substring(2,5));     //cht

        //insert()
        builder.insert(4,"TECH");
        System.out.println(builder);                    //TechTECHtorial

        builder.insert(builder.length()," ACADEMY");
        System.out.println(builder);                    //TechTECHtorial ACADEMY

        //delete()
        builder.delete(0,4);
        System.out.println(builder);                    //TECHtorial ACADEMY

        //deleteCharAt()
        builder.deleteCharAt(builder.indexOf(" "));
        System.out.println(builder);                    //TECHtorialACADEMY

        //reverse this builder
//        StringBuilder builder1=new StringBuilder();
//        for(int i=builder.length()-1;i>-1;i--){
//            builder1.append(builder.charAt(i));
//        }
//        System.out.println(builder1);


        System.out.println(builder.reverse());          //YMEDACAlairotHCET
        System.out.println(builder);                    //YMEDACAlairotHCET

        builder.reverse();
        System.out.println(builder);                    //TECHtorialACADEMY

        //replace()
        builder.replace(4,10,"$$");
        System.out.println(builder);                    //TECH$$ACADEMY

        builder.replace(builder.indexOf("$"),builder.lastIndexOf("$")+1,"******");
        System.out.println(builder);                    //TECH******ACADEMY

        //toString()
        String string=builder.toString();

        System.out.println(string);                     //TECH******ACADEMY
        string=string.concat("Student");
        System.out.println(string);                     //TECH******ACADEMYStudent

    }
}
