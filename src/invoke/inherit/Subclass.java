package invoke.inherit;

public class Subclass extends Superclass {
	String childName;
	   Subclass(int age,String name) {	   
	      super(age,name);
	      this.childName=name;
	      System.out.println("Super Age "+super.age);
	     
	   }
	   public void showNameFromChild() {
		   System.out.println("Child Name "+this.childName);
		   super.showName();
	   }
	   public static void main(String argd[]) {
	      Subclass s = new Subclass(24,"Thura Soe");
	      
	      s.getAge();
	      s.showNameFromChild();
	   }
	}

