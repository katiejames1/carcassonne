package model;


import java.util.List;
import java.util.Random;

public class Bag {

    private Tile[] bag;
    private int tilesDrawn = 0;

    public Bag(List<Tile> tiles) {
        bag = new Tile[tiles.size()];
        tiles.toArray(bag);
        this.shuffle();
    }

    private void shuffle() {
        Random random = new Random();
        for (int i = bag.length - 1; i >= 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            Tile tmp = bag[randomIndex];
            bag[randomIndex] = bag[i];
            bag[i] = tmp;
        }
    }

    public Tile draw() {
        return bag[tilesDrawn++];
    }

    public int tilesRemaining() {
        return bag.length - tilesDrawn;
    }
}
