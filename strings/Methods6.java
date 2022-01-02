package strings;

public class Methods6 {
    public static void main(String[] args) {
        String name= "    Techtorial Academy    ";
    //trim();
        // ----> it will remove spaces before and after string
        String updatedName=name.trim();
        System.out.println(updatedName);    //no space, delete before and after
        System.out.println(name);           //have space

    //substring();
        // ----> cut your string in part
        //name.subString(4);    --> torial Academy
        //name.subString(4,6);  --> to

        String part1=updatedName.substring(4);
        System.out.println(updatedName.substring(4));           //torial Academy
        String part2=updatedName.substring(4,11);
        System.out.println(updatedName.substring(4,12));        //torial A
    }
}
