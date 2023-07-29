import java.util.Scanner;


public class Task1_3_5_3 {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.  Пользователь вводит слово. Добавьте к нему в начало «вы говорите" +
                ":» ... слово пользователя. И в конец: «.. и что?»\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");

        StringBuilder inputBuilder = new StringBuilder(scanner.nextLine());
        inputBuilder.insert(0, "вы говорите, ");

        inputBuilder = inputBuilder.append(", и что?");
        String strResult = inputBuilder.toString();
        System.out.println("Результат: " + strResult);
    }
}