package OOP.Abstraction.AbstractClassess;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        Student student= new Student("Ugur",27); you cannot create object from Abstract class

        Map map=new LinkedHashMap();
        HashMap map1=new HashMap();
        Map map2=new HashMap();

        Student student=new OnlineStudent();
        OnlineStudent student1=new OnlineStudent();
        //CampusStudent student2=new CampusStudent(); CampusStudent3 is also abstract
        JrJoe jrJoe=new JrJoe();
        jrJoe.eat();
        jrJoe.attend();
        jrJoe.playVideoGame();
    }
}
