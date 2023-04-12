package org.dog.withd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dog.withd.dao.UserDao;
import org.dog.withd.dto.UserDto;

import java.util.List;

@Mapper
public interface UserMapper {
    void insert(UserDao userDao);
    List<UserDto> select();

    UserDto getUser(@Param("id") String id);

    void delete(@Param("id") String id);

    void update(@Param("id") String id, @Param("updateParam") UserDao updateParam);
}
