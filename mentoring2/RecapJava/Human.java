package mentoring2.RecapJava;

public class Human {
    int age=99;
    String name="SomeName";
    double height=6.2;
    String eyeColor="someColor";
    double amountOfMuscles=45;
    double theWrightOfSkeleton=53;
    public void speak(){
        System.out.println(name+" is speaking");
    }
    public double bmiCalculation(){
        return amountOfMuscles+theWrightOfSkeleton;
    }
}
