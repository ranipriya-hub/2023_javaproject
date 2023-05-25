package practice;

public class Whitespacestring {

	public static void main(String[] args) {
		String str= "java program  selenium";
		str= str.replaceAll("\\s","");
		System.out.println("after removing whitespace:"+str);

	}

}
