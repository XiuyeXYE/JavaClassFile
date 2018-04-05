package com.xiuye.attribute.method;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;
import com.xiuye.attribute.method.code.Exception_info;

public final class Code extends Attribute_info {

	private int max_stack;//u2
	private int max_locals;//u2
	//指令 1 byte
	private List<Byte> code;//code_length u4 real u2;codes u1
	private List<Exception_info> exception_table;//length u2;
	private List<Attribute_info> attrbutes;//length u2;

	public int getCodeLenth(){
		return this.code.size();
	}
	public int get_Exception_Table_Length(){
		return this.exception_table.size();
	}
	public int getAttrbutesLenth(){
		return this.attrbutes.size();
	}

	public Code(int attribute_name_index, long attribute_length, int max_stack, int max_locals){
		super(attribute_name_index, attribute_length);
		this.max_stack = max_stack;
		this.max_locals = max_locals;
		this.code = new ArrayList<>();
		this.exception_table = new ArrayList<>();
		this.attrbutes = new ArrayList<>();
	}

	public Code(int attribute_name_index, long attribute_length, int max_stack, int max_locals, List<Byte> code,
			List<Exception_info> exception_table, List<Attribute_info> attrbutes) {
		super(attribute_name_index, attribute_length);
		this.max_stack = max_stack;
		this.max_locals = max_locals;
		this.code = code;
		this.exception_table = exception_table;
		this.attrbutes = attrbutes;
	}


	public void add_Code(byte code){
		this.code.add(code);
	}

	public void add_Exception_info(Exception_info ef){
		this.exception_table.add(ef);
	}

	public void add_Attribute_info(Attribute_info ai){
		this.attrbutes.add(ai);
	}

	public int getMax_stack() {
		return max_stack;
	}

	public void setMax_stack(int max_stack) {
		this.max_stack = max_stack;
	}

	public int getMax_locals() {
		return max_locals;
	}

	public void setMax_locals(int max_locals) {
		this.max_locals = max_locals;
	}

	public List<Byte> getCode() {
		return code;
	}

	public void setCode(List<Byte> code) {
		this.code = code;
	}

	public List<Exception_info> getException_table() {
		return exception_table;
	}

	public void setException_table(List<Exception_info> exception_table) {
		this.exception_table = exception_table;
	}

	public List<Attribute_info> getAttrbutes() {
		return attrbutes;
	}

	public void setAttrbutes(List<Attribute_info> attrbutes) {
		this.attrbutes = attrbutes;
	}



}
