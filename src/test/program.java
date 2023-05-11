package test;

public class program {

	public static void main(String[] args) {
	
	System.out.println("hello");
			// ++,--
			//++ x=1, x++,
			//++x ----- x++
			
			int a=10;
			System.out.println(a);
			System.out.println("#######");
			int b= ++a;// a=11, b=11
			System.out.println(a);
			System.out.println(b);
			System.out.println("#######");
			int c= a++;// a=12, c=11
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
	}

}
