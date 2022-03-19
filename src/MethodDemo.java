
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo md = new MethodDemo();
		md.getData();
		System.out.println(" after md");
		
		getData2();
	}
	
	//Public methods can be used in any class
	//void means that it doesn't return anything, I could make it int and then it could return a number
	public void getData() {
		System.out.println("hello world");
	}
	//by using static, the method is now a class level method and you can call it without an object
	public static void getData2() {
		System.out.println("Electric Boogaloo");
	}
}
