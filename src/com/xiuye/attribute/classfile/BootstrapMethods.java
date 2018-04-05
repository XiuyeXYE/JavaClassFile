package com.xiuye.attribute.classfile;

import java.util.ArrayList;
import java.util.List;

import com.xiuye.attribute.Attribute_info;

public final class BootstrapMethods extends Attribute_info {


	private List<Bootstrap_Method> bootstrap_methods;

	public List<Bootstrap_Method> getBootstrap_methods() {
		return bootstrap_methods;
	}

	public void setBootstrap_methods(List<Bootstrap_Method> bootstrap_methods) {
		this.bootstrap_methods = bootstrap_methods;
	}

	public BootstrapMethods(int attribute_name_index, long attribute_length, List<Bootstrap_Method> bootstrap_methods) {
		super(attribute_name_index, attribute_length);
		this.bootstrap_methods = bootstrap_methods;
	}
	public BootstrapMethods(int attribute_name_index, long attribute_length) {
		super(attribute_name_index, attribute_length);
		this.bootstrap_methods = new ArrayList<>();
	}

	public void add(Bootstrap_Method bm){
		this.bootstrap_methods.add(bm);
	}
	public int length(){
		return this.bootstrap_methods.size();
	}


}
