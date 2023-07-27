import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!
//  Пример взят отсюда: https://www.sourcetrail.com/ru/java/java-get-class-by-string/

//  Создание класса и объекта Гоша Дударь: https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=13
//  Создание класса и объекта selfedu: https://www.youtube.com/watch?v=eL4tJFvaH2g
//  Здесь видео мин 08 38 ВАЖНО! Как sout в качестве объекта класса в main класс вывести
//  https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=14
public class Task1_3_5_11 {
    public static void main(String[] args) {
        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
                "\nсоздайте экземпляр класса.\n\nРешение: ");

        FileInformation scanStrings;
        scanStrings = new FileInformation();
        scanStrings.getScanner();
        FileInformation getObjects;
        getObjects = new FileInformation();
        getObjects.getInstances();

    }
}

class FileInformation {
    public static Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел, в качестве переменных (или полей класса) String, три слова, например " +
                "\"Один\", \"Два\", \"Три\", \nзакончите ввод нажатием клавиши Enter: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        getInstances(str1, str2, str3);
        return scanner;
}
    public static void getInstances(String str1, String str2, String str3) {
        System.out.println();
        System.out.println("Используя три введенных переменных, создаем экземпляр класса FileInformation и " +
                "обращаемся к этим трём переменным, \nимя экземпляра класса \"getInstances\": ");
        String object1 = str1;
        String object2 = str2;
        String object3 = str3;
        System.out.println("Экземпляр класса 1: " + object1 + "\nЭкземпляр класса 2: " + object2 +
                "\nЭкземпляр класса 3: " + object3);
    }

    public void getInstances() {
    }
}
//        Конец Примера _ КККККККККККККККК








////        Пример 9 ППППППППППППППППППППППППППППППППППП
////  Пример взят отсюда: https://www.sourcetrail.com/ru/java/java-get-class-by-string/
//
////  Создание класса и объекта Гоша Дударь: https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=13
////  Создание класса и объекта selfedu: https://www.youtube.com/watch?v=eL4tJFvaH2g
////  Здесь видео мин 08 38 ВАЖНО! Как sout в качестве объекта класса в main класс вывести
////  https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=14
//public class Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        FileInformation scanStrings;
//        scanStrings = new FileInformation();
//        scanStrings.getScanner();
//
//    }
//}
//
//class FileInformation {
//    public static Scanner getScanner() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите через пробел, в качестве переменных String, три слова, например " +
//                "\"Один\", \"Два\", \"Три\", \nзакончите ввод нажатием клавиши Enter: ");
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        String str3 = scanner.next();
//
//        System.out.println();
//        System.out.println("Используя три введенных переменных, создаем экземпляр класса FileInformation и обращаемся к этим трём переменным: ");
//        String object1 = scanner.next();
//        String object2 = scanner.next();
//        String object3 = scanner.next();
//        System.out.println("Экземпляр класса 1: " + object1 + "\nЭкземпляр класса 2: " + object2 +
//                "\nЭкземпляр класса 3: " + object3);
//        return scanner;
//}
//
//}
////        Конец Примера 9 КККККККККККККККК








////        Пример 8 ППППППППППППППППППППППППППППППППППП
////  Пример взят отсюда: https://www.sourcetrail.com/ru/java/java-get-class-by-string/
//
////  Создание класса и объекта Гоша Дударь: https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=13
////  Создание класса и объекта selfedu: https://www.youtube.com/watch?v=eL4tJFvaH2g
//public class Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        System.out.println("Создаем строку с тремя переменными: 'String str1, str2, str3;'");
//        System.out.println("Создаем три экземпляра класса FileInformation: ");
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Пользователь, введите три переменных: ");
//
////        System.out.print("Введите второе слово в качестве строкового поля классв FileInformation: ");
////        String word = scanner.next();
//
//
////        String inputStr = scanner.nextLine();
////        System.out.println("Исходные три переменных String: " + inputStr);
//
//        FileInformation createIFS;
////        createIFS.cif = new FileInformation();
//        createIFS = new FileInformation();
//        createIFS.fileInfo1();
//        createIFS.fileInfo2();
//        createIFS.fileInfo3();
//
////        try {
////            String className = "java.util.ArrayList";
////            Class<?> clazz = Class.forName(className);
////            Object instance = clazz.getDeclaredConstructor().newInstance();
////            Method addMethod = clazz.getMethod("add", Object.class);
////            addMethod.invoke(instance, "Hello, world!");
//////            System.out.println("Instance: " + instance);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//    }
//}
//
//class FileInformation {
//    static void fileInfo1() {
//        // Как пример, вводим три переменных
//        String str1, str2, str3;
//
//        str1 = "Объект 1";
//        try {
//            String className = "java.util.ArrayList";
//            Class<?> clazz = Class.forName(className);
//            Object instance1 = clazz.getDeclaredConstructor().newInstance();
//            Method addMethod1 = clazz.getMethod("add", Object.class);
//            addMethod1.invoke(instance1, "Экземпляр класса 1");
//            System.out.println("Instance1: " + instance1);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    static void fileInfo2() {
//        // Как пример, вводим три переменных
//        String str1, str2, str3;
//
//        str2 = "Объект 2";
//        try {
//            String className = "java.util.ArrayList";
//            Class<?> clazz = Class.forName(className);
//            Object instance2 = clazz.getDeclaredConstructor().newInstance();
//            Method addMethod2 = clazz.getMethod("add", Object.class);
//            addMethod2.invoke(instance2, "Экземпляр класса 2");
//            System.out.println("Instance2: " + instance2);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    static void fileInfo3() {
//        // Как пример, вводим три переменных
//        String str1, str2, str3;
//
//        str3 = "Объект 3";
//        try {
//            String className = "java.util.ArrayList";
//            Class<?> clazz = Class.forName(className);
//            Object instance3 = clazz.getDeclaredConstructor().newInstance();
//            Method addMethod3 = clazz.getMethod("add", Object.class);
//            addMethod3.invoke(instance3, "Экземпляр класса 3");
//            System.out.println("Instance3: " + instance3);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
////        Конец Примера 8 КККККККККККККККК








