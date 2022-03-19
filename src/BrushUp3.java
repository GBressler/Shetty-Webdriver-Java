
public class BrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Greg Bressler";
		String s1 = "Greg";
		
		String[] n = s.split(" ");
		System.out.println(n[0]);
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		
		MethodDemo d = new MethodDemo();
		d.getData();
		
	}

}
