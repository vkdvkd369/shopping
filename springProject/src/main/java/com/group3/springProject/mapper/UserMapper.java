package com.group3.springProject.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.group3.springProject.dto.User;
//com.group3.springProject.mapper.UserMapper
@Mapper
public interface UserMapper {
	public User selectUserId(String user_id);
	public User selectUserEmail(String user_email);
	public User selectUserPhone(String user_phone);
	public int userSignup(User user);
}
