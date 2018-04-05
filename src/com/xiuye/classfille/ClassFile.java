package com.xiuye.classfille;


import com.xiuye.attribute.Attributes;
import com.xiuye.constant.CONSTANT_POOL;
import com.xiuye.interfaces.Interfaces;

public final class ClassFile {

	private long magic;//u4
	private int minor_version;//u2
	private int major_version;//u2
	private CONSTANT_POOL const_pool;//length u2;cp_info length

	private int access_flags;//u2
	private int this_class;//u2
	private int super_class;//u2

	private Interfaces interfaces;//length u2;interfaces length


	private Attributes attributes ;

}
