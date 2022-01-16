package inheritance;

public class Jan16Notes {
    /*
    Jan_16_2022
-access midifiers
-blocks
-immutable class: if you have only getters in a class that type of class is
                  immutable class
                 public Integer getAge(){
                  return age;
                 }
-String builder: it is mutable
                  StringBuilder name = new StringBuilder();
                  name.append("Sunday");
                  StringBuilder name1 = new StringBuilder("Monday");
                  methods: append
                            indexOf
                            charAt
                            delete
                            deleteCharAt
                            insert
                            reverse
                            toString
                            substring
                            length()
                            replace
                            lastIndexOf
=====================================
OOPS:
  Object Oriented Programming and Systems
  * Java is not 100% OOP Language because of primitives
Components of OOP concept:
1-Encapsulation
2-Inheritance
3-Polymorphism
4-Abstraction
    -Interfaces
    -Abstract classes
=====1-Encapsulation========
Hiding the data from user:
class  Phone {
    private String brand;
    private double price;
setters: they will set the value (They will not have return, it will be void)
getters: they will return the value (they will have return type)
}
===========2-Inheritance================
-parent-child relationship
-use 'extends' keyword to create relationship between parent(super) class
  and child(sub-class) class.
-you can inherit from parent to child but not from child to parent
-this --> refers to the current class, current class fields
-this() -> it refers to the current class constructor(s)
---
super --> it refers to parent class, and it's fields
super() -> it refers to parent class constructor
=========================
Method Overriding:
  -method overriding happens if there is parent-child relation between classes
  -access modifiers has to be same or more accessable
  -return type has to be same or co-variant type(child type)
  -signature of the method: it will stay the same
  protected void run(){}
  public void run(){}
     */
}
