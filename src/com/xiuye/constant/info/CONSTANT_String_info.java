package com.xiuye.constant.info;

public final class CONSTANT_String_info extends CONSTANT_info{
	private final int tag = 8;// u1
	private int index;//u2
	public CONSTANT_String_info() {

	}
	public CONSTANT_String_info(int index) {
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
