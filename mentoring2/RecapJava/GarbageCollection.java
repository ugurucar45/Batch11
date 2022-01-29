package mentoring2.RecapJava;

public class GarbageCollection {
    /*
  INTERVIEW QUESTIONS:
    1)What is garbage collector and where it is coming from?
    ANSWER:is a way to of cleaning unused or useless data in the class
    It is coming from SYSTEM.
        int a = 5; int b =6 ; int c=7 a=b;
        String name = "Ahmet"
        String anothername = "Ahmet1";
        String anotheranothername="Techtorial";
        anotheranothername=name;
        name=null;
        name techtorial ahmet
    1*)How can you prove that gc is working
    To call the finalize method(protected) public.
    2*)How can you make the object garbage
    By assign the null value
    By reassign with the different value;-->please check the example above
    3*)Can you call gc many times? *(OCA);
    You can only call 1 time
    4)Do you have to call gc to clean up your codes?
    No, because it works all the time automatically.
 */
    public static void main(String[] args) {
        final String name=null;
        String name1="asd";
        String name2=name;
        System.gc();    //---> OCA it says you can call only 1 time
    }

    @Override
    protected void finalize()  {
        System.out.println("there is a garbage here");
    }
}