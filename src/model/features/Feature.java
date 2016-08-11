package model.features;

import model.Player;

import java.util.HashSet;

public abstract class Feature {

    private HashSet<Feature> neighbors;
    protected boolean canHaveMeeple = true;
    private Player meeple = null;

    public Feature() {
        neighbors = new HashSet<>();
    }

    public void addNeighbor(Feature neighbor) {
        neighbors.add(neighbor);
    }

    public HashSet<Feature> getNeighbors() {
        return neighbors;
    }

    public boolean canHaveMeeple() {
        return canHaveMeeple;
    }

    public void placeMeeple(Player player) {
        if (canHaveMeeple) {
            player.placeMeeple();
            meeple = player;
        }
        throw new IllegalStateException("Meeple cannot be placed on this feature.");
    }

    public boolean hasMeeple() {
        return meeple != null;
    }

    public Player currentMeeple() {
        return meeple;
    }
}
