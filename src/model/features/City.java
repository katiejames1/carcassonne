package model.features;


public class City extends Feature {

    private boolean penant;

    public City(boolean penant) {
        this.penant = penant;
    }

    public boolean hasPenant() {
        return penant;
    }
}
