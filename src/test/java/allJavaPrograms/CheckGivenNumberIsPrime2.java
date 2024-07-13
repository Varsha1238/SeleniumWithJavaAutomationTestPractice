package allJavaPrograms;


public class CheckGivenNumberIsPrime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int num=2;num<=100;num++)
		{
			int count =0 ;
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
				{
					count++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.println(num);
			}
			
		}
		
	}

}
