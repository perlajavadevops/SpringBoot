package com.pgr.spring.beans;

public class Address {

	private int addressId;
	private int pinCode;
	private String city;
	private String country;

	public Address(int addressId, int pinCode, String city, String country) {
		this.addressId = addressId;
		this.pinCode = pinCode;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", pinCode=" + pinCode + ", city=" + city + ", country=" + country
				+ "]";
	}

}
