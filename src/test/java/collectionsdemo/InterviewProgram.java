package collectionsdemo;

import java.util.ArrayList;

public class test2 {
	public void printDay(int a,String day)
	{
		if(a>=6)
		{
		
			a=a%7;
		}
		ArrayList<String> al =new ArrayList<String>();
		al.add("mon");
		al.add("tue");
		al.add("wed");
		al.add("thur");
		al.add("fri");
		al.add("sat");
		al.add("sun");
		System.out.println(al);	
		System.out.println(al.indexOf(day)+a);
		System.out.println(al.get((al.indexOf(day)+a)));	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 t =new test2();
		t.printDay(9, "tue");
		
	}

}
