package com.xworkz.ecommerce.service;

import java.io.Serializable;

import com.xworkz.ecommerce.dao.EcommerceDAO;
import com.xworkz.ecommerce.dto.EcommerceDTO;
import com.xworkz.ecommerce.exception.InvalidData;

public class EcommerceServiceImp implements EcommerceService, Serializable{
	private EcommerceDAO dao;
	String regexp="^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=])"+"(?=\\S+$).{8,20}$";
	
	public EcommerceServiceImp(EcommerceDAO dao) {
		this.dao = dao;
	}
	@Override
	public boolean validateData(EcommerceDTO ecommerceDTO) {
		if(ecommerceDTO!=null) {
			if(ecommerceDTO.getUserName().isEmpty()
				||ecommerceDTO.getUserName().equals(null)
				||ecommerceDTO.getUserName().isBlank()
				||ecommerceDTO.getUserName().length()<8
				||ecommerceDTO.getPassWord().isBlank()
				||ecommerceDTO.getPassWord().isEmpty()
				||ecommerceDTO.getPassWord().equals(null)
				||ecommerceDTO.getPassWord().length()<8
				||ecommerceDTO.getShopRegisterNumber()==0){
					throw new InvalidData("invalid data");
					
				}if(ecommerceDTO.getCustomerBase()<50
						||ecommerceDTO.getLocation().isBlank()){
					throw new InvalidData("you can't start bussiness");
					
				}if(ecommerceDTO.getProductDTO().isProductAvailability()==false) {
					throw new InvalidData("stack is not available");
				}if(ecommerceDTO.getProductDTO().getProductID().equals(null)) {
					throw new InvalidData("invalid ID");
				}if(ecommerceDTO.getProductDTO().getProductName().equals(null)) {
					throw new InvalidData("invalid product name");
					
				}if(ecommerceDTO.getPassWord().matches(regexp)) {
					throw new InvalidData("enter the correct password");
				}
				else {
					/*System.out.println("username is:"+ecommerceDTO.getUserName());
					System.out.println("password valid:"+ecommerceDTO.getPassWord());
					System.out.println("your customer base is:"+ecommerceDTO.getCustomerBase());
					System.out.println("location is:"+ecommerceDTO.getLocation());
					*/
					System.out.println("object saved");
				}
			
		}else {
			System.out.println("object is null");
		}
		
		return false;
	}

}
