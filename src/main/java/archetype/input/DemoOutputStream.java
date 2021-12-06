package archetype.input;

import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputStream {
    public static void main(String[] args) {

//        File file = new File("data/out_str.txt");
//        FileOutputStream fos = new FileOutputStream(file);

        try (FileOutputStream fos = new FileOutputStream("data/out_str.txt", true)) {

            fos.write(65);
            byte[] bytes = {67, 69, 71, 97, 100};
            fos.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
