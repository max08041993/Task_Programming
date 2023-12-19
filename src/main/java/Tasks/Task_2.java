package Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Вывести на экран текущее название дня недели, название месяца и свое имя. Каждое слово должно быть в отдельной строке.
 */

public class Task_2 {
    public static void main(String[] args) {
        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Форматируем текущий день недели
        DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("EEEE");
        String dayOfWeek = currentDate.format(dayOfWeekFormatter);

        // Форматируем текущий месяц
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("LLLL", new Locale("ru"));
        String month = currentDate.format(monthFormatter);

        System.out.println(dayOfWeek);
        System.out.println(month);
        System.out.print("Ирина");
    }
}
