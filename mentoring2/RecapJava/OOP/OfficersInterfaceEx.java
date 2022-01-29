package mentoring2.RecapJava.OOP;

public class OfficersInterfaceEx extends Officer implements WorkersInterface,SecondWorkersInterface{
    @Override
    public void working() {

    }

    @Override
    public void eating() {

    }

    @Override
    public void running() {

    }

    @Override
    public void name() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void trial() {

    }

    public static void main(String[] args) {
        OfficersInterfaceEx officersInterfaceEx=new OfficersInterfaceEx();
        officersInterfaceEx.name();
    }
}
