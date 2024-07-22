package com.demo.server.controller;

import com.demo.server.dto.UserDTO;
import com.demo.server.service.UserService;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@CloudReference
	private UserService userService;

	@RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public String createUser(UserDTO user){
		return userService.createUser(user);
	}

    @RequestMapping(path = "/getUser", method = RequestMethod.GET)
    public UserDTO getUser(@RequestParam(value = "user_id") Integer userId){
        return userService.getUser(String.valueOf(userId));
    }
}