package archetype.except;

import archetype.Calculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class DemoException {
    public static void main(String[] args) {

        double v = Double.parseDouble("123.45");
        System.out.println(v);

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.FRANCE);
        try {
            Double parse = (Double) numberFormat.parse("123,45");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String[] numArray = {"50", "0", "s-", "20"};
        int sum = 0;
        try {
            for (String s : numArray) {
                int num = Integer.parseInt(s);
                sum += 100 / num;
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            sum--;
        }
        System.out.println(sum);


        try {
            Calculator calculator = null;
            calculator.dif(5, 2);
            int[] array = {};
            int arr = array[0];
            int val = 10/0;
        } catch (NullPointerException e){
            System.out.println(e);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        int val = 10/0;

        Path path = Paths.get("test1.txt");

        List<String> strings = null;
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(strings);

    }
}
