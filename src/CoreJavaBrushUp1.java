import java.util.ArrayList;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int	myNumber = 5;
			String site = "Rhaul Shetty Acad";
			//char = 'x';
			double dec = 5.99;
			//Float deci = 6.99;
			boolean verdad = true;
			
			System.out.println(myNumber + " is the number in the Mynumber var");
			
			
			//Arrays
			//int[] arr = new int[5];
			int[] arr = {1,2,3,4,5};
			
			
			
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			//Enhanced For Loop
			String[] name = {"Gayita", "Rocio", "Levano", "Rojas"};
			for(String s: name) {
				System.out.println(s);
			}
			
			//divisible by 2
			for(int i = 0; i<arr.length; i++) {
				
				if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;
				}
				else
				{
					System.out.println(arr[i] + " is not a multiple of 2");
				}
			}
			
			//ArrayList dynamically grows the size of the array
			
			ArrayList a = new ArrayList<String>();
			a.add("Miranda");
			a.add("Lane");
			a.add("Bressler");
			a.add("Levano");
			a.add("I");
			
			System.out.println(a.get(0));
			a.remove(4);
			System.out.println(a);
	}

}
