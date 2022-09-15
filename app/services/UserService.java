package services;

import models.User;

import java.util.*;

public class UserService {

    private Map<Integer, User> userTable = new HashMap<>();


    public Optional<User> addUser(User User) {
        int id = userTable.size();
        User.setId(id);
        userTable.put(id, User);
        return Optional.ofNullable(User);
    }

    public Optional<User> getUser(int id) {
        return Optional.ofNullable(userTable.get(id));
    }

    public Set<User> getAlluserTable() {
        return new HashSet<>(userTable.values());
    }

    public Optional<User> updateUser(User User) {
        int id = User.getId();
        if (userTable.containsKey(id)) {
            userTable.put(id, User);
            return Optional.ofNullable(User);
        }
        return null;
    }

    public boolean deleteUser(int id) {
        return userTable.remove(id) != null;
    }
}
