package archetype.app.dao;

import archetype.app.entity.User;
import org.junit.Test;

import java.util.Collection;

public class UserDaoTest {

    private final CommonDao<User> dao = new UserDao();

    @Test
    public void save() {
        User user1 = new User();
        user1.setName("Vasia");
        user1.setSurname("Luchko");
        user1.setEmail("luchko@gmail.com");
        User user2 = new User();
        user2.setName("Dima");
        user2.setSurname("Luchenko");
        user2.setEmail("luchenko@gmail.com");

        User savedUser1 = dao.save(user1);
        User savedUser2 = dao.save(user2);
        System.out.println(savedUser1);
        System.out.println(savedUser2);

        System.out.println("FIND ALL");
        Collection<User> all = dao.findAll();
        for (User user : all) {
            System.out.println(user);
        }

        System.out.println("FIND BY ID");
        User byId = dao.findById(savedUser1.getUserId());
        System.out.println(byId);

        System.out.println("UPDATE Vasia USER");
        user1.setEmail("new@gmail.com");
        User savedUser1new = dao.save(user1);
        System.out.println(savedUser1new);

        User byId1 = dao.findById(savedUser1.getUserId());
        System.out.println(byId1);

        System.out.println("DELETE Vasia USER");
        dao.delete(savedUser1.getUserId());

        System.out.println("FIND ALL AFTER DELETING");
        Collection<User> all1 = dao.findAll();
        for (User user : all1) {
            System.out.println(user);
        }
    }
}