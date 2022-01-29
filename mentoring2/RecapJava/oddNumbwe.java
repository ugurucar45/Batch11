package mentoring2.RecapJava;

public class oddNumbwe {
    public static void main(String[]args){
        String str="text";
        String odd="";
        for(int i=1;i<str.length();i++){
            odd+=str.charAt(i);
            i++;
        }
        System.out.println(odd);
    }
}
