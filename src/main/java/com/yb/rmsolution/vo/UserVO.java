package com.yb.rmsolution.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserVO {
	private String userId;
	private String userPass;
	private String userName;
	private String userBirth;
	private String userMail;
}
