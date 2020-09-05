package overriding.best;

public class Dog extends Animal{
	public void move() {
		System.out.println("After ");
			super.move();
	      System.out.println("Dogs can walk and run");
	   }
}


