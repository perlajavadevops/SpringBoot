package com.pgr.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean{

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

	@Override
	public void destroy() throws Exception {
		System.out.println("Address is destroyed...");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Address class object is created....");
	}

}
