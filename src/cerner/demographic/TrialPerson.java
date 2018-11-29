package cerner.demographic;

import java.time.Month;

public class TrialPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person(new Name("ramesh","m","nasd",Suffix.NULL,Prefix.NULL),13,Gender.MALE,new Address("india","ka","gandi nagar","232","65401"),new DateOfBirth(12, Month.APRIL, 19944));
	//System.out.println(p1.getDateOfBirth());
	DateOfBirth db=new DateOfBirth(12, Month.APRIL, 19944);
	System.out.println(db.toString());
	}

}
