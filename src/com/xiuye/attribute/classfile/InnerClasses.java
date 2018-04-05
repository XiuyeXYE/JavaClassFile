package com.xiuye.attribute.classfile;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;

public final class InnerClasses extends Attribute_info {

	private List<Inner_Class_info> innerClasses;

	public InnerClasses(int attribute_name_index, long attribute_length, List<Inner_Class_info> innerClasses) {
		super(attribute_name_index, attribute_length);
		this.innerClasses = innerClasses;
	}
	public InnerClasses(int attribute_name_index, long attribute_length) {
		super(attribute_name_index, attribute_length);
		this.innerClasses = new ArrayList<>();
	}

	public void add_inner_class_info(Inner_Class_info ici){
		this.innerClasses.add(ici);
	}

	public int get_inner_class_info_length(){
		return this.innerClasses.size();
	}
	public List<Inner_Class_info> getInnerClasses() {
		return innerClasses;
	}
	public void setInnerClasses(List<Inner_Class_info> innerClasses) {
		this.innerClasses = innerClasses;
	}




}