////        Пример 7 ППППППППППППППППППППППППППППППППППП
////  Пример взят отсюда: https://www.sourcetrail.com/ru/java/java-get-class-by-string/
//public class Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Пользователь, введите три переменных: ");
//
////        System.out.print("Введите второе слово в качестве строкового поля классв FileInformation: ");
////        String word = scanner.next();
//
//
////        String inputStr = scanner.nextLine();
////        System.out.println("Исходные три переменных String: " + inputStr);
//
//        FileInformation createInstanceFromString = new FileInformation();
//        createInstanceFromString.cif();
//
////        try {
////            String className = "java.util.ArrayList";
////            Class<?> clazz = Class.forName(className);
////            Object instance = clazz.getDeclaredConstructor().newInstance();
////            Method addMethod = clazz.getMethod("add", Object.class);
////            addMethod.invoke(instance, "Hello, world!");
//////            System.out.println("Instance: " + instance);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//    }
//}
//
//class FileInformation {
//    static void cif() {
//        // Как пример, вводим три переменных
//        String str1, str2, str3;
//
//        str1 = "Объект 1";
//        str2 = "Объект 2";
//        str3 = "Объект 3";
//        try {
//            String className = "java.util.ArrayList";
//            Class<?> clazz = Class.forName(className);
//            Object instance1 = clazz.getDeclaredConstructor().newInstance();
//            Object instance2 = clazz.getDeclaredConstructor().newInstance();
//            Object instance3 = clazz.getDeclaredConstructor().newInstance();
//            Method addMethod1 = clazz.getMethod("add", Object.class);
//            Method addMethod2 = clazz.getMethod("add", Object.class);
//            Method addMethod3 = clazz.getMethod("add", Object.class);
//            addMethod1.invoke(instance1, "Экземпляр класса 1");
//            System.out.println("Instance1: " + instance1);
//            addMethod2.invoke(instance2, "Экземпляр класса 2");
//            System.out.println("Instance2: " + instance2);
//            addMethod3.invoke(instance3, "Экземпляр класса 3");
//            System.out.println("Instance3: " + instance3);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
////        Конец Примера 7 КККККККККККККККК








////        Пример 6 ППППППППППППППППППППППППППППППППППП РАБОТАЕТ ПРИМЕР ИЗ ИСТОЧНИКА, ЕГО БЕРУ ЗА ОСНОВУ
////  Пример взят отсюда: https://www.sourcetrail.com/ru/java/java-get-class-by-string/
//public class Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Пользователь, введите три переменных: ");
////        System.out.print("Введите второе слово в качестве строкового поля классв FileInformation: ");
////        String word = scanner.next();
//
//        // Как пример, вводим три этих переменных
//        String str1, str2, str3;
//
//        str1 = "Объект 1";
//        str2 = "Объект 2";
//        str3 = "Объект 3";
//
//
////        String inputStr = scanner.nextLine();
////        System.out.println("Исходные три переменных String: " + inputStr);
//
//        FileInformation createInstanceFromString = new FileInformation();
//        createInstanceFromString.cif();
//        try {
//            String className = "java.util.ArrayList";
//            Class<?> clazz = Class.forName(className);
//            Object instance = clazz.getDeclaredConstructor().newInstance();
//            Method addMethod = clazz.getMethod("add", Object.class);
//            addMethod.invoke(instance, "Hello, world!");
////            System.out.println("Instance: " + instance);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class FileInformation {
//    static void cif() {
//        try {
//            String className = "java.util.ArrayList";
//            Class<?> clazz = Class.forName(className);
//            Object instance = clazz.getDeclaredConstructor().newInstance();
//            Method addMethod = clazz.getMethod("add", Object.class);
//            addMethod.invoke(instance, "Hello, world!");
//            System.out.println("Instance: " + instance);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    }
////        Конец Примера 6 КККККККККККККККК


