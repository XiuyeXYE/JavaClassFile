package com.xiuye.attribute.method.code;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;

public final class StackMapTable extends Attribute_info {

	private List<Stack_Map_Frame> stack_map_frame_entries;

	public int length(){
		return this.stack_map_frame_entries.size();
	}

	public void add(Stack_Map_Frame smf){
		stack_map_frame_entries.add(smf);
	}

	public StackMapTable(int attribute_name_index, long attribute_length) {
		super(attribute_name_index, attribute_length);
		this.stack_map_frame_entries = new ArrayList<>();
	}

	public StackMapTable(int attribute_name_index, long attribute_length,
			List<Stack_Map_Frame> stack_map_frame_entries) {
		super(attribute_name_index, attribute_length);
		this.stack_map_frame_entries = stack_map_frame_entries;
	}

	public List<Stack_Map_Frame> getStack_map_frame_entries() {
		return stack_map_frame_entries;
	}

	public void setStack_map_frame_entries(List<Stack_Map_Frame> stack_map_frame_entries) {
		this.stack_map_frame_entries = stack_map_frame_entries;
	}

}
