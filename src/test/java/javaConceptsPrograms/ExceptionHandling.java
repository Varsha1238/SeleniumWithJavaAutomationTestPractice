package javaConceptsPrograms;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {

			String str = null;
			System.out.println(str.length());
		} catch (Exception e) {

			System.out.println(e);

		} finally {
			System.out.println("finally block is always executed");
		}
		try {

			int a = 100 / 0;
					
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}
		 finally {
			System.out.println("finally block is always executed");
		}

		try {
			int arr[] = new int[5];
		
			System.out.println(arr[5]);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		} finally {
			System.exit(0); //if we do not want to execute finally block
			System.out.println("finally block is always executed");
		}

	}

}
