package com.zcc.dashboard.controller.p_util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zcc.dashboard.constant.ResponseCode;
import com.zcc.dashboard.model.CommonResponse;
import com.zcc.dashboard.model.p_util.StringLengthRequest;
import com.zcc.dashboard.service.p_util.StringUtilService;

/**
 * Created by NCP-620 on 2017/10/12.
 */
@RequestMapping("/dashboard/string")
@Controller
public class StringUtilController {

	@Autowired
	private StringUtilService stringUtilService;

	@GetMapping("/getStringLenth")
	@ResponseBody
	public CommonResponse getStringLenth(StringLengthRequest request) {
		return new CommonResponse<>(ResponseCode.OK, stringUtilService.getStringLenth(request));
	}
}
