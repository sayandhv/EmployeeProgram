package com.bridgelabz;

import java.util.Random;

public class Employee {
	
	
	


public static void main(String[] args) 
{
  
    System.out.println("Welcome to employee wage computation program on master branch");
  int wage_per_hr=20;
  int full_day_hr=8;
    int part_time_hr=8;

  attendence();
    
    dailywage(wage_per_hr, full_day_hr);
   
       part_tme_wage(wage_per_hr,part_time_hr);
       monthlywage();
       

}
static int attendence()
{
int emp_check=(int)(Math.random()*10) %2;
if(emp_check==1)
{
  System.out.println("Employee is present");
  
}

else
{
  System.out.println("employee is absent");
  
  
}
return 1;
}



public static int dailywage(int wageperhr, int total_hrs )
{
  int daily_emp_wage=(wageperhr * total_hrs);
      System.out.println("wage of employee with fullday attendance=" +daily_emp_wage);
        return 1;

}

public static int part_tme_wage(int wage_per_hr,int part_time_hr )
{
   int part_time_wage=(wage_per_hr*part_time_hr);
    System.out.println("part time wage=" +part_time_wage);
    return 1;

}
public static int monthlywage() 
{
 //System.out.println("This case is for switch statement");

int wage_per_hour=20;
 int full_day_hr=8;
 int part_time_hr=8;
 int empwage;
 int monthlywage;
 int working_day=20;
 int empcheck=(int)(Math.random() *10) %2;
switch (empcheck)
{
          case 0:
                 empwage=( wage_per_hour* full_day_hr);
                 monthlywage=(empwage * working_day);
                 System.out.println("monthly wage of fullday workers is" +monthlywage);
                 break;
                  
          
          case 1:empwage=(wage_per_hour*part_time_hr);
                 monthlywage=(empwage * working_day );
                 System.out.println("Monthly wage for part time workkers is:" +monthlywage);
                 break;
}
return 1;


}
}