package com.zcc.dashboard.constant;

import lombok.Getter;

/**
 * Created by NCP-620 on 2017/10/12.
 */
public enum ResponseCode{

	OK(0,"success"),UNKNOWN_ERROR(10000,"unknown error");

	@Getter
	private int returnCode;
	@Getter
	private String returnMsg;

	ResponseCode(int returnCode,String returnMsg){
		this.returnCode = returnCode;
		this.returnMsg = returnMsg;
	}
}
