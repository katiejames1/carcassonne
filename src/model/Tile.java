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

    public boolean hasCloister() {
        return cloister;
    }

    public static class TileBuilder {

        private int n0;
        private int n1;
        private int n2;
        private int e0;
        private int e1;
        private int e2;
        private int s0;
        private int s1;
        private int s2;
        private int w0;
        private int w1;
        private int w2;
        private boolean cloister;
        private Feature[] features;

        public TileBuilder() {
            features = new Feature[12];
        }

        public TileBuilder setN0(int n0) {
            this.n0 = n0;
            return this;
        }

        public TileBuilder setN1(int n1) {
            this.n1 = n1;
            return this;
        }

        public TileBuilder setN2(int n2) {
            this.n2 = n2;
            return this;
        }

        public TileBuilder setE0(int e0) {
            this.e0 = e0;
            return this;
        }

        public TileBuilder setE1(int e1) {
            this.e1 = e1;
            return this;
        }

        public TileBuilder setE2(int e2) {
            this.e2 = e2;
            return this;
        }

        public TileBuilder setS0(int s0) {
            this.s0 = s0;
            return this;
        }

        public TileBuilder setS1(int s1) {
            this.s1 = s1;
            return this;
        }

        public TileBuilder setS2(int s2) {
            this.s2 = s2;
            return this;
        }

        public TileBuilder setW0(int w0) {
            this.w0 = w0;
            return this;
        }

        public TileBuilder setW1(int w1) {
            this.w1 = w1;
            return this;
        }

        public TileBuilder setW2(int w2) {
            this.w2 = w2;
            return this;
        }

        public TileBuilder setCloister(boolean cloister) {
            this.cloister = cloister;
            return this;
        }

        public TileBuilder addFeature(Feature feature, int number) {
            features[number] = feature;
            return this;
        }

        public Tile build() {
            return new Tile(n0, n1, n2, e0, e1, e2, s0, s1, s2, w0, w1, w2, cloister, features);
        }
    }
}
