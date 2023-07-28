import java.util.Scanner;

public class Task1_3_5_7 {
    public static void main(String[] args) {
        System.out.println("Задание: \n7.  Пользователь вводит предложение, удалите все пробелы из него\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение из нескольеих слов, " +
                "например \"Текст со множеством пробелов\": ");
        StringBuilder builder = new StringBuilder(scanner.nextLine());
        String builderStr = builder.toString();
        System.out.println("Исходная строка: " + builder);

        String result = builderStr.replaceAll("\\s", "");
        System.out.println("Результат: " + result);
    }
}
