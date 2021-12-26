package Object;

public class TestMethod {
    public static void main(String[] args) {
        MethodPractice object = new MethodPractice();
        object.age(1995);


        object.sumOfArray(new int[]{3, 4, 2, 1});

        int[] nums={1,2,3,4,5,6,7};
        object.sumOfArray(nums);
        System.out.println(object.sumOfArray(nums));
        double v=object.sumOfArray(nums);
        System.out.println(v);

        double w=object.sumOfArray(new int[]{1,2,3,4,5,6,7});
        System.out.println(object.sumOfArray(new int[]{1,2,3,4,5,6,7}));
        System.out.println(w);


    }
}