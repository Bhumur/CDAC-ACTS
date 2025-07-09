package dac.ads.tester;
import dac.ads.*;
public class SDLLMain {

	public static void main(String[] args) {
		
		List sdl = new DLL();
		sdl.addAtFront(20);
		sdl.addAtFront(30);
		sdl.printForward();
		
		sdl.addAtLast(80);
		sdl.addAtLast(5);
		sdl.printForward();
		
		sdl.printBackward();
		
		sdl.deleteFromFirst();
		sdl.printForward();
		sdl.deleteFromFirst();
		sdl.deleteFromFirst();
		sdl.printForward();
		sdl.deleteFromFirst();
		sdl.printForward();
		sdl.deleteFromFirst();
		sdl.printForward();

		sdl.addAtFront(20);
		sdl.addAtFront(30);
		sdl.addAtLast(80);
		sdl.addAtLast(5);
		
		sdl.printForward();
		sdl.deleteFromLast();
		sdl.printForward();
		
	}

}
