package com.xworkz.universityservice;

import com.xworkz.university.exception.InvalidData;
import com.xworkz.universitydto.UniversityDTO;

public interface UniversityService {

	public abstract boolean validateData(UniversityDTO universitydto) throws InvalidData;
	
}
