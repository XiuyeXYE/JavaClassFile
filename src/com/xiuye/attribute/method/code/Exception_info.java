package com.xiuye.attribute.method.code;


public final class Exception_info {

	private int start_pc;//u2
	private int end_pc;//u2
	private int handler_pc;//u2
	private int catch_type;//u2


	public Exception_info() {
	}
	public Exception_info(int start_pc, int end_pc, int handler_pc, int catch_type) {
		this.start_pc = start_pc;
		this.end_pc = end_pc;
		this.handler_pc = handler_pc;
		this.catch_type = catch_type;
	}
	public int getStart_pc() {
		return start_pc;
	}
	public void setStart_pc(int start_pc) {
		this.start_pc = start_pc;
	}
	public int getEnd_pc() {
		return end_pc;
	}
	public void setEnd_pc(int end_pc) {
		this.end_pc = end_pc;
	}
	public int getHandler_pc() {
		return handler_pc;
	}
	public void setHandler_pc(int handler_pc) {
		this.handler_pc = handler_pc;
	}
	public int getCatch_type() {
		return catch_type;
	}
	public void setCatch_type(int catch_type) {
		this.catch_type = catch_type;
	}




}
