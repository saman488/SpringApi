package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.awt.desktop.OpenFilesEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"Sami",32,"sami@email.com");
        User user2 = new User(2,"karim",26,"karim@email.com");
        User user3 = new User(3,"Xola",45,"Xola@email.com");
        User user4 = new User(4,"Bayiz",32,"bayiz@email.com");
        User user5 = new User(5,"Voso",59,"voso@email.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional=Optional.empty();
        for (User user: userList){
            if(id==user.getId()){
                optional=Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
