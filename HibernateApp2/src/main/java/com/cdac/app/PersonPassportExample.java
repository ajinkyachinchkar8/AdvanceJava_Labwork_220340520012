package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;


public class PersonPassportExample {

public static void main(String[] args) {
	PersonPassportDao dao = new PersonPassportDao();
		/*
	Person p = new Person();
	p.setName("Akash");
	p.setEmail("Akash@gmail.com");
	p.setDateofBirth(LocalDate.of(1997, 9, 1));
	
	Passport ps = new Passport();
	ps.setIssueDate(LocalDate.of(2017, 1, 05));
	ps.setExpiryDate(LocalDate.of(2027, 1, 05));
	ps.setIssuedBy("Govt. of India");
	
	p.setPassport(ps);
	ps.setPerson(p);
	
	dao.add(p);
	*/
	
	/*
	Person p = dao.fetchPersonByPassportNo(3);
	System.out.println(p.getId() +" "+p.getName() +" "+p.getDateofBirth() +" "+p.getEmail());
	*/
	
	
	
	List<Person> list  = dao.fetchPersonDetailsByExpiryYear(2029);
	for ( Person p : list) {
		System.out.println(p.getId() +" "+p.getName() +" "+p.getDateofBirth() +" "+p.getEmail());
	} 
	

	
	}
	

}
