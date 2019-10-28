package com.dhs.demo.model;

import lombok.Data;

@Data
public class Address {
	
	private String address1;
	private String address2;
	private String address3;

	@Override
	public boolean equals(Object b) {
		Address o = (Address) b;
	if(this.address1.equalsIgnoreCase(o.getAddress1())&& this.address2.equalsIgnoreCase(o.getAddress2())){
		return true;
	}
	else
		return false;
	}
	
	@Override
	public int hashCode() {
		return 0;
		
	}

}
