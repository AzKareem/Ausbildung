package Methoden;

import java.util.ArrayList;
import java.util.Random;

public class GameOfLife {

    public static void main(String[] args) {
        int[][] gameOfLife = new int[10][10];
        fillFields(gameOfLife);
        generation(gameOfLife, 10);

    }

    public static void fillFields(int[][] gameOfLife) {
        Random r = new Random();
        for (int i = 0; i < gameOfLife.length; i++) {
            for (int j = 0; j < gameOfLife[i].length; j++) {
                int number = r.nextInt(2);
                gameOfLife[i][j] = number;
            }
        }
    }

    public static void output(int[][] gameOfLife) {
        for (int i = 0; i < gameOfLife.length; i++) {
            for (int j = 0; j < gameOfLife.length; j++) {
                int field = gameOfLife[i][j];
                if (field == 1) {
                    System.out.print("[#] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }

    public static void generation(int[][] gameOfLife, int countOfGeneration) {

        int[][] currentGeneration = gameOfLife;
        int[][] nextGeneration;

        for (int i = 0; i < countOfGeneration; i++) {
            nextGeneration = new int[10][10];
            output(currentGeneration);
            for (int j = 0; j < currentGeneration.length; j++) {
                for (int k = 0; k < currentGeneration.length; k++) {
                    int fieldValue = currentGeneration[j][k];
                    ArrayList<Integer> neighbours = getNeighbours(currentGeneration, j, k);
                    int aliveNeighbours = checkNeighboursCount(neighbours, true);
                    if (fieldValue == 0 && aliveNeighbours == 3) {
                        nextGeneration[j][k] = 1;

                    }
                    if (fieldValue == 1 && aliveNeighbours < 2) {
                        nextGeneration[j][k] = 0;

                    }
                    if (fieldValue == 1 && (aliveNeighbours == 2 || aliveNeighbours == 3)) {
                        nextGeneration[j][k] = 1;

                    }
                    if (fieldValue == 1 && aliveNeighbours > 3) {
                        nextGeneration[j][k] = 0;
                    }
                }
            }
            boolean  checkGeneration = hasGenerationchanged(currentGeneration,nextGeneration);
            if (checkGeneration){
                currentGeneration = nextGeneration;
                System.out.println("------------------------------------------------------");
            }
            else{
                System.exit(0);
            }


        }
    }

    public static int checkNeighboursCount(ArrayList<Integer> neighbours, boolean isAlive) {
        int neighboursFound = 0;
        for (int i = 0; i < neighbours.size(); i++) {
            int value = neighbours.get(i);
            if (isAlive && value == 1) {
                neighboursFound++;
            } else if (!isAlive && value == 0)
                neighboursFound++;
        }
        return neighboursFound;
    }

    public static ArrayList<Integer> getNeighbours(int[][] gameOfLife, int x, int y) {
        ArrayList<Integer> neighbours = new ArrayList<>();
        for (int i = 0; i < gameOfLife.length; i++) {
            for (int j = 0; j < gameOfLife[i].length; j++) {
                if (i == x && j == y) {
                    if (j - 1 >= 0) {
                        neighbours.add(gameOfLife[i][j - 1]);
                    }
                    if (j - 1 >= 0 && i - 1 >= 0) {
                        neighbours.add(gameOfLife[i - 1][j - 1]);
                    }
                    if (i - 1 >= 0) {
                        neighbours.add(gameOfLife[i - 1][j]);
                    }
                    if (i - 1 >= 0 && j + 1 < gameOfLife[i].length) {
                        neighbours.add(gameOfLife[i - 1][j + 1]);
                    }
                    if (j + 1 < gameOfLife[i].length) {
                        neighbours.add(gameOfLife[i][j + 1]);
                    }
                    if (i + 1 < gameOfLife.length && j + 1 < gameOfLife[i].length) {
                        neighbours.add(gameOfLife[i + 1][j + 1]);
                    }
                    if (i + 1 < gameOfLife.length) {
                        neighbours.add(gameOfLife[i + 1][j]);
                    }
                    if (i + 1 < gameOfLife.length && j - 1 >= 0) {
                        neighbours.add(gameOfLife[i + 1][j - 1]);
                    }
                }
            }
        }
        return neighbours;
    }

    public static boolean hasGenerationchanged(int[][] currentGeneration, int[][] nextGeneration) {


        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration.length; j++) {
                if (!(currentGeneration[i][j] == nextGeneration[i][j])) {
                    return true;
                }

            }

        }
        return false;


    }
}