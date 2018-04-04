package com.xiuye.constant;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.constant.info.CONSTANT_info;

public final class CONSTANT_POOL {

	private List<CONSTANT_info> const_info;

	public CONSTANT_POOL() {
		this.const_info = new ArrayList<>();
	}

	public void add_Constant_info(CONSTANT_info info){
		const_info.add(info);
	}

	public int length(){
		return const_info.size();
	}

	public List<CONSTANT_info> getAllConstInfos(){
		return const_info;
	}




}
