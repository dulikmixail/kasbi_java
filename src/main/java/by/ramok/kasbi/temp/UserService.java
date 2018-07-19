//package by.ramok.kasbi.service;
//
//import by.ramok.kasbi.dao.IUserDAO;
//
//import by.ramok.kasbi.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//
//@Component
//public class UserService implements IUserService {
//
//    @Autowired
//    private IUserDAO userDAO;
//
//    public List<User> getAllUsers() {
//        List<User> entities = userDAO.getUsers();
//        return entities;
//    }
//
//
//    public User getUserByUsername(String username) {
//        User user = userDAO.getUser(username);
//        return user;
//    }
//
//    public void createUser(User user) {
//        userDAO.createUser(user);
//    }
//
//    public void updateUser(User user) {
//        userDAO.updateUser(user);
//
//    }
//
//    public void deleteUser(String username) {
//        userDAO.deleteUser(username);
//    }
//
//}
//
