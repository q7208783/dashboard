package com.zcc.dashboard.model.p_util;

import javax.validation.constraints.NotNull;

import com.zcc.dashboard.model.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by NCP-620 on 2017/10/12.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StringLengthRequest extends BaseRequest{
	private static final long serialVersionUID = 6146068778312889731L;
	@NotNull
	private String text;
	private boolean excludeSpace;
	private boolean onlyLetter;
	private boolean allLowcase;
	private boolean allUpcase;
}

