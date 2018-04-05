package com.xiuye.constant.access;

public final class InnerClassAccessFlags {

	//u2
	public static final int ACC_PUBLIC = 0x0001;
	public static final int ACC_PRIVATE = 0x0002;
	public static final int ACC_PROTECTED = 0x0004;
	public static final int ACC_STATIC = 0x0008;
	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_INTERFACE = 0x0020;
	public static final int ACC_ABSTRACT = 0x0400;
	public static final int ACC_SYNTHETIC = 0x1000;//并非由用户代码产生
	public static final int ACC_ANNOTATION = 0x2000;
	public static final int ACC_ENUM = 0x4000;

}
