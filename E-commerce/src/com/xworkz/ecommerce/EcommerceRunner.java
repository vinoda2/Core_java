package com.xworkz.ecommerce;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import com.xworkz.ecommerce.dao.EcommerceDAO;
import com.xworkz.ecommerce.dao.EcommerceDAOImplements;
import com.xworkz.ecommerce.dto.EcommerceDTO;
import com.xworkz.ecommerce.dto.ProductDTO;
import com.xworkz.ecommerce.service.EcommerceService;
import com.xworkz.ecommerce.service.EcommerceServiceImp;

public class EcommerceRunner  implements Serializable{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ProductDTO productDTO = new ProductDTO("ass ", "lm ", true);
		EcommerceDTO ecommerceDTO = new EcommerceDTO("avanthika","avanthika@", 452321, "Bangalore", 50, productDTO);
		EcommerceDAO dao = new EcommerceDAOImplements();
		
		EcommerceService service = new EcommerceServiceImp(dao);
		service.validateData(ecommerceDTO);
		dao.saveDTO(ecommerceDTO);
		
		
		ProductDTO productDTO1 = new ProductDTO(" sd", " ", true);
		EcommerceDTO ecommerceDTO1 = new EcommerceDTO("sankasta", "sankasta@1", 54685,"mysore", 100, productDTO1);
		service.validateData(ecommerceDTO1);
		dao.saveDTO(ecommerceDTO1);
		
		ProductDTO productDTO2 = new ProductDTO(" sd", " ", true);
		EcommerceDTO ecommerceDTO2 = new EcommerceDTO("sankasta", "sankasta@1", 546834,"mysore", 50, productDTO2);
		service.validateData(ecommerceDTO2);
		dao.saveDTO(ecommerceDTO2);
		
		ProductDTO productDTO3 = new ProductDTO(" sd", " ", true);
		EcommerceDTO ecommerceDTO3 = new EcommerceDTO("sankasta", "sankasta@1", 54688,"mysore", 70, productDTO3);
		service.validateData(ecommerceDTO3);
		dao.saveDTO(ecommerceDTO3);
		
		ProductDTO productDTO4 = new ProductDTO(" sd", " ", true);
		EcommerceDTO ecommerceDTO4 = new EcommerceDTO("sankasta", "sankasta@1", 54684,"mysore", 60, productDTO4);
		service.validateData(ecommerceDTO4);
		dao.saveDTO(ecommerceDTO4);
		
		//searching 
		dao.searchDTO(54684);
		//reading
		dao.readDTO();
		System.out.println("========");
		
		//deleting
		dao.dateleDTO(54684);
		System.out.println("========");
		
		//reading
		dao.readDTO();
		System.out.println("========");
		
		//updating
		dao.updateDTO(54688, ecommerceDTO4);
		System.out.println("========");
		
		//reading
		dao.readDTO();
		
	}
}
