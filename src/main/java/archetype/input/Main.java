package archetype.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data/java.png");
             FileOutputStream fos = new FileOutputStream("data/newjava.png")){

//            byte[] bytes = new byte[fis.available()];
//            fis.read(bytes);
//            fos.write(bytes);

            int temp = 0;
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
