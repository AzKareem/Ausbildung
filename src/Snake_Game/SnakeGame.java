package Snake_Game;

import java.util.Random;
import java.util.Scanner;

public class SnakeGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        int[][] snakeGame = new int[10][10];


        int[] snakeCoordinates = getRandomEmptyField(snakeGame);
       snakeGame[snakeCoordinates[0]][snakeCoordinates[1]] = FieldType.SNAKE.value;
        int[] fruitCoordinates = getRandomEmptyField(snakeGame);
       snakeGame[fruitCoordinates[0]][fruitCoordinates[1]] = FieldType.FRUIT.value;
        int numberX = snakeCoordinates[0];
        int numberY = snakeCoordinates[1];
        renderFunction(snakeGame);


        while (true) {
            String input;

            System.out.println("In which direction you want to move? ");
            input = sc.next();
            switch (input) {
                case "w":
                    snakeGame[numberX][numberY] = 0;
                    numberX = numberX - 1;
                    if (numberX < 0) {
                        numberX = snakeGame.length - 1;
                    }
                    snakeGame[numberX][numberY] = 10;
                    renderFunction(snakeGame);
                    break;
                case "s":
                    snakeGame[numberX][numberY] = 0;
                    numberX = numberX + 1;
                    if (numberX >= snakeGame.length) {
                        numberX = 0;
                    }
                    snakeGame[numberX][numberY] = 10;
                    renderFunction(snakeGame);
                    break;
                case "a":
                    snakeGame[numberX][numberY] = 0;
                    numberY = numberY - 1;

                    if (numberY < 0) {
                        numberY = snakeGame.length - 1;
                    }
                    snakeGame[numberX][numberY] = 10;
                    renderFunction(snakeGame);
                    break;
                case "d":
                    snakeGame[numberX][numberY] = 0;
                    numberY = numberY + 1;
                    if (numberY >= snakeGame.length) {
                        numberY = 0;
                    }
                    snakeGame[numberX][numberY] = 10;
                    renderFunction(snakeGame);
                    break;
                default:
                    System.out.println("Falsche eingabe! Bitte wählen Sie nochmal aus.");
            }

        }
    }

    public static void renderFunction(int[][] snakeGame) {
        for (int i = 0; i < snakeGame.length; i++) {
            for (int j = 0; j < snakeGame[i].length; j++) {
                if (snakeGame[i][j] == FieldType.SNAKE.value) {
                    printField(FieldType.SNAKE);
                } else if (snakeGame[i][j] == FieldType.EMPTY.value) {
                    printField(FieldType.EMPTY);
                } else if (snakeGame[i][j] == FieldType.FRUIT.value) {
                    printField(FieldType.FRUIT);
                }
            }
            System.out.println();
        }
    }

    public static void printField(FieldType fieldType) {
        System.out.print("[ " + fieldType.display + " ] ");
    }

    public static int[] getRandomEmptyField(int[][] snakeGame) {
        Random r = new Random();
        int numberX = r.nextInt(5);
        int numberY = r.nextInt(5);
        if (snakeGame[numberX][numberY] != FieldType.EMPTY.value) {
            return getRandomEmptyField(snakeGame);
        }
        return new int[]{
                numberX, numberY
        };
    }
}