////        Пример 5 ППППППППППППППППППППППППППППППППППП
//public class Task1_3_5_11 {
//    public void constructor2()
//    {
//    }
//
//    public void constructor2(int a, int b)
//    {
//        System.out.println(
//                "a = " + a + " b = " + b);
//    }
//
//    public static void main(String args[])
//    {
//        try {
//            Class cls = Class.forName("constructor2");
//            Class partypes[] = new Class[2];
//            partypes[0] = Integer.TYPE;
//            partypes[1] = Integer.TYPE;
//            Constructor ct
//                    = cls.getConstructor(partypes);
//            Object arglist[] = new Object[2];
//            arglist[0] = new Integer(37);
//            arglist[1] = new Integer(47);
//            Object retobj = ct.newInstance(arglist);
//        }
//        catch (Throwable e) {
//            System.err.println(e);
//        }
//    }
//}
////        Конец Примера 5 КККККККККККККККК


////        Пример 4 ППППППППППППППППППППППППППППППППППП Брать как исходный пример
//public class Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//    }
//}
////        Конец Примера 4 КККККККККККККККК


////        Пример 3 ППППППППППППППППППППППППППППППППППП
////  Пример с классом FileInformation взят отсюда:
////  видео мин 16 57  Урок 1. Введение в классы. Поля класса. Процедурное программирование, ООП,
////  организация кода Module1_Tema3_Urok1
////  Пример взят отсюда: https://translated.turbopages.org/proxy_u/en-ru.ru.0f86aada-64bec5b6-871675d6-74722d776562/https/stackoverflow.com/questions/19796730/java-how-to-create-a-class-instance-from-user-input
////  закончил мин 06 31 00
//
//public class Task1_3_5_11 {
//
//// Какие-то общие для всех классов методы
//}
//
//class Laptop implements Device {
//    private double batteryCapacity;
//    private String os;
//    private int memoryRom;
//    private int systemMemory;
//    private double cpu;
//    private int displayInchs;
//
//    public void setBatteryCapacity(Double valueOf) {
//
//    }
//
//    public void setOs(String os) {
//        this.os = os;
//    }
//
//    public String getOs() {
//        return os;
//    }
//
//    public void setMemoryRom(Integer memoryRom) {
//        this.memoryRom = memoryRom;
//    }
//
//    public Integer getMemoryRom() {
//        return memoryRom;
//    }
//
//    public void setSystemMemory(Integer systemMemory) {
//        this.systemMemory = systemMemory;
//    }
//
//    public Integer getSystemMemory() {
//        return systemMemory;
//    }
//
//    public void setCpu(Double cpu) {
//        this.cpu = cpu;
//    }
//
//    public Double getCpu() {
//        return cpu;
//    }
//
//    public void setDisplayInchs(Integer displayInchs) {
//        this.displayInchs = displayInchs;
//    }
//
//    public Integer getDisplayInchs() {
//        return displayInchs;
//    }
//
//    // Конструкторы, аксессоры и прочее
//}
//
//abstract class DeviceFabric {
//    private static final String PROPERTIES_DELIMITER = ",";
//    private static final String NAME_VALUE_DELIMITER = "=";
//
//    public Device create(String properties) {
//        return initialize(parseProperties(properties));
//    }
//
//    private static String[] trimAll(String[] items) {
//        return Arrays.stream(items)
//                .map(String::trim)
//                .toArray(String[]::new);
//    }
//
//    private static Map<String, String> parseProperties(String properties) {
//        return Arrays.stream(properties.split(PROPERTIES_DELIMITER))
//                .map(s -> s.split(NAME_VALUE_DELIMITER))
//                .filter(a -> a.length == 2)
//                .map(DeviceFabric::trimAll)
//                .collect(Collectors.toMap(a -> a[0], a -> a[1]));
//    }
//
//    protected abstract Device initialize(Map<String, String> properties);
//}
//
//class LaptopFabric extends DeviceFabric {
//    @Override
//    protected Device initialize(Map<String, String> properties) {
//        Laptop laptop = new Laptop();
//        for (Map.Entry<String, String> entry : properties.entrySet()) {
//            String propertyName = entry.getKey();
//            switch (entry.getKey()) {
//                case "BATTERY_CAPACITY":
//                    laptop.setBatteryCapacity(Double.valueOf(entry.getValue()));
//                    break;
//                case "OS":
//                    laptop.setOs(entry.getValue());
//                    break;
//                case "MEMORY_ROM":
//                    laptop.setMemoryRom(Integer.valueOf(entry.getValue()));
//                    break;
//                case "SYSTEM_MEMORY":
//                    laptop.setSystemMemory(Integer.valueOf(entry.getValue()));
//                    break;
//                case "CPU":
//                    laptop.setCpu(Double.valueOf(entry.getValue()));
//                    break;
//                case "DISPLAY_INCHS":
//                    laptop.setDisplayInchs(Integer.valueOf(entry.getValue()));
//                    break;
//                default:
//                    System.err.printf("Неизвестная характеристика оборудования - %s!%n", propertyName);
//            }
//        }
//        return laptop;
//    }
//}
//
//class InvalidFormatException extends Exception {
//    public InvalidFormatException(String msg) {
//        super(msg);
//    }
//}
//
//class Example {
//    private static final String DATA
//            = "Laptop : BATTERY_CAPACITY=1.5, OS=Linux, MEMORY_ROM=8000, SYSTEM_MEMORY=1000, CPU=2.2, DISPLAY_INCHS=19";
//
//    private static final String DELIMITER = ":";
//
//    private static String[] split() throws InvalidFormatException {
//        String[] parts = DATA.split(DELIMITER);
//        if (parts.length == 2) {
//            parts[0] = parts[0].trim();
//            parts[1] = parts[1].trim();
//            return parts;
//        } else
//            throw new InvalidFormatException("Неправильный формат входных данных!");
//    }
//
//    private static String getClassName() throws InvalidFormatException {
//        return split()[0];
//    }
//
//    private static String getProperties() throws InvalidFormatException {
//        return split()[1];
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        try {
//            DeviceFabric fabric = null;
//
//            String className = getClassName();
//            if ("Laptop".equals(className)) {
//                fabric = new LaptopFabric();
//            } else {
//                System.err.printf("Неизвестный класс оборудования - %s!%n", className);
//                return;
//            }
//
//            Device device = fabric.create(getProperties());
//            System.out.println(device);
//        } catch (InvalidFormatException exc) {
//            System.err.println(exc.getMessage());
//        }
//    }
//}//        Конец Примера 3 КККККККККККККККК


////        Пример 2 ППППППППППППППППППППППППППППППППППП
////  Пример с классом FileInformation взят отсюда:
////  видео мин 16 57  Урок 1. Введение в классы. Поля класса. Процедурное программирование, ООП,
////  организация кода Module1_Tema3_Urok1
////  Пример взят отсюда: https://translated.turbopages.org/proxy_u/en-ru.ru.0f86aada-64bec5b6-871675d6-74722d776562/https/stackoverflow.com/questions/19796730/java-how-to-create-a-class-instance-from-user-input
////  закончил мин 06 31 00
//
//public class Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        CreateMember member = new CreateMember(input);
//
//        System.out.println(member.getInput());
//
//    }
//}
//
//class CreateMember {
//    private String input;
//
//    public CreateMember(String input){
//        this.input = input;
//    }
//
//    public String getInput(){
//        return input;
//    }
//}
////        Конец Примера 2 КККККККККККККККК


////        Пример 1 ППППППППППППППППППППППППППППППППППП
////  Пример с классом FileInformation взят отсюда:
////  видео мин 16 57  Урок 1. Введение в классы. Поля класса. Процедурное программирование, ООП,
////  организация кода Module1_Tema3_Urok1
////  Пример взят отсюда: https://translated.turbopages.org/proxy_u/en-ru.ru.0f86aada-64bec5b6-871675d6-74722d776562/https/stackoverflow.com/questions/19796730/java-how-to-create-a-class-instance-from-user-input
////  закончил мин 06 31 00
//
//public class Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        File file = new File("test2.txt");
////        String absolutePath = file.getAbsolutePath();
////        String fileName = file.getName();
////        long size = file.length();
//
//        // видео мин 18 12 Так у нас объявляется экземпляр класса
//        FileInformation info2 = new FileInformation();
//        // видео мин 19 15 Теперь мы можем уже обращться к полям:
//        info2.absolutePath = file.getAbsolutePath();
//        info2.fileName = file.getName();
//        info2.size = file.length();
//
//
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Введите поля класса FileInformation в одну строку: ");
////        StringBuilder builder = new StringBuilder(scanner.nextLine());
////
////        String resultString = builder.toString();
////        System.out.println("Результат: \"" + resultString.trim() + "\"");
//    }
//}
////        Конец Примера 1 КККККККККККККККК






