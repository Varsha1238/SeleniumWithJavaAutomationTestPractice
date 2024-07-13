package streamsDemo;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}


public class FilterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 List <Product>productsList = new ArrayList<Product>();
	 productsList.add(new Product(100,"HP Laptop",25000));
	 productsList.add(new Product(200,"Dell",29000));
	 productsList.add(new Product(300,"Lenova",40000));
	 productsList.add(new Product(400,"Apple",90000));
	 productsList.stream().filter(p->p.price>25000).forEach(p->System.out.println(p.name));
	 
	}

}
