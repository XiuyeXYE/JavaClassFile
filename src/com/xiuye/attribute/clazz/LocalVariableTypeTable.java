package com.xiuye.attribute.clazz;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;

public final class LocalVariableTypeTable extends Attribute_info{

	private List<Local_Variable_type_info> local_variable_type_table;

	public LocalVariableTypeTable(int attribute_name_index, long attribute_length,
			List<Local_Variable_type_info> local_variable_type_table) {
		super(attribute_name_index, attribute_length);
		this.local_variable_type_table = local_variable_type_table;
	}
	public LocalVariableTypeTable(int attribute_name_index, long attribute_length) {
		super(attribute_name_index, attribute_length);
		this.local_variable_type_table = new ArrayList<>();
	}

	public void add(Local_Variable_type_info lcti){
		this.local_variable_type_table.add(lcti);
	}
	public int length(){
		return this.local_variable_type_table.size();
	}
	public List<Local_Variable_type_info> getLocal_variable_type_table() {
		return local_variable_type_table;
	}
	public void setLocal_variable_type_table(List<Local_Variable_type_info> local_variable_type_table) {
		this.local_variable_type_table = local_variable_type_table;
	}



}
