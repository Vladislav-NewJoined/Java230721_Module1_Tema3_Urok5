import java.util.Scanner;

public class Task1_3_5_4 {
    public static void main(String[] args) {
        System.out.println("Задание: \n4.  Пользователь вводит пять слов, соберите из них целую строку, между " +
                "каждым словом вставьте «, и»\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять слов поочередно: ");

        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите слово " + (i + 1) + ": ");
            inputBuilder = new StringBuilder(inputBuilder + scanner.nextLine() + " ");
        }

        String inputPr = String.valueOf(inputBuilder);
        String input = inputPr.trim();
        System.out.println("Исходная строка: " + input);

        String result = input.replaceAll("\\s", ", и ");
        System.out.println("Результат: " + result);
    }
}