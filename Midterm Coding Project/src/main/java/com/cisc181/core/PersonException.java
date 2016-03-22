package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class PersonException extends Exception{
	private Person person;
	private Date DOB;
	private String phone_number;
	
	public PersonException(Person person){
		this.person = person;
	}

	public PersonException(PersonException PersonException) {
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) throws PersonException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 100);
		if(calendar.getTime().before(DOB)){
			throw new PersonException(this);
		}
		this.DOB = dOB;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) throws PersonException {
		Pattern pattern = Pattern.compile("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");
		if(!pattern.matcher(phone_number).matches()){
			throw new PersonException(this);
		}
		this.phone_number = phone_number;
	}

	public Person getPerson() {
		return person;
	}
	
	
}
