package com.mybatisDemo.mapper;


import com.mybatisDemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Repository
@Service
public interface UserMapper {
    @Insert("insert into user(name,age,gender,motto)values(#{name},#{age},#{gender},#{motto})")
    int insertUser(User user);
}
