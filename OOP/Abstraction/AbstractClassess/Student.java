package OOP.Abstraction.AbstractClassess;

public abstract class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void attend(){
        System.out.println("Student is attending to class");
    }
    abstract void watch();

    public void eat(){
        System.out.println("Student is eating");
    }



}
