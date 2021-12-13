package archetype.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DemoDeserialize {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/demo.dat"))) {
            List<Device> devices = (List<Device>) ois.readObject();
            System.out.println(devices);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
