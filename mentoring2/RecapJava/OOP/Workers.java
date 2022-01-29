package mentoring2.RecapJava.OOP;

public class Workers {
    String name;
    String lastName;
    private String email="default@gmail.com";
    String Phone;
    public void enter(){
        System.out.println("Your entry time successfully recorded ");
    }
    public void leave(){
        System.out.println("Your dismiss time successfully recorded ");
    }
    public void lunch(){
        System.out.println("Your lunch time successfully recorded ");
    }

    public String getEmail() {
        if ((email.endsWith("@gmail.com"))){this.email=email;}
        else {
            System.out.println("Please enter provide a valid format email");
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
