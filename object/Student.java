package object;

import java.util.Random;

public class Student {
    String name;
    int age;
    int id;
    public void setId(int num){
        id=num;
    }
    public void study(){
        System.out.println(name+" is studying "+createHour()+" hours");
    }
    public void sleep(){
        System.out.println(name+" is sleeping "+createHour()+" hours");
    }
    public void reading(){
        System.out.println(name+" is reading "+createHour()+" hours");
    }
    public static int createHour(){//if i delete static part sout don't work
        Random random=new Random();
        return random.nextInt(12);
    }

    public static void main(String[] args) {
        Student std1=new Student();

        std1.name="David";
        std1.study();
        std1.reading();

        System.out.println(createHour());

    }

}
