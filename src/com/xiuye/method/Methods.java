package com.xiuye.method;


import com.xiuye.attribute.Attribute_info;
import com.xiuye.attribute.Attributes;

public final class Methods {

	private int access_flags;//u2
	private int name_index;//u2
	private int descriptor_index;//u2
	private Attributes attributes;//u2 length


	public void add_attribute(Attribute_info ai){
		this.attributes.add(ai);
	}
	public int get_attributes_length(){
		return this.attributes.length();
	}


	public Methods(int access_flags, int name_index, int descriptor_index) {
		this.access_flags = access_flags;
		this.name_index = name_index;
		this.descriptor_index = descriptor_index;
		this.attributes = new Attributes();
	}
	public Methods(int access_flags, int name_index, int descriptor_index, Attributes attributes) {
		this.access_flags = access_flags;
		this.name_index = name_index;
		this.descriptor_index = descriptor_index;
		this.attributes = attributes;
	}

	public int getAccess_flags() {
		return access_flags;
	}
	public void setAccess_flags(int access_flags) {
		this.access_flags = access_flags;
	}
	public int getName_index() {
		return name_index;
	}
	public void setName_index(int name_index) {
		this.name_index = name_index;
	}
	public int getDescriptor_index() {
		return descriptor_index;
	}
	public void setDescriptor_index(int descriptor_index) {
		this.descriptor_index = descriptor_index;
	}
	public Attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}



}
