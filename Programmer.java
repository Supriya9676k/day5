public class Programmer extends Employee3{
	
	public String name;
	public String address;
	public int salary;
	public String job_title;
	
	public int bonus(){
return  salary+salary*10/100;
	}
	public String perfomanceReport(){
		return "Good";
	}
	
	public String managingReports(){
		return "Good";
	}
	
	}
