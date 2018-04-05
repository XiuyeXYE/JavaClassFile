package com.xiuye.attribute.method.code;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;

public final class LineNumberTable extends Attribute_info {

	private List<LineNumber_info> line_number_table;

	public int get_line_number_table_length(){
		return this.line_number_table.size();
	}

	public LineNumberTable(int attribute_name_index, long attribute_length, List<LineNumber_info> line_number_table) {
		super(attribute_name_index, attribute_length);
		this.line_number_table = line_number_table;
	}

	public LineNumberTable(int attribute_name_index, long attribute_length) {
		super(attribute_name_index, attribute_length);
		this.line_number_table = new ArrayList<>();
	}

	public List<LineNumber_info> getLine_number_table() {
		return line_number_table;
	}

	public void setLine_number_table(List<LineNumber_info> line_number_table) {
		this.line_number_table = line_number_table;
	}

	public void add_LineNumber_info(LineNumber_info lni) {
		this.line_number_table.add(lni);
	}

}
