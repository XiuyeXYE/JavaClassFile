package com.xiuye.constant.info;

public final class CONSTANT_Methodref_info extends CONSTANT_info{

	private final int tag = 10;//u1
	private int index1;//u2 class_info
	private int index2;//u2 name_and_type
	public CONSTANT_Methodref_info() {

	}
	public CONSTANT_Methodref_info(int index1, int index2) {
		this.index1 = index1;
		this.index2 = index2;
	}
	public int getIndex1() {
		return index1;
	}
	public void setIndex1(int index1) {
		this.index1 = index1;
	}
	public int getIndex2() {
		return index2;
	}
	public void setIndex2(int index2) {
		this.index2 = index2;
	}
	public int getTag() {
		return tag;
	}



}
