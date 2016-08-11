package model;


public class Player {

    public enum Color {
        BLACK,
        YELLOW,
        RED,
        GREEN,
        BLUE,
    }
    private Color color;
    private int availableMeeples;

    public Player(Color color, int availableMeeples) {
        this.color = color;
        this.availableMeeples = availableMeeples;
    }

    public Color playerColor() {
        return color;
    }

    public int availableMeeples() {
        return availableMeeples;
    }

    public int placeMeeple() {
        return --availableMeeples;
    }

    public int recoverMeeple() {
        return ++availableMeeples;
    }
}
