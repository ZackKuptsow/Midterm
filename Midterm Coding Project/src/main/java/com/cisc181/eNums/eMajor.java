package com.cisc181.eNums;

public enum eMajor {
	BUSINESS("Business"), COMPSI("Computer Science"), CHEM("Chemistry"), PHYSICS("Physics"), NURSING("Nursing");
	
	private  String eMajor;
	
	private eMajor(String major){
		this.eMajor = major;
	}

	public String geteMajor() {
		return eMajor;
	}

	public void seteMajor(String major) {
		eMajor = major;
	}
	
	
}
