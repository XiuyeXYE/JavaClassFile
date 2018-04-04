package com.xiuye.constant.info;

public final class CONSTANT_Integer_info extends CONSTANT_info{

	private final int tag = 3;// u1
	private byte[] bytes;//u4



	public CONSTANT_Integer_info() {

	}
	public CONSTANT_Integer_info(byte[] bytes) {
		this.bytes = bytes;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public int getTag() {
		return tag;
	}



}
