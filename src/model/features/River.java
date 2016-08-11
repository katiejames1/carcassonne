package model.features;


public class River extends Feature {

    private boolean terminus;

    public River(boolean terminus) {
        this.terminus = terminus;
        canHaveMeeple = false;
    }

    public boolean isTerminus() {
        return terminus;
    }
}
