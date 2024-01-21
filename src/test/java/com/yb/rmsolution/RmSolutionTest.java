package com.yb.rmsolution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yb.rmsolution.mapper.RmSolutionMapper;
import com.yb.rmsolution.vo.UserVO;

@SpringBootTest
public class RmSolutionTest {

	@Autowired
	private RmSolutionMapper rmMapper;
	
	@Test
	@DisplayName("rmSolution테스트")
	public void joinTest() {
		UserVO userVO = new UserVO();
		userVO.setUserId("aaa");
		userVO.setUserPass("98765");
		userVO.setUserName("가나다라");
		userVO.setUserBirth("2001-11-11");
		userVO.setUserMail("test@test.com");
		
		assertEquals(1, rmMapper.joinUser(userVO));
	}
}
