package com.xiuye.attribute.classfile;

import com.xiuye.attribute.Attribute_info;

public final class SourceFile extends Attribute_info {

	private int sourcefile_index;// u2

	public SourceFile() {
	}

	public SourceFile(int attribute_name_index, long attribute_length, int sourcefile_index) {
		super(attribute_name_index, attribute_length);
		this.sourcefile_index = sourcefile_index;
	}

	public int getSourcefile_index() {
		return sourcefile_index;
	}

	public void setSourcefile_index(int sourcefile_index) {
		this.sourcefile_index = sourcefile_index;
	}

}
