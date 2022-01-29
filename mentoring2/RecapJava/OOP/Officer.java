package mentoring2.RecapJava.OOP;

public abstract class Officer extends Workers{
    String department;
    String shifting;
    public void work(){
        System.out.println("Work class");
    }
    public abstract void trial();
}
