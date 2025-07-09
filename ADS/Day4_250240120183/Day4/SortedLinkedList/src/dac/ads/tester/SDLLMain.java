package dac.ads.tester;
import dac.ads.*;
public class SDLLMain {

	public static void main(String[] args) {
		
		List sdl = new SortedDLL();
		
		sdl.insert(15);
		sdl.insert(7);
		sdl.insert(2);
		
		sdl.insert(2);

		sdl.deleteAll(2);
		sdl.printForward();
		
	}

}
