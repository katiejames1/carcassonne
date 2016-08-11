package model;

import model.features.Feature;

public class Tile {

    private int[][] groups;
    private boolean cloister;
    private Feature[] features;

    public Tile (int n0, int n1, int n2, int e0, int e1, int e2, int s0, int s1, int s2,
                 int w0, int w1, int w2, boolean cloister, Feature... features) {
        groups = new int[][]{{n0, n1, n2}, {e0, e1, e2}, {s0, s1, s2}, {w0, w1, w2}};
        this.cloister = cloister;
        this.features = features;
    }

    public int getNodeGroup(Direction direction, int position) {
        return groups[direction.index()][position];
    }

    public Feature getNodeFeature(Direction direction, int position) {
        return features[getNodeGroup(direction, position)];
    }

    public boolean matches(Tile neighbor, Direction direction) {
        Direction oppositeDirection = Direction.oppositeDirection(direction);
        return this.getNodeFeature(direction, 0).equals(neighbor.getNodeFeature(oppositeDirection, 2))
                && this.getNodeFeature(direction, 1).equals(neighbor.getNodeFeature(oppositeDirection, 1))
                && this.getNodeFeature(direction, 2).equals(neighbor.getNodeFeature(oppositeDirection, 0));
    }

    public void rotateClockwise() {
        int[] oldNorth = groups[Direction.NORTH.index()];
        groups[Direction.NORTH.index()] = groups[Direction.WEST.index()];
        groups[Direction.WEST.index()] = groups[Direction.SOUTH.index()];
        groups[Direction.SOUTH.index()] = groups[Direction.EAST.index()];
        groups[Direction.EAST.index()] = oldNorth;
    }

    public void rotateCounterClockwise() {
        int[] oldNorth = groups[Direction.NORTH.index()];
        groups[Direction.NORTH.index()] = groups[Direction.EAST.index()];
        groups[Direction.EAST.index()] = groups[Direction.SOUTH.index()];
        groups[Direction.SOUTH.index()] = groups[Direction.WEST.index()];
        groups[Direction.WEST.index()] = oldNorth;
    }
}
