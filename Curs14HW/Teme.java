package Curs14HW;

public class Teme {

    // Sper ca e bine, eu asa am inteles cerinta :)
    static void integerToString(Integer[] numbers) {
        String str = "";
        for (Integer i : numbers) {
            if (i != null)
                str += i.toString();
        }
        System.out.println("Stringul rezultat: " + str);
    }

    static void maxElementInMatrix(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Numarul maxim: " + max);
    }

    static void diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Suma elementelor de pe diagonala principala: " + sum);
    }

    public static void main(String[] args) {

        Integer[] numbers = { 1, 2, null, 4, 5, 6, 7, null, 9 };
        integerToString(numbers);

        int[][] matrix = { { 1, 2, 3 }, { 4, 9, 6 }, { 7, 8, 5 } };
        maxElementInMatrix(matrix);

        int[][] matrix2 = { { 31, 21, 3 }, { 41, 50, 6 }, { 70, 89, 9 } };
        diagonalSum(matrix2);

    }

}
