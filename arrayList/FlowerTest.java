package arrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {
        ArrayList<Flower> flowersList=new ArrayList<>();

        Flower flower1 =new Flower("Rosa","Red",10.99);
        Flower flower2 =new Flower("Lily","White",10.99);
        Flower flower3 =new Flower("Rosa","Red",10.99);
        flowersList.add(flower1);
        flowersList.add(flower2);
        flowersList.add(flower3);

        System.out.println(flowersList);
        for (Flower fl:flowersList) {
            System.out.println(fl.name+"'s Price is "+fl.price);
        }
        //Computer com1=new Computer("Mac",1100,16,"Silver",500);
        //flowersList.add(com1);    //arraylist call flower class variables is not same com is not work in this list

        System.out.println(sum(flowersList));

        //calling sum1 method from flower class

        double flowerCost=Flower.sum1(flowersList);
        System.out.println(flowerCost+" is coming another class");
    }
    // create a method that will take a parameter as ArrayList of Flowers
    // this method will return total prices of the flowers

    public static double sum(ArrayList<Flower> vase) {
        double sum = 0;
        for (Flower fl : vase) {
            sum += fl.price;
        }
        return sum;
    }

}
