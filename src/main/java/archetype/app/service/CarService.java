package archetype.app.service;


import archetype.app.dao.CommonDao;
import archetype.app.entity.User;

public class CarService {

    private CommonDao<User> commonDao;

    public CarService(CommonDao<User> commonDao) {
        this.commonDao = commonDao;
    }

//    public CarService() {
//        this.commonDao = new UserDao();
//    }


    // method
}
