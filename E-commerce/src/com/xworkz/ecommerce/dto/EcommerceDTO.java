package com.xworkz.ecommerce.dto;
import java.io.Serializable;

public class EcommerceDTO implements Serializable {
	
	private String userName;
	transient private String passWord;
	private long shopRegisterNumber;
	private String location;
	private long customerBase;
	private ProductDTO productDTO;
	
	public EcommerceDTO(String userName, String passWord, long shopRegisterNumber, String location, long customerBase,
			ProductDTO productDTO) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.shopRegisterNumber = shopRegisterNumber;
		this.location = location;
		this.customerBase = customerBase;
		this.productDTO = productDTO;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public long getShopRegisterNumber() {
		return shopRegisterNumber;
	}
	public void setShopRegisterNumber(long shopRegisterNumber) {
		this.shopRegisterNumber = shopRegisterNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getCustomerBase() {
		return customerBase;
	}
	public void setCustomerBase(long customerBase) {
		this.customerBase = customerBase;
	}
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	
	@Override
	public String toString() {
		return "EcommerceDTO [userName=" + userName + ", passWord=" + passWord + ", shopRegisterNumber="
				+ shopRegisterNumber + ", location=" + location + ", customerBase=" + customerBase + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (customerBase ^ (customerBase >>> 32));
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
		result = prime * result + (int) (shopRegisterNumber ^ (shopRegisterNumber >>> 32));
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EcommerceDTO))
			return false;
		EcommerceDTO other = (EcommerceDTO) obj;
		if (customerBase != other.customerBase)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (passWord == null) {
			if (other.passWord != null)
				return false;
		} else if (!passWord.equals(other.passWord))
			return false;
		if (shopRegisterNumber != other.shopRegisterNumber)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
}
