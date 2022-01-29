package mentoring2.RecapJava.OOP;

public class SecurityGuard extends Officer{
    String securityDocument;
    public void guardDuty(){
        System.out.println("Guard duty");
    }

    @Override
    public void trial() {

    }

    @Override
    public void work() {
        System.out.println("Security Guard is Working");

    }
}
