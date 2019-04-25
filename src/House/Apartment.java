package House;

public class Apartment extends House {

    private double rent;

    public Apartment(String address, double sqfeet, int
            numberBedrooms, int numberBathrooms,
                     boolean owned, double worth,
                     double rent) {
        super(address, sqfeet, numberBedrooms,
                numberBathrooms, owned, worth);
        this.rent = rent;

    }

    public double getRent() {
            return rent;
    }

    private void setRent(double aCost) {
        rent = aCost;
    }

}

