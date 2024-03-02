package week1ABSTRACTIONS._5_jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = getDimensions(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        matrixFilling(rows, cols, matrix);

        String command = "";
        long sum = 0;
        sum = getSum(scanner, matrix, command, sum);

        System.out.println(sum);
    }


    private static long getSum(Scanner scanner, int[][] matrix, String command, long sum) {
        while (!command.equals("Let the Force be with you")) {
            int[] petersPosition = getDimensions(scanner);
            int[] evilsPosition = getDimensions(scanner);
            int evilRow = evilsPosition[0];
            int evilCol = evilsPosition[1];
            while (evilRow >= 0 && evilCol >= 0) {
                if (ifInsideMatrix(matrix, evilRow, evilCol)) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }
            int petersRow = petersPosition[0];
            int petersCol = petersPosition[1];

            while (petersRow >= 0 && petersCol < matrix[1].length) {
                if (ifInsideMatrix(matrix, petersRow, petersCol)) {
                    sum += matrix[petersRow][petersCol];
                }
                petersCol++;
                petersRow--;
            }

            command = scanner.nextLine();
        }
        return sum;
    }

    private static void matrixFilling(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = value++;
            }
        }
    }

    private static int[] getDimensions(Scanner scanner) {
        int[] intArray = Arrays.stream((scanner.nextLine())
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return intArray;
    }

    private static boolean ifInsideMatrix(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }
}
