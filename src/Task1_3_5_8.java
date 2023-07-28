import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1_3_5_8 {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Задание: \n8. Вернитесь к программе, которая запрашивает курс валют. Напишите " +
                "генератор даты для запроса к апи, на основе даты, \nвведенной пользователем. " +
                "Используйте StringBuilder." +
                "\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате 'yyyy-MM-dd', например, 2011-01-18: ");
        StringBuilder inputDate = new StringBuilder(scanner.nextLine());
        System.out.println("Исходная дата: " + inputDate);

        String inStr = inputDate.toString();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(inStr);
        String outStr = new SimpleDateFormat("dd/MM/yyyy").format(date);
        System.out.println("Дата, полученная в результате: " + outStr); // 18/01/2011

        StringBuilder inputPageURL = new StringBuilder("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");

        int startIndexInputPageURL1 = inputPageURL.lastIndexOf("date_req1=") + 10;
        int endIndexInputPageURL1 = inputPageURL.lastIndexOf("&date_req2=");

        int startIndexInputPageURL2 = inputPageURL.lastIndexOf("&date_req2=") + 11;
        int endIndexInputPageURL2 = inputPageURL.lastIndexOf("&VAL");

        StringBuilder outputPageURL1 = inputPageURL.replace(startIndexInputPageURL1, endIndexInputPageURL1, outStr);
        StringBuilder outputPageURLFinish = outputPageURL1.replace(startIndexInputPageURL2, endIndexInputPageURL2, outStr);

        String page = downloadWebPage(outputPageURLFinish.toString());

        if (page.contains("<Value>")) {
            int startIndex = page.lastIndexOf("<Value>");
            int endIndex = page.lastIndexOf("</Value>");
            String courseStr = page.substring(startIndex + 7, endIndex);
            System.out.println("Курс на введенную дату: " + courseStr);
        } else {
            System.out.println("На введённую дату курс не установлен.");
        }
    }
    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}