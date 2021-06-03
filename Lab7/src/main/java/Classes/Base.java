package Classes;

import java.util.ArrayList;
import java.util.List;

public class Base {
    private static Base instance;
    private static List<User> userList;

    private Base() {}

    public static Base getInstance() {
        if (instance == null) {
            instance = new Base();
            userList = new ArrayList<User>();
        }
        return instance;
    }

    public void add(User user) {

        userList.add(user);
    }

    public List<User> getUserList() {

        return userList;
    }

}
