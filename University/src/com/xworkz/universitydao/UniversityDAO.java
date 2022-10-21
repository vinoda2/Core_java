package com.xworkz.universitydao;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.xworkz.university.exception.InvalidData;
import com.xworkz.universitydto.UniversityDTO;

public interface UniversityDAO {
	public abstract boolean saveDTO(UniversityDTO udto) throws FileNotFoundException, IOException, InvalidData;
	public abstract boolean readDTO() throws FileNotFoundException, IOException, ClassNotFoundException;
	public abstract boolean updateDTO(int collegeID,UniversityDTO udto) throws IOException, ClassNotFoundException;
	public abstract boolean searchDTO(int collegeID) throws FileNotFoundException, IOException, ClassNotFoundException;
	public abstract boolean deleteDTO(int collegeID) throws IOException, ClassNotFoundException;
}
