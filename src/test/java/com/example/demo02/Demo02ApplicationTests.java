package com.example.demo02;

import com.example.demo02.bean.User;
import com.example.demo02.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public  class Demo02ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSelect(){
		List<User> userList = userMapper.selectList(null);
//		User user = userMapper.selectById(1);
//		System.out.println(user);
		Assert.assertEquals(5,userList.size());
		userList.forEach(System.out::println);
	}
}
