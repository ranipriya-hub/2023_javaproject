package day07;

public class programo2 { 
	int a;
	int b;
	public programo2(int a1, int b1) {
		a=a1;
		b=b1;
		 
		
	}

	public static void main(String[] args) {
		programo2 pro= new programo2(10,20);
		pro.add();
		
}
	public void add() {
		System.out.println(this.a+this.b);
	}

}
