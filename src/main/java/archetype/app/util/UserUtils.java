package archetype.app.util;

import archetype.app.entity.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserUtils {

    private UserUtils() {
    }

    public static Map<String, User> readDataFromFile(String fileName) {
        Map<String, User> users = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String str = null;
            while ((str = reader.readLine()) != null) {
                String[] split = str.split(",");
                users.put(split[0], new User(split[0], split[1], split[2], split[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
