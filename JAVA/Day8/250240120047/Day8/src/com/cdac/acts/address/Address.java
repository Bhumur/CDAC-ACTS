package com.cdac.acts.address;

public class Address {
	

	private String houseNo;
	private String laneNo;
	private String area;
	private String pinCode;
	
	
	public Address() {
		this.houseNo = "" ;
		this.laneNo = "";
		this.area = "";
		this.pinCode = "";
	}


	public Address(String houseNo, String laneNo, String area, String pinCode) {
		this.houseNo = houseNo;
		this.laneNo = laneNo;
		this.area = area;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", laneNo=" + laneNo + ", area=" + area + ", pinCode=" + pinCode + "]";
	}

}