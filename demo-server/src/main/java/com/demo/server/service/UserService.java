package com.demo.server.service;

import com.demo.server.dto.UserDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudFunction;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService
public interface UserService {

    @CloudFunction("333000")
    String createUser(UserDTO user);

    @CloudFunction("333001")
    UserDTO getUser(String userId);
}