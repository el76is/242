package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(Long id);

    Long getIdByUsername(String username);

    User getUserByUsername(String username);

    void create(User user);

    void update(User user);

    void delete(Long id);
}
