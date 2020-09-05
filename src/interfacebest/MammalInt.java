package interfacebest;

public class MammalInt implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eats");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travels");
	}
	public int noOfLegs() {
	      return 0;
	   }
	 public static void main(String args[]) {
		
		 Animal an=new MammalInt();
	     System.out.println(an instanceof MammalInt);
	     System.out.println(an instanceof ParentAnimal);
		 MammalInt m = new MammalInt();
	      m.eat();
	      m.travel();
	      m.sleep();
	   }

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("I am sleeping");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Barking");
	}
}
