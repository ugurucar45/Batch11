package practiceMyself.WeeklyProject8;


import java.util.Random;

public class VentraCard {

    /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */
    private String fullName;
    private String phoneNumber;
    private String email;
    private long cardNumber;

    public <String> VentraCard(String fullName, String phoneNumber, String email, long cardNumber) {
        this.fullName = (java.lang.String) fullName;
        this.phoneNumber = (java.lang.String) phoneNumber;
        this.email = (java.lang.String) email;
        this.cardNumber = (long) cardNumber;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public VentraCard(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public VentraCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public VentraCard createCard(String fullName, String phoneNumber, String email) {

        //  create listed array (card1,card2,card3)
        //  card=fullname,phone, email
        VentraCard card=new VentraCard(fullName,phoneNumber,email);
        //addCardsFromVentraCard(card);
    /*
    this method needs to return VentraCard according to the parameter
     */
        return card;
    }

    public long createCardNumber() {
        /*
        this method needs to return the 16 digit card number
         */
        Random random=new Random(10);
        int k=0;
        for (int i=1;i<=16;i++){
            k= random.nextInt();
            cardNumber=(cardNumber*10)+k;
        }
        return cardNumber;
    }
}

