package Object;

public class TestOverload {
    public static void main(String[] args) {

        OverLoadingPractice sums=new OverLoadingPractice();
        sums.sum(3,4);
        sums.sum(new int[]{4,5,6,7,8});
        sums.sum("Hello ",3,5);

        Cat cat =new Cat();
        cat.run(3);
        cat.run();

        MethodPractice obj=new MethodPractice();
        obj.age(1999,"Newton ");
    }
}
