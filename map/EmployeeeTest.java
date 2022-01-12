package map;

import java.util.HashMap;

public class EmployeeeTest {
    public static void main(String[] args) {
        HashMap<Integer,Employee> mapOfEmployees= new HashMap();

        Employee e1= new Employee("Max","New York",21,1);
        Employee e2= new Employee("Efe","Chicago",30,2);
        Employee e3= new Employee("David","Denver",34,9);
        Employee e4= new Employee("John","Houston",43,19);
//        e1.id= e1.genereteId();
//        e2.id= e1.genereteId();
//        e3.id= e3.genereteId();
//        e4.id= e4.genereteId();
        mapOfEmployees.put(e1.id,e1);
        mapOfEmployees.put(e2.id,e2);
        mapOfEmployees.put(e3.id,e3);
        mapOfEmployees.put(e4.id,e4);


        System.out.println(mapOfEmployees);

        Employee.showEmployeesName(mapOfEmployees);




    }
}
