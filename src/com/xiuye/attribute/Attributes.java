package com.xiuye.attribute;

import java.util.ArrayList;
import java.util.List;

public final class Attributes {

	private List<Attribute_info> attributes;

	public Attributes(){
		this.attributes = new ArrayList<>();
	}

	public void add(Attribute_info ai){
		this.attributes.add(ai);
	}


	public int length(){
		return this.attributes.size();
	}

	public List<Attribute_info> getAllAttributes(){
		return this.attributes;
	}

}
