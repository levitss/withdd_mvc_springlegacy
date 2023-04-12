package org.dog.withd.service;

import org.dog.withd.dao.UserDaoImp;
import org.dog.withd.dto.UserDto;
import org.dog.withd.repository.MybatisUserRepository;
import org.dog.withd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    SIm

    UserDaoImp userDaoImp;

    public boolean join(UserDto userDto) {
        userDaoImp.insert(userDto);
    }

}
