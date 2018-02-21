package com.niit.java.crudoperations;

import java.util.ArrayList;
import java.util.List;
public class EmployeeList {
	
 public void displayEmployee(List<Employee> empList)
  {for(Employee emp:empList)
     {System.out.println(emp.getId());
      System.out.println(emp.getName());
      System.out.println(emp.getSalary());
     }
   }
 
public List<Employee> createEmployeeList()
 { List<Employee> employeelist=new ArrayList<Employee>();
   Employee emp;
   emp=new Employee(100,"Rupsa",10000);
   employeelist.add(emp);
   emp=new Employee(101,"Dev",15000);
   employeelist.add(emp);
   emp=new Employee(102,"Koffi",20000);
   employeelist.add(emp);
   return employeelist;
  }

public boolean exist(List<Employee> emplist, int id)
{for(Employee emp: emplist)
  {if(emp.getId()==id)
    {return true;}
  }
return false;
}

}
	

