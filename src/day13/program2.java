package day13;

public class program2 {

		public static void main(String[] args) {
			/*
			 1
			 12
			 123
			 1234
			 12345
			 */
			for(int x=1;x<=10;x++)//x=1,x=2
			{
			for(int a=1;a<=x;a++)
			{
				System.out.print(a);
			}
			System.out.println();
			}
		
	/*
	 12345
	 1234
	 123
	 12
	 1
	 */
	for(int x=5;x>=1;x--)
	{
	for(int a=1;a<=x;a++)
	{
		System.out.print(a);
	}
	System.out.println();
	}
	
}

}