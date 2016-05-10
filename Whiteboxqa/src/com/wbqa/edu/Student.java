package com.wbqa.edu;

public class Student {
	
	 String sname= "anitha";
	int sid= 1;
	double coursename;
	double emailid;

	


public  String getstudentdata(String sname)
{
	return sname;
}

 static public void main(String args[]){
	
	
	Student s= new Student();
	
	System.out.println("sname"+ s.sname);
	
}
}