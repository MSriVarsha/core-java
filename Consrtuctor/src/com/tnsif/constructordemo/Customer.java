package com.tnsif.constructordemo;

public class Customer {
	private String Customername;
	private int customerid;
	private String customeraddress;
	
	Customer() {
		System.out.println("default");
	}

	public Customer(String customername, int customerid, String customeraddress) {
		super();
		Customername = customername;
		this.customerid = customerid;
		this.customeraddress = customeraddress;
	}

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	@Override
	public String toString() {
		return "Customer [Customername=" + Customername + ", customerid=" + customerid + ", customeraddress="
				+ customeraddress + "]";
	}

}
