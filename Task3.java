package epam.JFcourse;

/*
Задание 3. Циклы
Составить программу для вычисления значений функции F(x) на отрезке [а, b]
с шагом h. Результат представить в виде таблицы, первый столбец которой – значения
аргумента, второй - соответствующие значения функции: F(x)=tg(2x)-3
 */

public class Task3 {

    public static void func(double a, double b, double h) {
        double value;
        for (double i = a; i < b; i += h) {
            value = Math.tan(2*i) - 3;
            System.out.println(i + " " + value);
        }
    }

    public static void main(String[] args) {
        func(-3.3, 3.3, 0.1);
    }
}
