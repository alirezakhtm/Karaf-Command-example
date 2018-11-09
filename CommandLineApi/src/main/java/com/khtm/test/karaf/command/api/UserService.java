package com.khtm.test.karaf.command.api;

import java.util.Collection;

public interface UserService {

    void add(User user);
    void remove(int id);
    Collection<User> list();
    void clear();

}
