package com.spring.review.vo;

public class BirthVO {
	private String bYear;
	private String bMonth;
	private String bDate;
	

	


	public String getbYear() {
		return bYear;
	}





	public void setbYear(String bYear) {
		this.bYear = bYear;
	}





	public String getbMonth() {
		return bMonth;
	}





	public void setbMonth(String bMonth) {
		
		if (Integer.parseInt(bMonth) < 10) {
			this.bMonth = 0 + bMonth;
			return;
		}
		
		this.bMonth = bMonth;
	}





	public String getbDate() {
		return bDate;
	}





	public void setbDate(String bDate) {
		
		if (Integer.parseInt(bDate) < 10) {
			this.bDate = 0 + bDate;
			return;
		}
		
		
		this.bDate = bDate;
	}





	@Override
	public String toString() {
		return "BirthVO [bYear=" + bYear + ", bMonth=" + bMonth + ", bDate=" + bDate + "]";
	}






	
}
