package Tasks;

import java.util.List;

/**
 * Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
 */

public class Task_3 {
    public static void main(String[] args) {
        int value = 5;
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
