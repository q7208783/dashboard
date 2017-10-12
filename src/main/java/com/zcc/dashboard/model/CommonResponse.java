package com.zcc.dashboard.model;

import com.zcc.dashboard.constant.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by NCP-620 on 2017/10/12.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResponse<T> {
	private int returnCode;
	private String returnMsg;
	private T data;

	public CommonResponse(ResponseCode responseCode, T data) {
		this.returnCode = responseCode.getReturnCode();
		this.returnMsg = responseCode.getReturnMsg();
		this.data = data;
	}
}
