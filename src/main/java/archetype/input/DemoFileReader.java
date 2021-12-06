package archetype.input;

import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/reader_in.txt")) {

            int read = reader.read();
            System.out.println((char) read);
            char[] chars = new char[100];

            reader.read(chars);
            System.out.println(new String(chars));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
