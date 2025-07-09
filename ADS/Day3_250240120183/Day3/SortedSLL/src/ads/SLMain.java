package ads;

public class SLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SList sl = new SSList();
		sl.insert(20);
		sl.insert(5);
		sl.print();
		
		sl.insert(10);
		sl.print();
		
		sl.insert(2);
		sl.print();
		sl.insert(30);
		sl.print();
		
		sl.delete(2);
		sl.insert(5);
		sl.print();
		System.out.println(sl.search(20));
		System.out.println(sl.search(50));
		sl.deleteAll(5);
		sl.print();
		
		
		
	}

}

/*5 20 
5 10 20 
2 5 10 20 
2 5 10 20 30 
5 5 10 20 30 
10 20 30 */