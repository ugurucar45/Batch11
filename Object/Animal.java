package Object;

public class Animal {

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
    public void sleep(){
        energy=100;
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


    public static void main(String[] args){
        String lastName;
    }
}
