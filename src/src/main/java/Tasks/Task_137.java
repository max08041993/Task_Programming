package Tasks;

import com.github.javafaker.Faker;

import java.util.Scanner;

public class Task_137 {

    /*
     * 137. Реализуйте серию из n игр "Камень, ножницы, бумага" с компьютером.
     * В результате выведите статистику: сколько игр выиграл пользователь, сколько раз каждого вида ходов было выбрано.
     * Дополните игру анализом компьютера ваших ходов и выбор наиболее подходящего против вас хода.
     */

    public static void main(String[] args) {
        Faker faker = new Faker();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игр: ");
        int countGame = Integer.parseInt(scanner.nextLine());
        int countVictory = 0;
        int countFail = 0;
        int countDraw = 0;
        for (int i = 0; i < countGame; i++) {
            System.out.print("Введите вашу фигуру. Камень, Ножницы или Бумага: ");
            String selectedFigureUser = scanner.nextLine();
            String selectedFigurePS = faker.options().option("Камень", "Ножницы", "Бумага");
            if (selectedFigureUser.equals(selectedFigurePS)) {
                System.out.println("Ничья!");
                countDraw++;
            } else if (selectedFigureUser.equals("Камень")) {
                if (selectedFigurePS.equals("Ножницы")) {
                    System.out.println("Поздравляем! Ты победил!");
                    countVictory++;
                } else {
                    System.out.println("Ты проиграл! Еще все получится!");
                    countFail++;
                }
            } else if (selectedFigureUser.equals("Ножницы")) {
                if (selectedFigurePS.equals("Бумага")) {
                    System.out.println("Поздравляем! Ты победил!");
                    countVictory++;
                } else {
                    System.out.println("Ты проиграл! Еще все получится!");
                    countFail++;
                }
            } else {
                if (selectedFigurePS.equals("Ножницы")) {
                    System.out.println("Поздравляем! Ты победил!");
                    countVictory++;
                } else {
                    System.out.println("Ты проиграл! Еще все получится!");
                    countFail++;
                }
            }
            System.out.println("Фигура Игрока: " + selectedFigureUser + ". Фигура Компьютера: " + selectedFigurePS);
            System.out.println();
        }
        System.out.println("//////////////////////////////////////////////////////////////");
        if (countVictory > 0) System.out.println("Количество побед за игру = " + countVictory);
        if (countFail > 0) System.out.println("Количество поражений за игру = " + countFail);
        if (countDraw > 0) System.out.println("Количество игр в ничью = " + countDraw);
    }
}
