package com.xiuye.constant.info;

public final class CONSTANT_MethodType_info extends CONSTANT_info{
	private final int tag = 16;//u1
	private int descriptor_index;//u2;
	public CONSTANT_MethodType_info() {

	}
	public CONSTANT_MethodType_info(int descriptor_index) {
		this.descriptor_index = descriptor_index;
	}
	public int getDescriptor_index() {
		return descriptor_index;
	}
	public void setDescriptor_index(int descriptor_index) {
		this.descriptor_index = descriptor_index;
	}
	public int getTag() {
		return tag;
	}


}
