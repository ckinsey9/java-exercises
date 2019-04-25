package House;

public class Condo extends House {
    private double hoa;
    private boolean yard;

    public Condo(String address, double sqfeet, int
            numberBedrooms, int numberBathrooms,
                 boolean owned, double worth,
                 double hoa, boolean yard) {
        super(address, sqfeet, numberBedrooms,
                numberBathrooms, owned, worth);
        this.hoa = hoa;
        this.yard = yard;
    }

    public double getHoa() {
        return hoa;
    }

    private void setHoa(double aCost) {
        hoa = aCost;
    }

    public boolean getYard() {
        return yard;
    }

    private void setYard(boolean aYard) {
        yard = aYard;
    }

}
