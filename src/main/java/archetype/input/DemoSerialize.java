package archetype.input;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerialize {
    public static void main(String[] args) throws IOException {
        Device device1 = new Device(22, "Nokia", 4199.99,  2020);
        Device device2 = new Device(23, "Samsung", 19999.99,  2021);
        Device device3 = new Device(105, "Xiaomi ", 6999.99,  2020);
        List<Device> list = new ArrayList<>();
        list.add(device1);
        list.add(device2);
        list.add(device3);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/demo.dat"))){

            oos.writeObject(list);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
