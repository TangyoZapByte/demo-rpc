package com.demo.server.impl;

import com.demo.server.dao.UserMapper;
import com.demo.server.dto.UserDTO;
import com.demo.server.service.UserService;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.UUID;

@CloudComponent
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

	public String createUser(UserDTO user) {
        Assert.notNull(user, "用户信息不能为空");
        Assert.hasLength(user.getUserName(), "用户名不能为空");
        if(null == user.getUserId()){
            user.setUserId(String.valueOf(UUID.randomUUID()));
            userMapper.createUser(user);
            return user.getUserId();
        }
        UserDTO existUser = userMapper.getUser(user.getUserId());
        if(null == existUser){
            userMapper.createUser(user);
            return user.getUserId();
        }
        userMapper.updateUser(user);
		return user.getUserId();
	}

    public UserDTO getUser(String userId){
        Assert.hasLength(getUser(userId).getUserName(), "缺少查询的用户id");
        return userMapper.getUser(userId);
    }

}