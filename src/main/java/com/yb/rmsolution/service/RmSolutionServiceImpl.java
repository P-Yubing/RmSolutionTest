package com.yb.rmsolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yb.rmsolution.mapper.RmSolutionMapper;
import com.yb.rmsolution.vo.SubscribeVO;
import com.yb.rmsolution.vo.UserVO;

@Service
public class RmSolutionServiceImpl implements RmSolutionService {

	@Autowired
	private RmSolutionMapper rmMapper;
	
	@Override
	public int joinUser(UserVO userVO) {
		return rmMapper.joinUser(userVO);
	}

	@Override
	public UserVO login(UserVO userVO) {
		return rmMapper.login(userVO);
	}

	@Override
	public int subscribe(SubscribeVO subVO) {
		return rmMapper.subscribe(subVO);
	}

	@Override
	public int extendPeriod(SubscribeVO subVO) {
		return rmMapper.extendPeriod(subVO);
	}

	@Override
	public SubscribeVO dashboard(SubscribeVO subVO) {
		return rmMapper.dashboard(subVO);
	}

}
