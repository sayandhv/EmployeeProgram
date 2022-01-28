package com.bridgelabz;

public class Employeedetais {
	
	public static void attendanceAndWages()
	
	{
		
		int isfulltime = (int)(Math.floor(Math.random() * 10) % 3);
		if(isfulltime == 0)
		{
			System.out.println("Employee is absent");
			
		}
		else if(isfulltime == 1)
		{
			System.out.println("Employee is Present full day");
			int wageperhour = 20;
			int totalhour = 8;
			int fulltimewage = wageperhour * totalhour;
			System.out.println("Wage of an employee with full day attendance = "  +fulltimewage);

		}
		
		else
		{
			System.out.println("Emplloyee is half day present");
			int wageperhour = 20;
			int partimehours = 8;
			int partimewage = wageperhour * partimehours;
			System.out.println("Wage of an employee with partime job =" +partimewage);
			
		}
		
	}
	
	
	public static void monthlywage ()
	
	{
		int wageperhour=20;
		 int fulldayhr=8;
		 int part_time_hr=8;
		 int employeecheck;
		 int monthlywage;
		 int working_day=20;
		 employeecheck = (int)(Math.random()*10) % 2;
		switch (employeecheck)
				{
		
		case 0: 
		         
			    monthlywage = wageperhour * fulldayhr *20;
			    System.out.println("Monthly wage of employee with fullday attendance is" +monthlywage);
			    break;
			    
		 case 1:
                 monthlywage = wageperhour * part_time_hr * 20;
                 System.out.println("Monthly wage for part time present:" +monthlywage);	
	             	
		
		
		}
		 
	}
	

	
	

	public static void main(String[] args) {
		
	
		
		attendanceAndWages();
	
		monthlywage();
	}

}
