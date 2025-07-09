package com.cdac.acts.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
// Class A
// Class B extends A
// Class C extends B
public class Test {

	public static void main(String[] args) {
		List<? extends C> upperwild = new ArrayList<>();
		// Cant Write with ? Extends wildcard
		
//		You cannot use upperWild.add(new B()) when upperWild is declared as List<? extends A>. Here's why:
//
//		When using an upper-bounded wildcard (? extends A), the compiler doesn't allow additions to the list
//		because it cannot guarantee what specific type the list can safely accept. Even though B is a subclass of A,
//		the type parameter for ? extends A makes the list read-only (for adding elements), except for null. 
//		This restriction ensures type safety in generics.
		
//		upperwild.add(new A);
//		upperwild.add(new B);
//		upperwild.add(new C);
		
		List<? super A> lowerwild = new ArrayList<>();
		lowerwild.add( new C());
		lowerwild.add(new B());
		lowerwild.add(new A());
		//lowerwild.add(new Object());
		
	}

}
