package day11;

public class armastrng {

	public static void main(String[] args) {
		int x=1634;
		String y = String.valueOf(x);
		//"1634"  ---> length of string is 4
		int index=0;
		double result=0;
		while(index<y.length())
		{
			int tempValue = Integer.parseInt(y.charAt(index)+"");
			result=Math.pow(tempValue, y.length())+result;
			index=index+1;
		}
		System.out.println(result);
		if(x==result)
		{
			System.out.println("ArmStrong number");
		}
		else
		{
			System.out.println("Not a ArmStrong number");
		}
		
	}

}
		


