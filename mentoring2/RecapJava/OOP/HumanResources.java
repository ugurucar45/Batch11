package mentoring2.RecapJava.OOP;

public class HumanResources extends Officer{
    String employeeDocument;
    public void hiring(){
        System.out.println("Employee is Hiring");
    }

    @Override
    public void trial() {

    }

    @Override
    public void work() {
        System.out.println("Human resources is Working");
    }
}
