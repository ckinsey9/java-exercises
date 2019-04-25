package House;

import org.launchcode.java.demos.java4python.Temperature;

public class House {

    private String address;
    private double sqfeet;
    private int numberBedrooms;
    private int numberBathrooms;
    private boolean owned;
    private boolean locked = true;
    private double worth;

    public House(){}
    public House(String address, double sqfeet, int
                 numberBedrooms, int numberBathrooms,
                 boolean owned, double worth) {
        this.address = address;
        this.sqfeet = sqfeet;
        this.numberBedrooms = numberBedrooms;
        this.numberBathrooms = numberBathrooms;
        this.owned = owned;
        this.worth = worth;
    }

    private void setAddress(String aAddress) {
        address = aAddress;
    }

    public String getAddress() {
        return address;
    }

    private void setSqfeet(double aSqfeet) {
        sqfeet = aSqfeet;
    }

    public double getSqfeet() {
        return sqfeet;
    }

    private void setNumberBedrooms(int aNumberBedrooms) {
        numberBedrooms = aNumberBedrooms;
    }

    public int getNumberBedrooms() {
        return numberBedrooms;
    }

    private void setNumberBathrooms(int aNumberBathrooms) {
        numberBathrooms = aNumberBathrooms;
    }

    public int getNumberBathrooms() {
        return numberBathrooms;
    }

    public boolean getLocked() {
        return locked;
    }

    private void setLocked(boolean key) {
        locked = key;
    }

    public boolean getOwned() {
        return owned;
    }

    private void setOwned(boolean owner) {
        owned = owner;
    }

    public double getWorth() {
        return worth;
    }

    private void setWorth(double price) {
        worth = price;
    }

    public static void main(String[] args) {
        House home = new House("west", 500, 3, 2,
        false, 5000);
        System.out.println(home.numberBathrooms);
        Condo condo1 = new Condo("west", 500, 3, 2,
                false, 5000, 500, false);

        System.out.println(condo1.getHoa());

        System.out.println(condo1.getSqfeet());




    }

}




