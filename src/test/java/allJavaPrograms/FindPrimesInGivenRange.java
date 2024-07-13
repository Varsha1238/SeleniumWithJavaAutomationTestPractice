package allJavaPrograms;

public class FindPrimesInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		for(int num=2;num<=100;num++)
		{
			count=0;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
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
