package House;

public class Apartment extends House {

    private double rent;

    public Apartment(String address, double sqfeet, int
            numberBedrooms, int numberBathrooms,
                     boolean owned, double worth,
                     double hoa, boolean yard) {
        super(address, sqfeet, numberBedrooms,
                numberBathrooms, owned, worth);
        this.rent = hoa;

    }

    public double getRent() {
            return rent;
    }

    private void setRent(double aCost) {
        rent = aCost;
    }

}

