package ads;

public class Main {
	
	public static void main(String[] args) {
		StackusingTwoQueue s= new StackusingTwoQueue(10);
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		
		s.pop();
		s.display();
	}
}
