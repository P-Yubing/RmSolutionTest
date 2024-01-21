package com.yb.rmsolution.service;

import com.yb.rmsolution.vo.SubscribeVO;
import com.yb.rmsolution.vo.UserVO;

public interface RmSolutionService {

	// 회원가입-insert
	int joinUser(UserVO userVO);
	
	// 로그인-select one
	UserVO login(UserVO userVO);
	
	// 구독신청-insert
	int subscribe(SubscribeVO subVO);
	
	// 구독기간 연장-update
	int extendPeriod(SubscribeVO subVO);
	
	// 대시보드-select one
	SubscribeVO dashboard(SubscribeVO subVO);
}
