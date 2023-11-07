package web.service;

import web.model.User;


import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(Long id);
    void addUser(User user);
    void updateUser(@Valid User user);
    void deleteUser(Long id);
}
