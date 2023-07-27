import java.util.Scanner;


//        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!
//  Пример взят отсюда: https://gist.github.com/ezhov-da/1544cb56555f6319f5bc25dc804700e1
public class Task1_3_5_6 {

    public static void main(String[] args) {
        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
                "\n2 программиста, и так далее\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        StringBuilder builder = new StringBuilder(scanner.nextLine());
        System.out.println("Исходное число: " + builder);

        int ost = Integer.parseInt(builder.toString()) % 100;
        int ost2 = ost % 10;

        StringBuilder builder1 = new StringBuilder(builder + " программист");
        StringBuilder builder2 = new StringBuilder(builder + " программиста");
        StringBuilder builder3 = new StringBuilder(builder + " программистов");

        if (ost > 9 && ost < 20) {
            System.out.println("Результат: " + builder3);
        } else {
            if (ost2 == 1) {
                System.out.println("Результат: " + builder1);

            } else if (ost2 > 1 && ost < 5) {
                System.out.println("Результат: " + builder2);

            } else {
                System.out.println("Результат: " + builder3);

            }
        }
    }
}
//        Конец Примера _ КККККККККККККККК


////        Пример 9 ППППППППППППППППППППППППППППППППППП
//public class Task1_3_5_6 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Вводите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходная строка: \"" + builder + "\"");
//
////        System.out.println("Итоговая строка: \"" + builderNew + "\"");
//    }
//}
////        Конец Примера 9 КККККККККККККККК


////        Пример 8 ППППППППППППППППППППППППППППППППППП осталось - 14 - символов
////  Пример взят отсюда: https://gist.github.com/ezhov-da/1544cb56555f6319f5bc25dc804700e1
//public class Task1_3_5_6 {
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходное число: " + builder);
//
//        int ost = Integer.parseInt(builder.toString()) % 100;
//        int ost2 = ost % 10;
//
//        StringBuilder builder1 = new StringBuilder(builder.toString() + " программист");
//        StringBuilder builder2 = new StringBuilder(builder.toString() + " программиста");
//        StringBuilder builder3 = new StringBuilder(builder.toString() + " программистов");
//
//        if (ost > 9 && ost < 20) {
////            return thirdstr;
//            System.out.println("Результат: " + builder3);
//        } else {
////            ost = ost % 10;
//            if (ost2 == 1) {
////                return firststr;
//                 System.out.println("Результат: " + builder1.toString());
//
//            } else if (ost2 > 1 && ost < 5) {
////                return secondstr;
//                System.out.println("Результат: " + builder2.toString());
//
//            } else {
////                return thirdstr;
//                System.out.println("Результат: " + builder3);
//
//            }
//        }
//
//
//
//
//
////        String text = "%s %s";
////
////            System.out.println("Результат: " +
////                    String.format(text,
////                            builder,
////                            getName(builder, "программист", "программиста", "программистов"))
////            );
//    }
//
////    public static String getName(StringBuilder countOrigin, String firststr, String secondstr, String thirdstr) {
////        int count = Integer.parseInt(countOrigin.toString());
////        int ost = count % 100;
////        if (ost > 9 && ost < 20)
////        {
////            return thirdstr;
////        } else {
////            ost = ost % 10;
////            if (ost == 1)
////            {
////                return firststr;
////            } else if (ost > 1 && ost < 5)
////            {
////                return secondstr;
////            } else
////            {
////                return thirdstr;
////            }
////        }
////    }
//}
////        Конец Примера 8 КККККККККККККККК


////        Пример 7 ППППППППППППППППППППППППППППППППППП осталось - 14 - символов _ Работает БЕЗ StringBuilder
////  Пример взят отсюда: https://gist.github.com/ezhov-da/1544cb56555f6319f5bc25dc804700e1
//public class Task1_3_5_6 {
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходное число: " + builder);
//
//        String text = "%s %s";
//
//            System.out.println("Результат: " +
//                    String.format(text,
//                            builder,
//                            getName(builder, "программист", "программиста", "программистов"))
//            );
//    }
//
//    public static String getName(StringBuilder countOrigin, String firststr, String secondstr, String thirdstr) {
//        int count = Integer.parseInt(countOrigin.toString());
//        int ost = count % 100;
//        if (ost > 9 && ost < 20)
//        {
//            return thirdstr;
//        } else {
//            ost = ost % 10;
//            if (ost == 1)
//            {
//                return firststr;
//            } else if (ost > 1 && ost < 5)
//            {
//                return secondstr;
//            } else
//            {
//                return thirdstr;
//            }
//        }
//    }
//}
////        Конец Примера 7 КККККККККККККККК


