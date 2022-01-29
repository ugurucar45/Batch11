package mentoring2.RecapJava.OOP;

import mentoring2.RecapJava.ArrayList;

import java.util.List;

public class Test {
    /*
    POSSIBLE INHERITANCE INTERVIEW QUESTIONS
    INHERITANCE:

    1) What do you know about inheritance and how do you inherit two classes?
        *Inheritance is a way to make a connections(relationship) between classes
        *We need to use EXTEND key word to make this connections

    2)Why do you need inheritance in your framework?
        *We need inheritance because of reducing the execution time by minimizing the amount of code
        which makes your application more safe.
    3)What is the advantage of using inheritance in oop?
        -your application will be more safe
        -your framework will not have duplicated data.(EFFICIENCY)


    ENCAPSULATION:
        INTERVIEW QUESTIONS:
    1)What is encapsulation?
        -encapsulation is a way to make your data  not accessible and manipulable by everyone
        *Is a way of the restriction the data from the users or classes
        *Limiting the users,classes to access your data
        *it is hiding the data from users or classes.
    2)Why do you use encapsulation?
    3)How can you access the data from encapsulation?
    4)If encapsulation is hiding the data from users and with getter-setters
    they can still access it? then what is the point of it?
    Because we want to, to limit the users or classes with the conditions(format)
    that we want to have.Example is below.



    POLYMORPHISM:
        INTERVIEW QUESTIONS:
    1)What is polymorphism?
        is a different form of the object/methods.
    2)What is dynamic and static polymorphism?
        Dynamic polymorphism --> Runt time --> Overriding
        Static polymorphism  --> Compile Time-->Overloading
    3)What is overloading and overriding:
        Overloading
        a)Overloading must have different method signature
            ->public void overloading(int a)
            ->public void overloading(int a, String b)
        b)Overloading methods should be in same class
        c)Overloading methods can have final, static, private
        =======
        Overriding
        a)Overriding must have same name and same method signature WITH DIFFERENT IMPLEMENTATION
            ->public void overriding(int number)
            @Overriding
            ->public void overriding(ont number)
        b)Overriding methods should be in different classes(like parent-child or class-subclasses)
        c)Overriding methods cannot be static, final and private


    ABSTRACT:
        INTERVIEW QUESTIONS:
    1)What is ABSTRACT?
        abstract is a way to organize the methods with only necessary information.
        We do not need to have a body for abstract methods because every class which extended to the
        abstract class can MAKE THEIR OWN IMPLEMENTATION by overriding.
    2)Why do you need to have abstract class in your framework?
        For many methods, we need developers to make their own implementation in our company,
        so they create abstract class with abstract-normal methods to make people find the
        necessary data in a short amount of time.
    2a)Where do you use the abstract in your framework?
        Almost every part of my OOP concept.




    INTERFACE:
        INTERVIEW QUESTIONS
    1)What is interface?
        Interface is a blueprint of the object like class which has special methods that
        can be overridden to make new implementation.
    2)Why do you need interface if you have abstract class?
        *Because interface have more features in terms of accessing the more parents by overriding their methods.
    3)What is the difference between interface and abstract? (MOST COMMON QUESTION)

        ABSTRACT:
        a)Abstract class is declared with abstract keyword
        b)Abstract class can have abstract and non-abstract methods
        c)TO MAKE A CONNECTION WITH ABSTRACT CLASS WE NEED TO USE extend KEY WORD
        d)In abstract class you can Extend the classes only ONCE.
        e)You can have any variable.
        f)You can have public, protected... for the methods

        INTERFACE:
        a)Interface class is declared with Interface keyword
        b)Interface class can have only abstract methods
        c)To make a connection with interface class we need to use IMPLEMENT kwy word
        d)in interface class you can Extend once and also implement multiple classes(parents).
        e)Your variable final static as default.
        f)Methods must be public abstract.

     */

    public static void main(String[] args) {
        Academician academician = new Academician();
        academician.name = "Ahmet";
        academician.classes = "Biology";
        academician.teaching();
        System.out.println(academician.name);
        System.out.println(academician.classes);


        Asistants asistants = new Asistants();
        Teachers teachers = new Teachers();
        Workers workers = new Workers();

        System.out.println(teachers.getEmail());
        teachers.setEmail("blabla@yahoo.com");
        System.out.println(teachers.getEmail());
        teachers.setEmail("asdadsa@gmal.com");
        System.out.println(teachers.getEmail());

        //Ahmet is a teacher who attends the meeting periodically and the tests
        //Enes is apart time teacher who doesn"t attend the meeting and grade the tests
        Teachers ahmet= new Teachers();
        ahmet.attendMeeting();
        ahmet.gradeTest();
        Academician enes= new Teachers();
        enes.teaching();

        Workers mehmet= new Teachers();
        List<String> list= new java.util.ArrayList<>();
        ArrayList list2=new ArrayList();

        //Officer officer=new Officer() {}
        HumanResources humanResources= new HumanResources();
        humanResources.work();
        humanResources.work();
        SecurityGuard securityGuard=new SecurityGuard();
        securityGuard.work();


    }
}
