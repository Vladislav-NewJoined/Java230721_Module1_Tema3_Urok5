import devicepackage.Person;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        //тут цикл по чтению ключей, пункт 1
        while ((key = reader.readLine()).equals("user") ||
                key.equals("loser") ||
                key.equals("coder") ||
                key.equals("proger"))
        {
            //создаем объект, пункт 2

            //Это моя попытка создать объект класса с помощью его имени в строковом виде
            //Делаю первую букву полученного ключа заглавной
/*          String className = key.substring(0, 1).toUpperCase() + key.substring(1);
            // А вот тут как правильно создать объект?
            person = (Person) Class.forName(className).newInstance();*/

            //создаем объект, пункт 2 - это решение прошло проверку
            switch (key) {
                case "user":
                    person = new Person.Person$User();
                    break;
                case "loser":
                    person = new Person.Person$Loser();
                    break;
                case "coder":
                    person = new Person.Person$Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
                default: break;
            }

            doWork(person); //вызываем doWork

        }
    }

    private static void doWork(Person person) {
    }
}
