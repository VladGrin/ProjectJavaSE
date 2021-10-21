package archetype;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoExceptionExample {

    public static void main(String[] args) {
        String[] arr = {"10", "0", "s"};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                int num = Integer.parseInt(arr[i]);
                sum += 10 / num;
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
        }
        System.out.println("END");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));){

            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("File no found");
        }

    }
}
