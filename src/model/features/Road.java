package model.features;


public class Road extends Feature {

    private boolean terminus;

    public Road(boolean terminus) {
        this.terminus = terminus;
    }

    public boolean isTerminus() {
        return terminus;
    }
}
