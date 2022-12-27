package com.adaniak.socialmedia.api.user;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.UserDatabase;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    //JPA/hibernate > Database
    //UserDaoService > Static List
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static {
        users.add(new User(++userCount, "Michael", "Jordan", "USA", LocalDate.now().minusYears(35), LocalDate.now().minusYears(1)));
        users.add(new User(++userCount, "Mehmet", "Okur", "Turkey", LocalDate.now().minusYears(23), LocalDate.now().minusYears(2)));
        users.add(new User(++userCount, "Steve", "Nash", "USA", LocalDate.now().minusYears(27), LocalDate.now().minusYears(3)));
        users.add(new User(++userCount, "Dwayne", "Wade", "USA", LocalDate.now().minusYears(25), LocalDate.now().minusYears(4)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
