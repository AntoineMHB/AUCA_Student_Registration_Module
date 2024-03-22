package Service;

import dao.UserDao;

public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDao();
    @Override
    public String loginUser(String email, String password) {
        return userDao.loginUser(email, password);
    }
}
