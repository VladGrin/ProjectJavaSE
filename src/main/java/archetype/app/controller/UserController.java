package archetype.app.controller;


import archetype.app.dao.CommonDao;
import archetype.app.dao.UserDao;
import archetype.app.entity.User;
import archetype.app.service.CarService;
import archetype.app.service.UserService;

public class UserController {

    private UserService userService;
    private CarService carService;

    public UserController() {
        CommonDao<User> userDao = new UserDao();
        userService = new UserService(userDao);
        carService = new CarService(userDao);
    }
}
