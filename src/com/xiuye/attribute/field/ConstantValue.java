package com.xiuye.attribute.field;

import com.xiuye.attribute.Attribute_info;

//if field is static, + this
public final class ConstantValue extends Attribute_info {

	private int constantvalue_index;//u2

	public ConstantValue() {
	}
	public ConstantValue(int attribute_name_index, long attribute_length, int constantvalue_index) {
		super(attribute_name_index, attribute_length);
		this.constantvalue_index = constantvalue_index;
	}
	public int getConstantvalue_index() {
		return constantvalue_index;
	}
	public void setConstantvalue_index(int constantvalue_index) {
		this.constantvalue_index = constantvalue_index;
	}




}
