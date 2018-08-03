package com.company.Maze;

public class Main {

    public static final int WALL = 1;

    public static void main(String[] args) {

//    Maze maze = new Maze(25);
//
//    maze.print2d();

//    $size = 25;
        int size = 25;

        // $maze = array_fill(0, $size, array_fill(0, size, '#'));
        int[][] maze = new int[size][size];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = WALL;
            }
        }

        print2d(generateMaze(maze, new int[]{0, 0}));

    }

    public static int[][] generateMaze(int[][] maze, int[] point) {
        return maze;
    }

    public static void print2d(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                int value = maze[i][j];
                System.out.print( (value == WALL ? "#" : ".") + " ");
                // ternary operator
                // value == WALL ? "#" : "."

            }
            System.out.println();
        }

        System.out.print("\n\n");
    }

}


