package org.dog.withd.dao;

import org.dog.withd.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {
    void insert(UserDto userDao);
    List<UserDto> select();

    UserDao selectUser(String id);

    void delete(String id);

    void update(UserDto userDto);
}
