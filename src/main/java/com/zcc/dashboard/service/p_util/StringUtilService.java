package com.zcc.dashboard.service.p_util;

import org.springframework.stereotype.Service;

import com.zcc.dashboard.model.p_util.StringLengthRequest;

/**
 * Created by NCP-620 on 2017/10/12.
 */
public interface StringUtilService {
	int getStringLenth(StringLengthRequest request);
}
