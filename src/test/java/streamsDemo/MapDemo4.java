package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Employee
{
	
	int empId;
	String empname;
	int salary;
	Employee(int empId,String empname,int salary)
	{
	  	this.empId=empId;
	  	this.empname=empname;
	  	this.salary=salary;
	}
}
public class MapDemo4 {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(100,"John",10000));
		emp.add(new Employee(200,"Daya",20000));
		emp.add(new Employee(400,"Michal",50000));
		emp.add(new Employee(500,"Alex",50000));
		
		List<Integer> result = emp.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
		System.out.println(result);
	}

}
