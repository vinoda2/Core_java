package com.xworkz.universitydto;

import java.io.Serializable;

public class UniversityDTO  implements Serializable{

	private int collegeID;
	private String password;
	private String collegeName;
	private int numberOfBranch;
	private String collegeAddress;
	
	
	public UniversityDTO(int collegeID, String password, String collegeName, int numberOfBranch,
			String collegeAddress) {
		this.collegeID = collegeID;
		this.password = password;
		this.collegeName = collegeName;
		this.numberOfBranch = numberOfBranch;
		this.collegeAddress = collegeAddress;
	}
	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getNumberOfBranch() {
		return numberOfBranch;
	}

	public void setNumberOfBranch(int numberOfBranch) {
		this.numberOfBranch = numberOfBranch;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collegeAddress == null) ? 0 : collegeAddress.hashCode());
		result = prime * result + collegeID;
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		result = prime * result + numberOfBranch;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniversityDTO other = (UniversityDTO) obj;
		if (collegeAddress == null) {
			if (other.collegeAddress != null)
				return false;
		} else if (!collegeAddress.equals(other.collegeAddress))
			return false;
		if (collegeID != other.collegeID)
			return false;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (numberOfBranch != other.numberOfBranch)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UniversityDTO [collegeID=" + collegeID + ", password=" + password + ", collegeName=" + collegeName
				+ ", numberOfBranch=" + numberOfBranch + ", collegeAddress=" + collegeAddress + "]";
	}
	

}
