package mentoring2.RecapJava;

public class StaticInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1)What is static keyword and why do you use it?
    is a keyword(way) to make the methods etc.. belongs to the class.
    ***** the advantage of having static key word is that you do not create an object
    to access the variables or methods.
    ***** the disadvantages of having static keywords is that you cannot override the methods
    once you call it.

    2)What is static block?
    is the block that can be called once (1 time it works), it always executed first.

    3)What is static variable?
    **it makes the variables belongs to the class
    **it is shareable(changeable) --> common for each object
    **it can be accessed by other classes without creating an object.


    */
    int food=20;
    public void eating(){
        System.out.println("you are eating");
        food--;
    }
    public static void main(String[] args) {

        run();

        StaticInstanceBlock ss=new StaticInstanceBlock();
        StaticInstanceBlock ss1=new StaticInstanceBlock();

    }
    public static void run(){
        System.out.println("he is running");
    }
    static {
        System.out.println("it is a static block");
    }
    static {
        System.out.println("it is a second static block");
    }
    {
        System.out.println("it is a instance block");
    }
    {
        System.out.println("it is a second instance block");
    }
}
