package invoke.inherit;

public class Superclass {

	int age;
	String name;
	Superclass(int age,String name){
		this.age=age+20;
		this.name=name+" for Parent Name";
	}
	 public int getAge() {
	      System.out.println("The value of the variable named age in super class is: " +age);
	      return age;
	 }
	 public void showName() {
		 System.out.println("Parent Name is "+name);
	 }
}
