package org.dog.withd.repository;

import org.dog.withd.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MybatisUserRepository implements UserRepository {
    private Map<String, UserDto> userList=new ConcurrentHashMap<>();


    @Override
    public boolean save(UserDto userDto) {
        if(userList.get(userDto.getId())!=null)//중복시 무시
            return false;
        userList.put(userDto.getId(), userDto);
        return true;
    }

    @Override
    public void delete(UserDto userDto) {
        userList.remove(userDto.getId(), userDto);
    }

    @Override
    public UserDto findById(String id) {
        return userList.get(id);
    }
}
