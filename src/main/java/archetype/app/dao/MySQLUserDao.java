package archetype.app.dao;

import archetype.app.entity.User;

import java.util.Collection;

public class MySQLUserDao implements CommonDao<User>{

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public Collection<User> findAll() {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
