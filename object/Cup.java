package object;

public class Cup {
    int size;
    String color;
    boolean isClean = true;

    public Cup(int size) {
        this.size = size;
    }

    public Cup(String color) {
        this.color = color;
    }

    public Cup(boolean isClean) {
        this.isClean = isClean;
    }

    public Cup(int size, String color, boolean isClean) {
        this.size = size;
        this.color = color;
        this.isClean = isClean;
    }

    public void usage() {
        isClean = false;
        System.out.println("Cup is not clean anymore");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("xxxxxx");
    }

    public static void main(String[] args) {
        System.gc();//not working
        Cup c1 = new Cup(12, "red", true);
        Cup c2 = new Cup(12, "red", true);
        Cup c3 = new Cup(12, "red", true);
        Cup c4 = new Cup(12, "red", true);

        System.out.println(c4.isClean);//true
        c4.usage();//Cup is not clean anymore

        Cup c5 = c1;
        c1 = c4;
        System.out.println(c1.isClean);//false
        System.out.println(c5.isClean);//true

        c2 = null;
        c5 = c2;

        //System.out.println(c2.isClean); //true                                i block right now
        System.out.println(c2);//   hashcode    Object.Cup@61443d8f       null right now
        c2 = c3;
        System.out.println(c2.isClean);

        //System.out.println(c5.color);// NullPointerException
        System.out.println(c1.color);
        System.gc();//workinf


    }
}
