package data.dao;

import data.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void add(User user);
    void delete(User User);
    void change(User user);
    User getById(int id);
}
