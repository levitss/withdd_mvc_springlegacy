package org.dog.withd.dao;

import org.apache.ibatis.session.SqlSession;
import org.dog.withd.dto.UserDto;
import org.dog.withd.mapper.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImp implements TestDao{
    @Autowired
    private SqlSessionTemplate sqlSession;
    private static final String NS="org.dog.withd.mapper.";
    @Override
    public UserDto getUserById(String id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUser(id);
    }
}
