package overriding.supertest.best;

public class Dog extends Animal {

	public void move() {
	      super.move();   // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
}
