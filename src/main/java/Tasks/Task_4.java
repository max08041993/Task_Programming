package Tasks;

/**
 * Вывести на экран прямоугольник, заполненный буквами А. Количество строк в прямоугольнике равно 5, количество столбцов равно 8.
 */

public class Task_4 {
    public static void main(String[] args) {
        int line = 5;
        int column = 8;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}

