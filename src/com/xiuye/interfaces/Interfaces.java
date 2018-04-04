package com.xiuye.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Interfaces {

	private List<Integer> interfaces;

	public Interfaces() {
		this.interfaces = new ArrayList<>();
	}

	public void add_interface(int index){
		this.interfaces.add(index);
	}

	public int length(){
		return this.interfaces.size();
	}

	public List<Integer> getAllInterfaces(){
		return this.interfaces;
	}

}