////        Пример 6 ППППППППППППППППППППППППППППППППППП осталось - 14 - символов
//public class Task1_3_5_6 {
////    private static final Logger LOG = Logger.getLogger(Task1_3_5_6.class.getName());
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходное число: \"" + builder + "\"");
//
//
////        int builder = 0;
//
//        String text = "%s %s";
//
////        for (int builder = 0; builder < 15; builder++) {
////            System.out.println(
////                    String.format(text,
////                            getName(builder, "остался", "осталось", "осталось"),
////                            builder,
////                            getName(builder, "пользователь", "пользователя", "пользователей"))
////            );
////        }
//
////        for (int builder = 0; builder < 15; builder++) {
////            System.out.println(
////                    String.format(text,
////                            getName(builder, "остался", "осталось", "осталось"),
////                            builder,
////                            getName(builder, "год", "года", "лет"))
////            );
////        }
//
//            System.out.println(
//                    String.format(text,
////                            getName(builder, "остался", "осталось", "осталось"),
//                            builder,
//                            getName(builder, "программист", "программиста", "программистов"))
//            );
//    }
//
//    public static String getName(StringBuilder countOrigin, String firststr, String secondstr, String thirdstr) {
//        String singleString2 = countOrigin.toString();
//        int count = Integer.parseInt(singleString2);
//        int ost = count % 100;
//        if (ost > 9 && ost < 20)
//        {
//            return thirdstr;
//        } else {
//            ost = ost % 10;
//            if (ost == 1)
//            {
//                return firststr;
//            } else if (ost > 1 && ost < 5)
//            {
//                return secondstr;
//            } else
//            {
//                return thirdstr;
//            }
//        }
//    }
//}
////        Конец Примера 6 КККККККККККККККК


////        Пример 5 ППППППППППППППППППППППППППППППППППП осталось - 14 - символов _ ОРИГИНАЛ
//public class Task1_3_5_6 {
////    private static final Logger LOG = Logger.getLogger(Task1_3_5_6.class.getName());
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        String text = "%s - %s - %s";
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "пользователь", "пользователя", "пользователей"))
//            );
//        }
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "год", "года", "лет"))
//            );
//        }
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "символ", "символа", "символов"))
//            );
//        }
//    }
//
//    public static String getName(int count, String firststr, String secondstr, String thirdstr) {
//        int ost = count % 100;
//        if (ost > 9 && ost < 20)
//        {
//            return thirdstr;
//        } else {
//            ost = ost % 10;
//            if (ost == 1)
//            {
//                return firststr;
//            } else if (ost > 1 && ost < 5)
//            {
//                return secondstr;
//            } else
//            {
//                return thirdstr;
//            }
//        }
//    }
//}
////        Конец Примера 5 КККККККККККККККК


////        Пример 4 ППППППППППППППППППППППППППППППППППП
//public class Task1_3_5_6 {
//    public static void main(String[] args) throws IOException, URISyntaxException, AWTException {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Вводите число: ");
////        StringBuilder builder = new StringBuilder(scanner.nextLine());
////        System.out.println("Исходная строка: \"" + builder + "\"");
////        System.out.println("Итоговая строка: \"" + builderNew + "\"");
//
//
//
//        int daysCount = 0;
//        String days = null;
//        String daysCase = null;
//        FindSuffix findSuffix = new FindSuffix();
//        findSuffix.getDaysWithCase(days, daysCase);
////        findSuffix.getDaysWithCase();
//
//    }
//}
//class FindSuffix {
//
////    /*private */static Object days;
////    /*private */static Object daysCase;
//
//    static Object getDaysWithCase(String days, String daysCase) {
//        int daysCount = 11;
//
//
//        if (daysCount < 0) {
//            /*String */days = String.valueOf(daysCount);
//            /*String */daysCase = "дней";
//            char lastChar = days.charAt(days.length() - 1);
//
//            if (days.length() >= 2 && lastChar - 1 == '1') {
//                // 10-19 дней
//            } else if (lastChar == '1') {
//                // 1, 21, 31 день
//                daysCase = "день";
//            } else if (lastChar == '2' || lastChar == '3' || lastChar == '4') {
//                // 2, 3, 4, 22, 33, 44 дня
//                daysCase = "дня";
//            }
//        }
//        System.out.println(String.format("{0} {1}", days, daysCase));
//        return String.format("{0} {1}", days, daysCase);
//    }
//
//    public void getDaysWithCase() {
//
//    }
//}
//
//
////        Конец Примера 4 КККККККККККККККК


