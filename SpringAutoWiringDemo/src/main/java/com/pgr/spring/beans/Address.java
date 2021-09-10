package com.pgr.spring.beans;

import org.springframework.context.annotation.Scope;

@Scope(scopeName="prototype")
public class Address {

	private int addressId;
	private int pinCode;
	private String city;
	private String country;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", pinCode=" + pinCode + ", city=" + city + ", country=" + country
				+ "]";
	}

}
