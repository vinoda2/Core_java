package com.xworkz.ecommerce.dao;

import com.xworkz.ecommerce.dto.EcommerceDTO;

public interface EcommerceDAO {

	//defining the interfaces
	public abstract boolean saveDTO(EcommerceDTO ecommerceDTO);
	public abstract boolean dateleDTO(EcommerceDTO ecommerceDTO);
	//public abstract boolean updateDTO(EcommerceDTO ecommerceDTO);
	public abstract boolean readDTO();
	boolean updateDTO(EcommerceDTO ecommerceDTO, EcommerceDTO ecommerceDTO1);
}
