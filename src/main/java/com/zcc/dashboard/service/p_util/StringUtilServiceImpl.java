package com.zcc.dashboard.service.p_util;

import org.springframework.stereotype.Service;

import com.zcc.dashboard.model.p_util.StringLengthRequest;

/**
 * Created by NCP-620 on 2017/10/12.
 */
@Service
public class StringUtilServiceImpl implements StringUtilService{
	@Override
	public int getStringLenth(StringLengthRequest request) {
		String text = request.getText();
		boolean isAllLowcase = request.isAllLowcase();
		boolean isAllUpcase = request.isAllUpcase();
		boolean isOnlyLetter = request.isOnlyLetter();
		boolean isExcludeSpace = request.isExcludeSpace();
		int length = text.length();
		int spaceNum = 0;
		int upcaseNum = 0;
		int lowcaseNum = 0;
		int onlyletterNum = 0;
		int result = 0;
		char[] chars = text.toCharArray();
		for(int i = 0;i<text.length();i++){
			char c = chars[i];
			if(c==' ')spaceNum++;
			if(c>'a'&&c<'z'){
				lowcaseNum++;
				onlyletterNum++;
			}
			if(c>'A'&&c<'Z'){
				upcaseNum++;
				onlyletterNum++;
			}
		}
		if(isOnlyLetter){
			if(isAllUpcase)result += upcaseNum;
			if(isAllLowcase)result += lowcaseNum;
			if(!isAllLowcase&&!isAllUpcase)
				result+=onlyletterNum;
			return result;
		}
		if(isExcludeSpace){
			result = length-spaceNum;
		}else{
			result = length;
		}

		return result;
	}
}
