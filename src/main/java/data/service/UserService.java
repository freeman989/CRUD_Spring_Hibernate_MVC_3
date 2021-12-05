package data.service;

import data.model.User;
import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void change(User user);
    User getById(int id);
}
