package OOP.Abstraction.AbstractClassess;

public class SelfLearnerStudent extends Student {

    public SelfLearnerStudent() {
        super("Halicha", 22);
    }


    public void attend() {
        System.out.println("Self learner is attending");
    }

    public void watch() {
        System.out.println("Self Learner is watching");
    }

    public void sleep(int hour) {
        System.out.println("Self Learner is sleeping");
    }
}
