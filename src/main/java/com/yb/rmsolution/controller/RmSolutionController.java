package com.yb.rmsolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yb.rmsolution.service.RmSolutionService;
import com.yb.rmsolution.vo.SubscribeVO;
import com.yb.rmsolution.vo.UserVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/rm")
public class RmSolutionController {

	@Autowired
	private RmSolutionService rmService;
	
	// 회원가입
	@PostMapping(value = "/join", produces = "application/json;charset=utf-8")
	public int joinUser(@RequestBody UserVO userVO) {
		log.debug("" + userVO);
		return rmService.joinUser(userVO);
	}
	
	// 로그인
	@PostMapping(value = "/login", produces = "application/json;charset=utf-8")
	public UserVO login(@RequestBody UserVO userVO) {
		log.debug("" + userVO);
		return rmService.login(userVO);
	}
	
	// 구독신청
	@PostMapping(value = "/subscribe", produces = "application/json;charset=utf-8")
	public int subscribe(@RequestBody SubscribeVO subVO) {
		log.debug("" + subVO);
		return rmService.subscribe(subVO);
	}
	
	// 구독기간 연장
	@PutMapping(value = "/subscribe", produces = "application/json;charset=utf-8")
	public int extendPeriod(@RequestBody SubscribeVO subVO) {
		return rmService.extendPeriod(subVO);
	}
	
	// 대시보드
	@PostMapping(value = "/dashboard", produces = "application/json;charset=utf-8")
	public SubscribeVO dashboard(@RequestBody SubscribeVO subVO) {
		log.debug("" + subVO);
		return rmService.dashboard(subVO);
	}
	
}
