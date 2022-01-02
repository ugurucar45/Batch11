package primitives;

public class LogicalNegation {
    public static void main(String[] args) {
        boolean isLightOn =true;
        System.out.println(isLightOn);  //true
        System.out.println(!isLightOn); //false

        System.out.println(5==5);       //true
        System.out.println(!(5==5));    //false
        System.out.println(1+1==3);     //false


        boolean haveMoney = false;
        haveMoney=!haveMoney;
        System.out.println(haveMoney);//true
            System.out.println(!haveMoney);
        System.out.println(isLightOn==haveMoney);

    }
}
