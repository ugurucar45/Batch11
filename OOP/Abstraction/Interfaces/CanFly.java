package OOP.Abstraction.Interfaces;

public interface CanFly {
    //All variables in interface are public and final
    public final int NUMOFWINGS=2;
    int NUMTAIL=1;

    //all methods in interface are public and abstract
    void fly();
    public default void info(){
        System.out.println("Info of CanFly: "+NUMTAIL+" - "+NUMOFWINGS);
    }

}
