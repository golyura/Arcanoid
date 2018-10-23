package main;

import java.util.Arrays;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height][width];
    }

    public void setPoint(double x, double y, char c) {
        if (x < 0 || y < 0 || x >= width || y >= height) return;
        matrix[(int) Math.round(y)][(int) Math.round(x)] = c;
    }

    public void drawMatrix(double x, double y, char[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != ' ') {
                    setPoint(x + j, y + i, c);
                }
            }
        }
    }

    public void clear() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ' ';
            }
        }
    }

    public void print() {
//        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
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

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
    //endregion
}
