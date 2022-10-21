package com.xworkz.universityservice;

import com.xworkz.university.exception.InvalidData;
import com.xworkz.universitydto.UniversityDTO;

public class UniversityServiceImp implements UniversityService{

	@Override
	public boolean validateData(UniversityDTO universitydto) throws InvalidData {
		if(universitydto!=null) {
			if(universitydto.getCollegeID()==0) {
				throw new InvalidData("invalid collegeId");
			}
			if(universitydto.getCollegeName().isBlank()||universitydto.getCollegeName().length()>8||universitydto.getCollegeName()==null) {
				throw new InvalidData("Invalid College Name");
			}
		}
		return false;
	}


}
