package ads;

public class Main {

	public static void main(String[] args) {

		ResizeableArrayStack rs= new ResizeableArrayStack();
		
		try {
			rs.push("a");
		} catch (StackFullException e) {
			e.printStackTrace();
		}
		
		try {
			rs.push("b");
		} catch (StackFullException e) {
			e.printStackTrace();
		}
		
		try {
			rs.push("c");
		} catch (StackFullException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(rs.pop());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(rs.pop());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
		
		
	}

}
