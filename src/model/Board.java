package model;

import java.awt.*;
import java.util.HashMap;

public class Board {

    private HashMap<Point, Chunk> board;

    public Board() {
        board = new HashMap<>();
        board.put(new Point(0, 0), new Chunk());
    }

    public Tile getTile(int x, int y) {
        return getChunk(x, y).getTile(x, y);
    }

    private Chunk getChunk(int x, int y) {
        if (board.containsKey(new Point(x / 5, y / 5))) {
            return board.get(new Point(x / 5, y / 5));
        }
        return null;
    }

    public void placeTile(int x, int y, Tile tile) {
        if(validPlacement(x, y, tile)) {
            if(getChunk(x, y) == null) {
                board.put(new Point(x / 5, y / 5), new Chunk());
            }
            getChunk(x, y).placeTile(x, y, tile);
        }
    }

    public boolean validPlacement(int x, int y, Tile tile) {
        if (getTile(x, y) != null ||
                getTile(x, y + 1) != null && !tile.matches(getTile(x, y + 1), Direction.NORTH) ||
                getTile(x + 1, y) != null && !tile.matches(getTile(x + 1, y), Direction.EAST) ||
                getTile(x, y - 1) != null && !tile.matches(getTile(x, y - 1), Direction.SOUTH) ||
                getTile(x - 1, y) != null && !tile.matches(getTile(x - 1, y), Direction.WEST)) {
            return false;
        }
        return true;
    }

    private static class Chunk {

        private Tile[][] chunk;

        private Chunk() {
            chunk = new Tile[5][5];
        }

        private void placeTile(int x, int y, Tile tile) {
            chunk[x % 5][y % 5] = tile;
        }

        private Tile getTile(int x, int y) {
            return chunk[x % 5][y % 5];
        }
    }
}
