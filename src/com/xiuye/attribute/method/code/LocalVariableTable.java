package com.xiuye.attribute.method.code;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;

public final class LocalVariableTable extends Attribute_info {

	private List<Local_Variable_info> local_variable_table;



	public LocalVariableTable(int attribute_name_index, long attribute_length) {
		super(attribute_name_index, attribute_length);
		this.local_variable_table = new ArrayList<>();
	}
	public LocalVariableTable(int attribute_name_index, long attribute_length,
			List<Local_Variable_info> local_variable_table) {
		super(attribute_name_index, attribute_length);
		this.local_variable_table = local_variable_table;
	}
	public void add_Local_Variable_info(Local_Variable_info lvi){
		this.local_variable_table.add(lvi);
	}
	public int get_local_variable_table_length(){
		return this.local_variable_table.size();
	}
	public List<Local_Variable_info> getLocal_variable_table() {
		return local_variable_table;
	}
	public void setLocal_variable_table(List<Local_Variable_info> local_variable_table) {
		this.local_variable_table = local_variable_table;
	}



}
