package object;

public class Animal {
        //instance variables main icinde degiller
    String name;      // declared a variable and named it "animal"
    int age;          // global/instance variable
    String color;     // global/instance variable.  SO FAR NO OBJECT
    String breed="Boxer";   //it is default value
    int energy=100;

    //public = key word access modifier
    //void = return type
    //sleep = is my methods name    (it is our custom method)
    //()  = is parameter____1 or more
    //{ } = is block from the another things    // of course in here we have codes
    public void sleep(){// if i change public to private another class gets error
        energy=100;     // if you use private it means just here avaible
        int height;
        //System.out.println(height); height is local variables don have any default values
        System.out.println(name+" is sleeping");
        System.out.println(name+ " is charging up...");
        System.out.println("Now "+name+"'s energy is "+energy);
    }
    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void run(){      //behavior
        energy-=10;
        if(energy>0){
        System.out.println(name+"'s energy is %"+energy );}
        if(energy<0){
            System.out.println(name+" cant runs need time to energy");
        }
    }
    public void info(){
        System.out.println("Name is :"+name+"\t\tAge is :"+age+"\t\tColor is :"+color+"\t\tBreed is :"+breed+"\t" +
                "\tEnergy is :"+energy);

    }

    public static void main(String[] args){
        String lastName;
    }
}
