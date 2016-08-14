package model;


import model.features.City;
import model.features.Field;
import model.features.Road;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public Bag newGame() {
        return new Bag(initializeTiles());
    }

    private List<Tile> initializeTiles() {
        ArrayList<Tile> tiles = new ArrayList<>(72);

        for(int i = 0; i < 4; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE1(0).setE1(0).setE2(0)
                    .setS0(0).setS1(0).setS2(0)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(true).addFeature(new Field(), 0)
                    .build());
        }

        for(int i = 0; i < 2; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(0).setS1(1).setS2(0)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(true).addFeature(new Field(), 0).addFeature(new Road(true), 1)
                    .build());
        }

        for(int i = 0; i < 1; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(0).setS1(0).setS2(0)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(true), 0)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(1).setS1(1).setS2(1)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .build());
        }

        for(int i = 0; i < 1; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(1).setS1(1).setS2(1)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(true), 0).addFeature(new Field(), 1)
                    .build());
        }

        for(int i = 0; i < 1; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(1).setS1(2).setS2(3)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(false), 0)
                    .addFeature(new Field(), 1).addFeature(new Road(true), 2).addFeature(new Field(), 3)
                    .build());
        }

        for(int i = 0; i < 2; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(1).setS1(2).setS2(3)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(true), 0)
                    .addFeature(new Field(), 1).addFeature(new Road(true), 2).addFeature(new Field(), 3)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(1).setE2(1)
                    .setS0(1).setS1(1).setS2(1)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .build());
        }

        for(int i = 0; i < 2; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(1).setE2(1)
                    .setS0(1).setS1(1).setS2(1)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(true), 0).addFeature(new Field(), 1)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(2).setE2(3)
                    .setS0(3).setS1(2).setS2(1)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new Road(false), 2).addFeature(new Field(), 3)
                    .build());
        }

        for(int i = 0; i < 2; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(2).setE2(3)
                    .setS0(3).setS1(2).setS2(1)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(true), 0).addFeature(new Field(), 1)
                    .addFeature(new Road(false), 2).addFeature(new Field(), 3)
                    .build());
        }

        for(int i = 0; i < 1; i++) {
            tiles.add(new Tile.TileBuilder().setN0(1).setN1(1).setN2(1)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(2).setS1(2).setS2(2)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new Field(), 2)
                    .build());
        }

        for(int i = 0; i < 2; i++) {
            tiles.add(new Tile.TileBuilder().setN0(1).setN1(1).setN2(1)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(2).setS1(2).setS2(2)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new City(true), 0).addFeature(new Field(), 1)
                    .addFeature(new Field(), 2)
                    .build());
        }

        for(int i = 0; i < 1; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(1).setE2(1)
                    .setS0(1).setS1(1).setS2(1)
                    .setW0(2).setW1(2).setW2(2)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new City(false), 2)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(1).setE2(1)
                    .setS0(2).setS1(2).setS2(2)
                    .setW0(1).setW1(1).setW2(1)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new City(false), 2)
                    .build());
        }

        for(int i = 0; i < 5; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(1).setE2(1)
                    .setS0(1).setS1(1).setS2(1)
                    .setW0(1).setW1(1).setW2(1)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(1).setE2(1)
                    .setS0(1).setS1(2).setS2(3)
                    .setW0(3).setW1(2).setW2(1)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new Road(false), 2).addFeature(new Field(), 3)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(2).setE2(3)
                    .setS0(3).setS1(2).setS2(1)
                    .setW0(1).setW1(1).setW2(1)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new Road(false), 2).addFeature(new Field(), 3)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(2).setE2(5)
                    .setS0(5).setS1(3).setS2(6)
                    .setW0(6).setW1(4).setW2(1)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new Road(true), 2).addFeature(new Road(true), 3).addFeature(new Road(true), 4)
                    .addFeature(new Field(), 5).addFeature(new Field(), 6)
                    .build());
        }

        for(int i = 0; i < 3; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(1).setE1(2).setE2(5)
                    .setS0(3).setS1(3).setS2(3)
                    .setW0(3).setW1(2).setW2(1)
                    .setCloister(false).addFeature(new City(false), 0).addFeature(new Field(), 1)
                    .addFeature(new Road(false), 2).addFeature(new Field(), 3)
                    .build());
        }

        for(int i = 0; i < 8; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(1).setN2(2)
                    .setE0(2).setE1(2).setE2(2)
                    .setS0(2).setS1(1).setS2(0)
                    .setW0(0).setW1(0).setW2(0)
                    .setCloister(false).addFeature(new Field(), 0).addFeature(new Road(false), 1)
                    .addFeature(new Field(), 2)
                    .build());
        }

        for(int i = 0; i < 9; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(0).setE2(0)
                    .setS0(2).setS1(1).setS2(0)
                    .setW0(2).setW1(1).setW2(0)
                    .setCloister(false).addFeature(new Field(), 0).addFeature(new Road(false), 1)
                    .addFeature(new Field(), 2)
                    .build());
        }

        for(int i = 0; i < 4; i++) {
            tiles.add(new Tile.TileBuilder().setN0(0).setN1(0).setN2(0)
                    .setE0(0).setE1(1).setE2(2)
                    .setS0(2).setS1(3).setS2(4)
                    .setW0(4).setW1(5).setW2(0)
                    .setCloister(false).addFeature(new Field(), 0).addFeature(new Road(true), 1)
                    .addFeature(new Field(), 2).addFeature(new Road(true), 3).addFeature(new Field(), 4)
                    .addFeature(new Road(true), 5)
                    .build());
        }

        for(int i = 0; i < 1; i++) {
            tiles.add(new Tile.TileBuilder().setN0(6).setN1(7).setN2(0)
                    .setE0(0).setE1(1).setE2(2)
                    .setS0(2).setS1(3).setS2(4)
                    .setW0(4).setW1(5).setW2(6)
                    .setCloister(false).addFeature(new Field(), 0).addFeature(new Road(true), 1)
                    .addFeature(new Field(), 2).addFeature(new Road(true), 3).addFeature(new Field(), 4)
                    .addFeature(new Road(true), 5).addFeature(new Field(), 6).addFeature(new Road(true), 7)
                    .build());
        }

        return tiles;
    }
}
