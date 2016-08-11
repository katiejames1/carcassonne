package model;

public enum Direction {
    NORTH(0),
    EAST(1),
    SOUTH(2),
    WEST(3);

    private final int index;
    Direction(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }

    public static Direction oppositeDirection(Direction direction) {
        switch (direction) {
            case NORTH:
                return SOUTH;
            case EAST:
                return WEST;
            case SOUTH:
                return NORTH;
            case WEST:
                return EAST;
        }
        throw new IllegalStateException();
    }
}
