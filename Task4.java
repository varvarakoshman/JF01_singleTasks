import java.util.Scanner;

/*
  Задание 4.Одномерные массивы
  Даны действительные числа: a1, a2...a2n.
  Найти: max(a1+a2n, a2+a(2n-1),..., an+a(n+1))
 */

public class Main {

    public static double getMaxSum(double[] arr) {
        double max = 0;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] + arr[len - 1 - i] > max) {
                max = arr[i] + arr[len - 1- i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 5; //as an example
        double[] array = new double[2 * n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n * 2; i++) {
            array[i] = sc.nextDouble();
        }
        System.out.println(getMaxSum(array));
    }
}
