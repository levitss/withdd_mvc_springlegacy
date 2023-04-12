package org.dog.withd.repository;

import org.dog.withd.dto.UserDto;

public interface UserRepository {
    boolean save(UserDto userDto);

    void delete(UserDto userDto);

    UserDto findById(String id);
}
