package com.xworkz.ecommerce.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.xworkz.ecommerce.dto.EcommerceDTO;

public interface EcommerceDAO{

	//defining the interfaces
	public abstract boolean saveDTO(EcommerceDTO ecommerceDTO) throws FileNotFoundException, IOException, ClassNotFoundException;
	public abstract boolean dateleDTO(long shopRegisterNumber) throws FileNotFoundException, IOException, ClassNotFoundException;
    //public abstract boolean updateDTO(EcommerceDTO ecommerceDTO);
	public abstract boolean readDTO() throws FileNotFoundException, IOException, ClassNotFoundException;
	public abstract boolean updateDTO(long shopRegisterNumber,EcommerceDTO ecommercedto) throws FileNotFoundException, IOException, ClassNotFoundException;
	public abstract boolean searchDTO(long shopRegisterNumber) throws FileNotFoundException, IOException, ClassNotFoundException;

}
