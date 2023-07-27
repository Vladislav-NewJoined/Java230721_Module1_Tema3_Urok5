import java.util.Scanner;

public class Task1_3_5_2 {
    public static void main(String[] args) {
        System.out.println("Задание: \n2.  Пользователь вводит три слова, соберите из них строку, где слова " +
                "\nбудут в обратном порядке\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три слова разделяя клавишей 'пробел' или 'enter': ");
        StringBuilder builder = new StringBuilder(/*scanner.nextLine()*/);

        for (int i = 0; i < 3; i++) {
            String word = scanner.next();
            builder.insert(0, word + " ");
        }

        String resultString = builder.toString();
        System.out.println("Итоговая строка: \"" + resultString.trim() + "\"");
    }
}