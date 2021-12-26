package Object;

public class StaticPetPractice {

    String name;
    int age;
    String color;
    static double food=20;

    public static void eat(){
        //color="red";            // non static variables can not use in static method
        food-=1;
        System.out.println("food amount is now : "+food);
        //play();                                       //its non static i cant say
        StaticPetPractice pet9=new StaticPetPractice(); //i say because i call an object
        //pet9.play();                                  //to call non static into static method,
                                                        //you need to create object
        pet9.color="red";
    }
    public void play(){
        System.out.println("Pet is playing");
        eat();  // i say because it is static
        food=100;
        color="blue";
    }

    public static void main(String[] args) {
        StaticPetPractice pet1=new StaticPetPractice();
        pet1.eat();//19
        pet1.eat();//18
        StaticPetPractice pet2=new StaticPetPractice();
        pet2.eat();//17
        pet1.eat();//16
        pet2.eat();//15

        eat();//14                           it cames because i use before eat method void static keyword
        StaticPetPractice.eat();//13         it cames because i use before eat method void static keyword
        //play();                           it s not work because its non static
        //StaticPetPractice.play();         not static not working

    }
}
