package com.xworkz.universitydao;
import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;


import com.xworkz.university.exception.InvalidData;
import com.xworkz.universitydto.UniversityDTO;


public class UniversityDAOImp implements UniversityDAO {
	ListIterator li=null;
	LinkedList<Object> universityData=new LinkedList();
	@Override
	public boolean saveDTO(UniversityDTO udto) throws FileNotFoundException, IOException, InvalidData {
		if(udto==null) {
			throw new InvalidData("object is null");
		}
		//try with resource, here Autocloseable is implemented so that no need of closing the file
		try(FileOutputStream file=new FileOutputStream("CollegeData.txt")){
			universityData.add(udto);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(universityData);
		}
		return false;
	}

	@Override
	public boolean readDTO() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileInputStream file=new FileInputStream("CollegeData.txt")){
			ObjectInputStream in = new ObjectInputStream(file);
			universityData=(LinkedList<Object>)in.readObject();
			li=universityData.listIterator();
			while(li.hasNext()) {
				System.out.println(li.next());
			}
		}
		return false;
	}

	@Override
	public boolean updateDTO(int collegeID, UniversityDTO udto) throws IOException, ClassNotFoundException {
		boolean found=false;
		try(FileInputStream file=new FileInputStream("CollegeData.txt")){
			ObjectInputStream in = new ObjectInputStream(file);
			universityData=(LinkedList<Object>)in.readObject();
			li=universityData.listIterator();
			while(li.hasNext()) {
				UniversityDTO dto=(UniversityDTO)li.next();
				if(dto.getCollegeID()==collegeID) {
					li.set(udto);
					found=true;
					}
				}
			}if(found) {
				try(FileOutputStream file=new FileOutputStream("CollegeData.txt")){
					ObjectOutputStream out = new ObjectOutputStream(file);
					out.writeObject(universityData);
					System.out.println("object updated");
				}
			}else {
				System.out.println("object not found");
			}
			
		return false;
	}

	@Override
	public boolean searchDTO(int collegeID) throws FileNotFoundException, IOException, ClassNotFoundException {
		boolean found=false;
		try(FileInputStream file=new FileInputStream("CollegeData.txt")){
			ObjectInputStream in = new ObjectInputStream(file);
			universityData=(LinkedList<Object>)in.readObject();
			li=universityData.listIterator();
			while(li.hasNext()) {
				UniversityDTO dto=(UniversityDTO)li.next();
				if(dto.getCollegeID()==collegeID) {
					found=true;
					}
				}
			}
			if(found) {
				System.out.println("object found");
			}else {
				System.out.println("object not found");
			}
				
		return false;
	}

	@Override
	public boolean deleteDTO(int collegeID) throws IOException, ClassNotFoundException {
		boolean found=false;
		try(FileInputStream file=new FileInputStream("CollegeData.txt")){
			ObjectInputStream in = new ObjectInputStream(file);
			universityData=(LinkedList<Object>)in.readObject();
			li=universityData.listIterator();
			while(li.hasNext()) {
				UniversityDTO dto=(UniversityDTO)li.next();
				if(dto.getCollegeID()==collegeID) {
					li.remove();
					found=true;
					}
				}
			}if(found) {
					try(FileOutputStream file=new FileOutputStream("CollegeData.txt")){
						ObjectOutputStream out = new ObjectOutputStream(file);
						out.writeObject(universityData);
						System.out.println("object deleted");
					}
			}else {
				System.out.println("object not found");
			}
				
		return false;
	}
}


