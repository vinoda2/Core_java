package com.xworkz.universitydto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class UniversityDTO  implements Serializable{

	private int collegeID;
	private String password;
	private String collegeName;
	private int numberOfBranch;
	private String collegeAddress;

}
