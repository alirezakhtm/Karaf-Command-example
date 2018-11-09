package com.khtm.test.karaf.command.provider;

import com.khtm.test.karaf.command.api.User;
import com.khtm.test.karaf.command.api.UserService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImp implements UserService {

    private Map<Integer, User> users = new HashMap<Integer, User>();

    public void add(User user) {
        users.put(user.getId(), user);
    }

    public void remove(int id) {
        if(users.keySet().contains(id)) {
            users.remove(id);
        }
    }

    public Collection<User> list() {
        return users.values();
    }

    public void clear() {
        users.clear();
    }
}
