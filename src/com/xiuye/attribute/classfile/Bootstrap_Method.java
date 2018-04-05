package com.xiuye.attribute.classfile;

import java.util.ArrayList;
import java.util.List;

public final class Bootstrap_Method {

	private int bootstrap_method_ref;//u2
	private List<Integer> bootstrap_arguments;//length u2;u2

	public Bootstrap_Method(int bootstrap_method_ref, List<Integer> bootstrap_arguments) {
		this.bootstrap_method_ref = bootstrap_method_ref;
		this.bootstrap_arguments = bootstrap_arguments;
	}

	public Bootstrap_Method(int bootstrap_method_ref) {
		this.bootstrap_method_ref = bootstrap_method_ref;
		this.bootstrap_arguments = new ArrayList<>();
	}




	public void add(int index){
		this.bootstrap_arguments.add(index);
	}

	public int length(){
		return this.bootstrap_arguments.size();
	}

	public int getBootstrap_method_ref() {
		return bootstrap_method_ref;
	}

	public void setBootstrap_method_ref(int bootstrap_method_ref) {
		this.bootstrap_method_ref = bootstrap_method_ref;
	}

	public List<Integer> getBootstrap_arguments() {
		return bootstrap_arguments;
	}

	public void setBootstrap_arguments(List<Integer> bootstrap_arguments) {
		this.bootstrap_arguments = bootstrap_arguments;
	}







}

