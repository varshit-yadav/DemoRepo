class Calculator{

	public int add(int a,int b){
         return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}

}

public class Main{
	public static void main(String[] args) {

		Calculator c1=new Calculator();
		System.out.println(c1.add(3,2));
		System.out.println(c1.sub(4,2));
	}
}