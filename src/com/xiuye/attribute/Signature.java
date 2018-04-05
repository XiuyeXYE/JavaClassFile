package com.xiuye.attribute;

public final class Signature extends Attribute_info{

	private int signature_index;//u2

	public Signature(int attribute_name_index, long attribute_length, int signature_index) {
		super(attribute_name_index, attribute_length);
		this.signature_index = signature_index;
	}
	public Signature(){
	}
	public int getSignature_index() {
		return signature_index;
	}
	public void setSignature_index(int signature_index) {
		this.signature_index = signature_index;
	}



}
