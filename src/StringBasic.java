
public class StringBasic {

	public static void main(String[] args) {
		String a = "Rehan";
		String b = "Rehan";
		String c = new String("Rehan");
		String d = new String("Rehan");
		
		if(a == b) {
			System.out.println("1");
		}
		
		if(a.equals(b)) {
			System.out.println("2");
		}
		
		if(a == c) {
			System.out.println("3");
		}
		
		if(a.equals(c)) {
			System.out.println("4");
		}
		
		if(c == d) {
			System.out.println("5");
		}
		
		if(d.equals(c)) {
			System.out.println("6");
		}
	}

}
