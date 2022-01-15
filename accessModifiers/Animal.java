package accessModifiers;

public class Animal {
    //test methods are in the ternary and same package
    public String namePublic;

    private String colorPrivate;

    protected int ageProtected;

    String breedDefault;

    public String getColorPrivate() {
        return colorPrivate;
    }

    public void setColorPrivate(String colorPrivate) {
        this.colorPrivate = colorPrivate;
    }

    public void speakPublic() {
        System.out.println("Speaking");
    }

    private void eatPrivate() {
        System.out.println("Eating");
    }

    protected void runProtected() {
        System.out.println("Running");
    }

    void sleepDefault() {
        System.out.println("sleeping");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speakPublic();
        animal.eatPrivate();
        animal.runProtected();
        animal.sleepDefault();

        animal.colorPrivate = "white";
        System.out.println(animal.colorPrivate);


    }
}
