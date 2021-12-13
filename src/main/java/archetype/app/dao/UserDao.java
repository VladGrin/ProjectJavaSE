package archetype.app.dao;

import archetype.app.entity.User;
import archetype.app.util.UserUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserDao implements CommonDao<User>{

    private static final Map<String, User> users = new HashMap<>();

    static {
        Map<String, User> stringUserMap = UserUtils.readDataFromFile("data/users.csv");
        users.putAll(stringUserMap);
    }

    @Override
    public User save(User user) {
        User result = users.get(user.getUserId());
        if (result != null) {
            result.setName(user.getName());
            result.setSurname(user.getSurname());
            result.setEmail(user.getEmail());
            user = result;
        }
        users.put(user.getUserId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public Collection<User> findAll() {
        return users.values();
    }

    @Override
    public void delete(String id) {
        users.remove(id);
    }
}
