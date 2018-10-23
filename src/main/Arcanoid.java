package main;

import objects.Ball;
import objects.Brick;
import objects.Stand;

import java.util.ArrayList;
import java.util.Arrays;

public class Arcanoid {
    public static Arcanoid game;
    private int width;
    private int height;
    private Ball ball;
    private Stand stand;
    private ArrayList<Brick> bricks;

    public Arcanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
//        Canvas canvas = new Canvas(10, 10);
//        fill();
//        System.out.println(Arrays.deepToString(m));
//        canvas.drawMatrix(0, 0, m, '0');
//        canvas.print();

    }

//    private static char[][] m = new char[10][10];
//
//    public static void fill() {
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[0].length; j++) {
//                m[i][j] = 'x';
//            }
//        }
//    }

    public void run() {

    }

    public void move() {

    }

    //region Getters and Setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }

    //endregion
}
