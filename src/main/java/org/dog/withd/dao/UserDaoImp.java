package org.dog.withd.dao;

import org.dog.withd.dto.UserDto;
import org.dog.withd.service.UserServiceImp;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDaoImp")
public class UserDaoImp implements UserDao {
    private SqlSessionTemplate sqlSession;
    //    private static final String NAMESPACE;
    private UserServiceImp userServiceImp;

    @Override
    public void insert(UserDto userDto) {
        sqlSession.insert("insert.insert",userDto);

    }

    @Override
    public List<UserDto> select() {
        return sqlSession.selectList("sql.sel");
    }

    @Override
    public UserDao selectUser(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(UserDto userDto) {

    }
}
