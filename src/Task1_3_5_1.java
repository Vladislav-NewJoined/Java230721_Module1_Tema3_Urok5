import java.util.Scanner;


//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Task1_3_5_1 {
    public static void main(String[] args) {
        System.out.println("Задание: \n1.  Пользователь вводит стихотворение из четырёх строк. Соберите их " +
                "в одну переменную, \nмежду каждой строкой вставьте символ переноса строки: «\\n»\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре строки стихотворения построчно: ");

        StringBuilder inputBuilder = new StringBuilder();
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            inputBuilder = new StringBuilder(inputBuilder + scanner.nextLine() + " ");
            resultBuilder = inputBuilder.append("\n");
        }
        for (int i = 3; i < 4; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            inputBuilder = new StringBuilder(inputBuilder + scanner.nextLine() + " ");
            resultBuilder = inputBuilder;
        }
        System.out.println();  //  перенос строки
        System.out.println("Результат: ");
        System.out.println(resultBuilder);
    }
}
//        Конец Примера _ КККККККККККККККК