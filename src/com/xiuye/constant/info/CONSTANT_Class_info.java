package com.xiuye.constant.info;

public final class CONSTANT_Class_info extends CONSTANT_info{
	private final int tag = 7;// u1
	private int index;//u2
	public CONSTANT_Class_info() {

	}
	public CONSTANT_Class_info(int index) {
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getTag() {
		return tag;
	}



}
