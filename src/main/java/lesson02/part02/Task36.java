package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 * Пример: m=2, n=4
 * 8888
 * 8888
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать два числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить прямоугольник размером m на n из восьмёрок.
 * 4.	В программе должен использоваться цикл for.
 */

public class Task36 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("m:");
        int m = scanner.nextInt();
        System.out.println("n:");
        int n = scanner.nextInt();
        for (int i=1; i<=m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
        //напишите тут ваш код

    }
}
