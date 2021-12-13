package archetype.app.service;


import archetype.app.dao.CommonDao;
import archetype.app.entity.User;

import java.util.Collection;
import java.util.List;

public class UserService {

    private CommonDao<User> commonDao;

    public List<User> findUserByNameAndSurname(String name, String surname) {
        Collection<User> users = commonDao.findAll();
        // logic
        return null;
    }

    //    public UserService() {
//        commonDao = new UserDao();
//    }

    public UserService(CommonDao<User> commonDao) {
        this.commonDao = commonDao;
    }


}
