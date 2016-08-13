package model;

public class Board {

    public Board() {
    }

    public boolean placeTile(int x, int y, Tile tile) {
        return false;
    }

    public boolean validPlacement(int x, int y, Tile tile) {
        return false;
    }

    private static class Chunk {

        private Tile[][] chunk;

        private Chunk() {
            chunk = new Tile[5][5];
        }

    }
}
