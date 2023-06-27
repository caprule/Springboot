package com.example.springapi.service;


import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "ida", 32, "ida@gmail.com");
        User user2 = new User(2, "joh", 64, "joh@gmail.com");
        User user3 = new User(3, "fik", 45, "fik@gmail.com");
        User user4 = new User(4, "jess", 16, "jess@gmail.com");
        User user5 = new User(5, "Zig", 59, "Zig@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));

    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();

        for (User user: userList ) {
            if(id == user.getId()) {
                optional = optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
