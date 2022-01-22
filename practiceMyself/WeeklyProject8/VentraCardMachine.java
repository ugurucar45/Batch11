package practiceMyself.WeeklyProject8;

import java.util.ArrayList;

public class VentraCardMachine {

    private String location;
    private ArrayList<VentraCard> allCards;

    public VentraCardMachine(String location) {
        this.location = location;
        this.allCards = new ArrayList<VentraCard>();
    }

    public ArrayList<VentraCard> getAllCards() {
        return allCards;
    }

    public void setAllCards(ArrayList<VentraCard> allCards) {
        this.allCards = allCards;
    }

    public boolean addCard(VentraCard card) {
        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */
        boolean registered = false;
        int j = 0;
        int i = 0;
        for (VentraCard cards : allCards) {
            if (cards.equals(allCards.get(i))) {
                j++;
                registered = true;
            }
            i++;
        }
        if (j < 1) {
            allCards.add(card);
        }
        return registered;
    }

    public void printCardNumbers(ArrayList<VentraCard> cards) {

        /*
         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */
        for (VentraCard card : cards) {
            System.out.println(card.getCardNumber());
        }
    }

    public boolean updateCard(long oldCardNumber, VentraCard newCard) {

        /*
        This method is taking two parameter oldCardNumber and it will replace this card with newCard.
        */
        boolean ret = false;
        int i = 0;
        for (; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == (oldCardNumber)) {
                ret = true;
                break;
            }
        }
        allCards.set(i, newCard);
        return ret;
    }

    public void cardHoldersName(ArrayList<VentraCard> cards) {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).getFullName());
        }
    }

    public void cardHoldersNameAndCardName(ArrayList<VentraCard> cards) {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).getFullName() + ", " + cards.get(i).getCardNumber());
        }
    }

    public void replaceEmail(long cardNumber, String newEmail) {
        int i = 0;
        String ss = newEmail;
        for (; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == (cardNumber)) {
                allCards.get(i).setEmail((java.lang.String) newEmail);
            }
        }

    }

    public boolean removeTheCard(long cardNumber) {
        boolean a = false;
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == (cardNumber)) {
                allCards.remove(i);
                a = true;
            } else {
                a = false;
            }
        }
        return a;
    }

    public void showInfo(long phoneNumber) {
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getPhoneNumber().equals(phoneNumber)) {
                System.out.println(allCards.get(i));
            }
        }
    }

    public void updateCardNumber(long oldCardNumber, long newCardNumber) {
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == (oldCardNumber)) {
                allCards.get(i).setCardNumber(newCardNumber);
            }
        }
    }

    public void addCard(String fullName, String phoneNumber, String email) {
        int j = 0;
        int i = 0;
        for (VentraCard cards : allCards) {
            if (cards.equals(allCards.get(i))) {
                j++;
            }
            i++;
        }
        if (j < 1) {
            VentraCard card=new VentraCard(fullName,phoneNumber,email);
            allCards.add(card);
        }
    }


    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber, oldEmail and newEmail. This method will replace old email address with
        new email address matching with cardNumber
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the card removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */
}
