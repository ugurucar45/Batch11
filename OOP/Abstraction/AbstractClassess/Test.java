package OOP.Abstraction.AbstractClassess;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        Student student= new Student("Ugur",27); you cannot create object from Abstract class

        Map map=new LinkedHashMap();
        Student student=new OnlineStudent();
        OnlineStudent student1=new OnlineStudent();
        //CampusStudent student2=new CampusStudent(); CampusStudent3 is also abstract
    }
}
