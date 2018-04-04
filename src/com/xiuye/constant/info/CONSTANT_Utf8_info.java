package com.xiuye.constant.info;

public final class CONSTANT_Utf8_info extends CONSTANT_info{

	private final int tag = 1;// u1
	private int length;// u2
	private byte[] bytes;// length

	public CONSTANT_Utf8_info() {
	}

	public CONSTANT_Utf8_info(int length, byte[] bytes) {
		this.length = length;
		this.bytes = bytes;
	}

	public int getTag() {
		return tag;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

}
