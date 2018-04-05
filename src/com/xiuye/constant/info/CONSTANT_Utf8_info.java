package com.xiuye.constant.info;

import java.util.ArrayList;
import java.util.List;

public final class CONSTANT_Utf8_info extends CONSTANT_info{

	private final int tag = 1;// u1
	private List<Byte> bytes;// length u2

	public CONSTANT_Utf8_info() {
		this.bytes = new ArrayList<>();
	}

	public CONSTANT_Utf8_info(int length, List<Byte> bytes) {
		this.bytes = bytes;
	}

	public int getTag() {
		return tag;
	}


	public void add_utf8_bytes(byte b){
		this.bytes.add(b);
	}

	public List<Byte> getBytes() {
		return bytes;
	}

	public void setBytes(List<Byte> bytes) {
		this.bytes = bytes;
	}

}
