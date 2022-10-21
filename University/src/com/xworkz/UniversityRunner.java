package com.xworkz;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.xworkz.university.exception.InvalidData;
import com.xworkz.universitydao.UniversityDAO;
import com.xworkz.universitydao.UniversityDAOImp;
import com.xworkz.universitydto.UniversityDTO;
import com.xworkz.universityservice.UniversityService;
import com.xworkz.universityservice.UniversityServiceImp;

public class UniversityRunner {
	public static void main(String[] args) throws FileNotFoundException, IOException, InvalidData, ClassNotFoundException {
		UniversityDTO dto = new UniversityDTO(1, "DTO", "DTO@1", 15, "Mysore");
		UniversityDAO dao = new UniversityDAOImp();
		UniversityService service = new UniversityServiceImp();
		service.validateData(dto);
		dao.saveDTO(dto);

		UniversityDTO dto1 = new UniversityDTO(2, "DTO", "DTO@1", 11, "Bangalore");
		service.validateData(dto1);
		dao.saveDTO(dto1);
		
		UniversityDTO dto2 = new UniversityDTO(3, "DTO", "DTO@1", 10, "Hyderbad");
		service.validateData(dto1);
		dao.saveDTO(dto2);
		dao.readDTO();
		
		dao.searchDTO(3);
		dao.deleteDTO(3);
		dao.readDTO();
		dao.updateDTO(1, dto1);
		dao.readDTO();
	
	}
}
