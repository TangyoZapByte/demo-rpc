package com.demo.server.dao;

import com.demo.server.dto.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT user_id as userId, user_name as userName, address FROM test_user WHERE user_id=#{id}")
    UserDTO getUser(String id);

    int updateUser(@Param("user") UserDTO user);

    @Insert("insert into (user_id, user_name, address) values (#{user.userId}, #{user.userName}, #{user.address})")
    int createUser(@Param("user") UserDTO user);
}