package epam.JFcourse;

/*
Задание 5. Двумерные массивы
Получить матрицу:

1 0 0 ... 0 0 1
0 1 0 ... 0 1 0
0 0 1 ... 1 0 0
...............
0 1 0 ... 0 1 0
1 0 0 ... 0 0 1
 */
public class Task5 {

    public static int[][] getMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 0;
            }
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMatrix(getMatrix(15));
    }
}
