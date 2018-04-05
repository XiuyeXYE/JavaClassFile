package com.xiuye.attribute.classfile;

public final class Inner_Class_info {

	private int inner_class_info_index;//u2
	private int outer_class_info_index;//u2
	private int inner_name_index;//u2
	private int inner_class_access_flag;//u2



	public Inner_Class_info() {
	}



	public int getInner_class_info_index() {
		return inner_class_info_index;
	}



	public void setInner_class_info_index(int inner_class_info_index) {
		this.inner_class_info_index = inner_class_info_index;
	}



	public int getOuter_class_info_index() {
		return outer_class_info_index;
	}



	public void setOuter_class_info_index(int outer_class_info_index) {
		this.outer_class_info_index = outer_class_info_index;
	}



	public int getInner_name_index() {
		return inner_name_index;
	}



	public void setInner_name_index(int inner_name_index) {
		this.inner_name_index = inner_name_index;
	}



	public int getInner_class_access_flag() {
		return inner_class_access_flag;
	}



	public void setInner_class_access_flag(int inner_class_access_flag) {
		this.inner_class_access_flag = inner_class_access_flag;
	}



	public Inner_Class_info(int inner_class_info_index, int outer_class_info_index, int inner_name_index,
			int inner_class_access_flag) {
		this.inner_class_info_index = inner_class_info_index;
		this.outer_class_info_index = outer_class_info_index;
		this.inner_name_index = inner_name_index;
		this.inner_class_access_flag = inner_class_access_flag;
	}



}