////        Пример 3 ППППППППППППППППППППППППППППППППППП
//public class Task1_3_5_6 {
//    public static void main(String[] args) throws IOException, URISyntaxException, AWTException {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Вводите число: ");
////        StringBuilder builder = new StringBuilder(scanner.nextLine());
////        System.out.println("Исходная строка: \"" + builder + "\"");
////        System.out.println("Итоговая строка: \"" + builderNew + "\"");
//
//
//
//
//
//        FindSuffix findSuffix = new FindSuffix();
//        findSuffix.getDaysWithCase();
//
//    }
//}
//class FindSuffix {
//
//    private static Object days;
//    private static Object daysCase;
//
//    static String getDaysWithCase(int daysCount) {
//
//        if (daysCount < 0) {
//            String days = String.valueOf(daysCount);
//            String daysCase = "дней";
//            char lastChar = days.charAt(days.length() - 1);
//
//            if (days.length() >= 2 && lastChar - 1 == '1') {
//                // 10-19 дней
//            } else if (lastChar == '1') {
//                // 1, 21, 31 день
//                daysCase = "день";
//            } else if (lastChar == '2' || lastChar == '3' || lastChar == '4') {
//                // 2, 3, 4, 22, 33, 44 дня
//                daysCase = "дня";
//            }
//        }
//        return String.format("{0} {1}", days, daysCase);
//    }
//
//    public void getDaysWithCase() {
//
//    }
//}
//
//
////        Конец Примера 3 КККККККККККККККК


////        Пример 2 ППППППППППППППППППППППППППППППППППП осталось - 14 - символов
//public class Task1_3_5_6 {
////    private static final Logger LOG = Logger.getLogger(Task1_3_5_6.class.getName());
//
//    public static void main(String[] args) {
//        String text = "%s - %s - %s";
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "пользователь", "пользователя", "пользователей"))
//            );
//        }
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "год", "года", "лет"))
//            );
//        }
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "символ", "символа", "символов"))
//            );
//        }
//    }
//
//    public static String getName(int count, String firststr, String secondstr, String thirdstr) {
//        int ost = count % 100;
//        if (ost > 9 && ost < 20)
//        {
//            return thirdstr;
//        } else {
//            ost = ost % 10;
//            if (ost == 1)
//            {
//                return firststr;
//            } else if (ost > 1 && ost < 5)
//            {
//                return secondstr;
//            } else
//            {
//                return thirdstr;
//            }
//        }
//    }
//}
////        Конец Примера 2 КККККККККККККККК


////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class Task1_3_5_6 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  ППользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Вводите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходная строка: \"" + builder + "\"");
//
//        MyClass myClass = new MyClass();
//        myClass.days();
//
//
////        System.out.println("Итоговая строка: \"" + builderNew + "\"");
//    }
//}
//
//class MyClass {
//
//    static String days() {
//        int builder = 1;
//        int preLastDigit = builder % 100 / 10;
//
//        if (preLastDigit == 1) {
//            System.out.println("дней");
//            return "дней";
//        }
//
//        switch (builder % 10) {
//            case 1:
//                System.out.println("день");
//                return "день";
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("дня");
//                return "дня";
//            default:
//                System.out.println("дней");
//                return "дней";
//        }
//    }
//}
////        Конец Примера 1 КККККККККККККККК






