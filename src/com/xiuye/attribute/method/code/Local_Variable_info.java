package com.xiuye.attribute.method.code;

public final class Local_Variable_info {

	private int start_pc;//u2 偏移量
	private int length;//u2 生命周期长度
	private int name_index;//u2
	private int descriptor_index;//u2
	private int index;//u2 LVT slot index
	public Local_Variable_info() {

	}
	public Local_Variable_info(int start_pc, int length, int name_index, int descriptor_index, int index) {
		this.start_pc = start_pc;
		this.length = length;
		this.name_index = name_index;
		this.descriptor_index = descriptor_index;
		this.index = index;
	}
	public int getStart_pc() {
		return start_pc;
	}
	public void setStart_pc(int start_pc) {
		this.start_pc = start_pc;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getName_index() {
		return name_index;
	}
	public void setName_index(int name_index) {
		this.name_index = name_index;
	}
	public int getDescriptor_index() {
		return descriptor_index;
	}
	public void setDescriptor_index(int descriptor_index) {
		this.descriptor_index = descriptor_index;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}




}
