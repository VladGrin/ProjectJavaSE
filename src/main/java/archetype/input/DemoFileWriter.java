package archetype.input;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("data/wr_out.txt")){

            writer.write("Hello World!");
            char[] chars = {'h', 'e', 'l', 'l'};
            writer.write(chars);
            writer.write(100);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
