package com.xiuye.constant.info;

public final class CONSTANT_MethodHandle_info extends CONSTANT_info{

	private final int tag = 15;//u1
	private int reference_kind;//u1
	private int reference_index;//u2

	public CONSTANT_MethodHandle_info() {
	}


	public CONSTANT_MethodHandle_info(int reference_kind, int reference_index) {
		this.reference_kind = reference_kind;
		this.reference_index = reference_index;
	}



	public int getReference_kind() {
		return reference_kind;
	}

	public void setReference_kind(int reference_kind) {
		this.reference_kind = reference_kind;
	}

	public int getReference_index() {
		return reference_index;
	}

	public void setReference_index(int reference_index) {
		this.reference_index = reference_index;
	}

	public int getTag() {
		return tag;
	}

}
