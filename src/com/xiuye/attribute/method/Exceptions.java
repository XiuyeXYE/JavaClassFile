package com.xiuye.attribute.method;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;

public final class Exceptions extends Attribute_info {

	private List<Integer> exception_index_table;//u2 length;index u2;

	public int get_exception_index_table_length(){
		return this.exception_index_table.size();
	}


	public Exceptions(int attribute_name_index, long attribute_length, List<Integer> exception_index_table) {
		super(attribute_name_index, attribute_length);
		this.exception_index_table = exception_index_table;
	}
	public Exceptions(int attribute_name_index, long attribute_length) {
		super(attribute_name_index, attribute_length);
		this.exception_index_table = new ArrayList<>();
	}

	public void add_Exception_index(int index){
		this.exception_index_table.add(index);
	}
	public List<Integer> getException_index_table() {
		return exception_index_table;
	}
	public void setException_index_table(List<Integer> exception_index_table) {
		this.exception_index_table = exception_index_table;
	}




}
