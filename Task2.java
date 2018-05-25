package epam.JFcourse;

/*
Задание 2. Циклы, типы данных
Найти наименьший номер элемента последовательности, для которого выполняется
условие M. Вывести на экран этот номер и все элементы ai где i = 1, 2, ..., n.
a(n)= 1/(n+1)^2, M: a(n) < epsilon
 */

public class Task2 {

    public static void findMinIndex(int n, double e) {
        for (int i = 1; i < n + 1; i++) {
            if (1 / (Math.pow((i + 1), 2.0)) < e) {
                System.out.println(i);
                break;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            System.out.println(1 / (Math.pow((i + 1), 2.0)) + " ");
        }
    }

    public static void main(String[] args) {
        findMinIndex(7, 0.045);
    }
}
