class Calculator{

	public int add(int a,int b){
         return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int div(int a,int b){
		return a/b;
	}

}

public class Main{
	public static void main(String[] args) {

		Calculator c1=new Calculator();
		System.out.println("addition of 2 numbers "+c1.add(3,2));
		System.out.println("substraction of 2 numbers "+c1.sub(4,2));
		System.out.println("multiplication of 2 numbers "+c1.mul(4,2));
		System.out.println("division of 2 numbers "+c1.div(4,2));
	}
}