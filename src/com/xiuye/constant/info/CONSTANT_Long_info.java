package com.xiuye.constant.info;

public final class CONSTANT_Long_info extends CONSTANT_info{

	private final int tag = 5;// u1
	private byte[] bytes;//u8



	public CONSTANT_Long_info() {

	}
	public CONSTANT_Long_info(byte[] bytes) {
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
