package com.xiuye.classfille;

import com.xiuye.attribute.Attributes;
import com.xiuye.constant.CONSTANT_POOL;
import com.xiuye.field.Fields;
import com.xiuye.interfaces.Interfaces;
import com.xiuye.method.Methods;

public final class ClassFile {

	private long magic;// u4
	private int minor_version;// u2
	private int major_version;// u2
	private CONSTANT_POOL const_pool;// length u2;cp_info length

	private int access_flags;// u2
	private int this_class;// u2
	private int super_class;// u2

	private Interfaces interfaces;// length u2;interfaces length
	private Fields fields;// u2 length
	private Methods methods;// u2 length
	private Attributes attributes;// length u2

	public ClassFile(long magic, int minor_version, int major_version, CONSTANT_POOL const_pool, int access_flags,
			int this_class, int super_class, Interfaces interfaces, Fields fields, Methods methods,
			Attributes attributes) {
		this.magic = magic;
		this.minor_version = minor_version;
		this.major_version = major_version;
		this.const_pool = const_pool;
		this.access_flags = access_flags;
		this.this_class = this_class;
		this.super_class = super_class;
		this.interfaces = interfaces;
		this.fields = fields;
		this.methods = methods;
		this.attributes = attributes;
	}
	public ClassFile(long magic, int minor_version, int major_version, CONSTANT_POOL const_pool, int access_flags,
			int this_class, int super_class) {
		this.magic = magic;
		this.minor_version = minor_version;
		this.major_version = major_version;
		this.const_pool = const_pool;
		this.access_flags = access_flags;
		this.this_class = this_class;
		this.super_class = super_class;
	}

	public ClassFile() {
	}
	public long getMagic() {
		return magic;
	}
	public void setMagic(long magic) {
		this.magic = magic;
	}
	public int getMinor_version() {
		return minor_version;
	}
	public void setMinor_version(int minor_version) {
		this.minor_version = minor_version;
	}
	public int getMajor_version() {
		return major_version;
	}
	public void setMajor_version(int major_version) {
		this.major_version = major_version;
	}
	public CONSTANT_POOL getConst_pool() {
		return const_pool;
	}
	public void setConst_pool(CONSTANT_POOL const_pool) {
		this.const_pool = const_pool;
	}
	public int getAccess_flags() {
		return access_flags;
	}
	public void setAccess_flags(int access_flags) {
		this.access_flags = access_flags;
	}
	public int getThis_class() {
		return this_class;
	}
	public void setThis_class(int this_class) {
		this.this_class = this_class;
	}
	public int getSuper_class() {
		return super_class;
	}
	public void setSuper_class(int super_class) {
		this.super_class = super_class;
	}
	public Interfaces getInterfaces() {
		return interfaces;
	}
	public void setInterfaces(Interfaces interfaces) {
		this.interfaces = interfaces;
	}
	public Fields getFields() {
		return fields;
	}
	public void setFields(Fields fields) {
		this.fields = fields;
	}
	public Methods getMethods() {
		return methods;
	}
	public void setMethods(Methods methods) {
		this.methods = methods;
	}
	public Attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}




}
