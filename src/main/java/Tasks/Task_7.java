package Tasks;

import java.util.Scanner;

/**
 * Вычислите 12+14. Ответ: 0.75
 */

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Сумма равна: " + (a + b));
    }
}
