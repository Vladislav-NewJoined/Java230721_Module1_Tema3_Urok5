import java.util.Scanner;

public class Task1_3_5_5 {
    public static void main(String[] args) {
        System.out.println("Задание: \n5.  Пользователь вводит предложение их двух слов " +
                "\n(считайте в одну переменную String phrase). Вставьте между этими словами " +
                "\n«так сказать» используя StringBuilder.insert. Было: «Учу Java». Станет: " +
                "\n«Учу, так сказать, Java»\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение их двух слов: ");
        StringBuilder builder = new StringBuilder(scanner.nextLine());
        System.out.println("Исходная строка: \"" + builder + "\"");
        StringBuilder builderNew = new StringBuilder(builder);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ') {
                builderNew.insert(i+1, ", так сказать, ");
                builderNew.deleteCharAt(i);

            }
        }
        System.out.println("Итоговая строка: \"" + builderNew + "\"");
    }
}