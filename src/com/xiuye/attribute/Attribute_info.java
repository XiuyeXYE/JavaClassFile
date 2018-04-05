package com.xiuye.attribute;

public abstract class Attribute_info {

	private int attribute_name_index;//u2
	private long attribute_length;//u4



	public Attribute_info() {

	}
	public Attribute_info(int attribute_name_index, long attribute_length) {
		this.attribute_name_index = attribute_name_index;
		this.attribute_length = attribute_length;
	}
	public int getAttribute_name_index() {
		return attribute_name_index;
	}
	public void setAttribute_name_index(int attribute_name_index) {
		this.attribute_name_index = attribute_name_index;
	}
	public long getAttribute_length() {
		return attribute_length;
	}
	public void setAttribute_length(long attribute_length) {
		this.attribute_length = attribute_length;
	}

}
