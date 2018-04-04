package com.xiuye.constant.info.tag;

public enum CONSTANT_Info_tag {

	Utf8_info_tag(1),
	Integer_info_tag(3),
	Float_info_tag(4),
	Long_info_tag(5),
	Double_info_tag(6),
	Class_info_tag(7),
	String_info_tag(8),
	Fieldref_info_tag(9),
	Methodref_info_tag(10),
	InterfaceMethod_info_tag(11),
	NameAndType_info_tag(12),
	MethodHandle_info_tag(15),
	MethodType_info_info(16),
	InvokeDynamic_info_tag(18);


	private final int tagValue;
	private CONSTANT_Info_tag(int value) {
		this.tagValue = value;
	}
	public int getTagValue() {
		return tagValue;
	}


//	public static void main(String []args){
//		System.out.println(CONSTANT_Type_tag.Class_info_tag.getTagValue());
//	}


}
