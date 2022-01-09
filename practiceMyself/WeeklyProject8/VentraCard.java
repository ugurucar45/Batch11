package practiceMyself.WeeklyProject8;

import java.util.Random;

public class VentraCard {

    private String phoneNumber;

    public  String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public VentraCard(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */

    public static VentraCard createCard(String fullName, String phoneNumber, String email){

    /*
    this method needs to return VentraCard according to the parameter
     */
        return null;
    }

    public long createCardNumber(){
        /*
        this method needs to return the 16 digit card number
         */
        //This method has to create random 16 digit number; use loop 16 times take number
        return 0L;

    }
}

