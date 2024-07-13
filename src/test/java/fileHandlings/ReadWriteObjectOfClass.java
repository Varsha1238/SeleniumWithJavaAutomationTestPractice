package fileHandlings;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReadWriteObjectOfClass implements Serializable {

	int empID;
	String empName;
	float empSal;
	
	
	public ReadWriteObjectOfClass(int empID,String empName,float empSal) 
	{
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
	public String toString()
	{
		return empName +" "+ empID +" "+ empSal;
		
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	
	{
		
		Set hs = new LinkedHashSet();
		FileOutputStream  fos = new FileOutputStream (new File("C:\\Softwares\\EmployeeDetails.txt"));
		hs.add(new ReadWriteObjectOfClass(500,"Daya",30000));
		hs.add(new ReadWriteObjectOfClass(600,"Tito",60000));
		hs.add(new ReadWriteObjectOfClass(700,"Michal",80000));

		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(hs);  //Write to file 
		
		FileInputStream  fis = new FileInputStream("C:\\Softwares\\EmployeeDetails.txt");
		ObjectInputStream ois  =new ObjectInputStream(fis);	
		System.out.println(ois.readObject()); //Read from file
		
	}

}
