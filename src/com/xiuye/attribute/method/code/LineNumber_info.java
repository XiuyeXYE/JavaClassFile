package com.xiuye.attribute.method.code;

public final class LineNumber_info {

	private int start_pc;// u2
	private int line_number;// u2

	public LineNumber_info() {

	}

	public LineNumber_info(int start_pc, int line_number) {
		this.start_pc = start_pc;
		this.line_number = line_number;
	}

	public int getStart_pc() {
		return start_pc;
	}

	public void setStart_pc(int start_pc) {
		this.start_pc = start_pc;
	}

	public int getLine_number() {
		return line_number;
	}

	public void setLine_number(int line_number) {
		this.line_number = line_number;
	}

}
