package cerner.demographic;

import java.time.Month;

public class DateOfBirth {
	int date;
	Month month;
	int year;
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public DateOfBirth(int date, Month month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.date+" "+this.month+" "+this.year;
//	}

}
