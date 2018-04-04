package com.xiuye.constant.info;

public final class CONSTANT_InvokeDynamic_info extends CONSTANT_info{

	private final int tag = 18;//u1
	private int bootstrap_method_attr_index;//u2
	private int name_and_type_index;//u2




	public CONSTANT_InvokeDynamic_info() {

	}
	public CONSTANT_InvokeDynamic_info(int bootstrap_method_attr_index, int name_and_type_index) {
		this.bootstrap_method_attr_index = bootstrap_method_attr_index;
		this.name_and_type_index = name_and_type_index;
	}
	public int getBootstrap_method_attr_index() {
		return bootstrap_method_attr_index;
	}
	public void setBootstrap_method_attr_index(int bootstrap_method_attr_index) {
		this.bootstrap_method_attr_index = bootstrap_method_attr_index;
	}
	public int getName_and_type_index() {
		return name_and_type_index;
	}
	public void setName_and_type_index(int name_and_type_index) {
		this.name_and_type_index = name_and_type_index;
	}
	public int getTag() {
		return tag;
	}



}
