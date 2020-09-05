package ploymorphism.shap.best;

public class TestPloymorphism {

	public static void main(String args[]){  
		Shape s=new Shape();  
		s=new Rectangle();  
		s.draw();  
		s=new Circle();  
		s.draw();  
		s=new Triangle();  
		s.draw();  
		
		}  
}
