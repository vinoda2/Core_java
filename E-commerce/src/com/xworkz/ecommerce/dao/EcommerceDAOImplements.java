package com.xworkz.ecommerce.dao;

import com.xworkz.ecommerce.dto.EcommerceDTO;
import com.xworkz.ecommerce.exception.InvalidData;

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class EcommerceDAOImplements implements EcommerceDAO{
	
	File file=new File("E-Commerce.txt");
	ArrayList<Object> userdata=new ArrayList();
	
	ObjectOutputStream objout = null;
	ObjectInputStream objin = null;
	ListIterator li=null;
	
	//saving object details to the object array
	@Override
	public boolean saveDTO(EcommerceDTO ecommerceDTO) throws FileNotFoundException, IOException, ClassNotFoundException {
	if(ecommerceDTO==null) {
		System.out.println("object is null");
		}else {
			userdata.add(ecommerceDTO);
			objout=new ObjectOutputStream(new FileOutputStream(file));
			objout.writeObject(userdata);
			objout.close();
		}
	
		return false;
	}
		
	
	//deleting object from object Array
	@Override
	public boolean dateleDTO(long shopRegisterNumber) throws FileNotFoundException, IOException, ClassNotFoundException{
		boolean found=false;
		if(file.isFile())
		{
			objin=new ObjectInputStream(new FileInputStream(file));
			userdata=(ArrayList<Object>)objin.readObject();
			li=userdata.listIterator();
			while(li.hasNext()) {
				EcommerceDTO dto=(EcommerceDTO)li.next();
				if(dto.getShopRegisterNumber()==shopRegisterNumber) {
					li.remove();
					found=true;
					}
				}if(found) {
						objout=new ObjectOutputStream(new FileOutputStream(file));
						objout.writeObject(userdata);
						objout.close();
					}else {
						System.out.println("object not found");
					}
			}else {
				System.out.println("file not found");
			}
		return false;
	}
		@Override
		public boolean searchDTO(long shopRegisterNumber) throws FileNotFoundException, IOException, ClassNotFoundException{
			boolean found=false;
			if(file.isFile())
			{
				objin=new ObjectInputStream(new FileInputStream(file));
				userdata=(ArrayList<Object>)objin.readObject();
				li=userdata.listIterator();
				while(li.hasNext()) {
					EcommerceDTO dto=(EcommerceDTO)li.next();
					if(dto.getShopRegisterNumber()==shopRegisterNumber) {
						found=true;
					}
				}
				if(found) {
					System.out.println("object found");
				}else {
					System.out.println("object not found");
				}
				
			}else {
					System.out.println("file not found");
				}
			return false;
		}
	
	//updating object 
	@Override
	public boolean updateDTO(long shopRegisterNumber,EcommerceDTO ecommercedto) throws FileNotFoundException, IOException, ClassNotFoundException {
		boolean found=false;
		
		if(file.isFile())
		{
			objin=new ObjectInputStream(new FileInputStream(file));
			userdata=(ArrayList<Object>)objin.readObject();
			li=userdata.listIterator();
			while(li.hasNext()) {
				EcommerceDTO dto=(EcommerceDTO)li.next();
				if(dto.getShopRegisterNumber()==shopRegisterNumber) {
				  li.set(ecommercedto);
				  found=true;
				}
			
				}
			if(found) {
				System.out.println("object found");
			}else {
				System.out.println("object not found");
			}
			}else {
				System.out.println("file not found");
			}
	
		return false;
	}
	
	//reading objects from object array
	@Override
	public boolean readDTO() throws FileNotFoundException, IOException, ClassNotFoundException{
		if(file.isFile())
		{
			objin=new ObjectInputStream(new FileInputStream(file));
			userdata=(ArrayList<Object>)objin.readObject();
			li=userdata.listIterator();
			while(li.hasNext()) {
				System.out.println(li.next());
			}
			objin.close();
		}
		return false;
	}
}

