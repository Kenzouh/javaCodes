package finalsActivity2;

interface Shape{
	void getArea();
}

class Rectangle implements Shape{
	
	@Override
	public void getArea() {
		
		System.out.println("Area Formula for rectangle: Length * Width\n");
		
		int length = 6;
		int width = 14;
		int area = length * width;
		
		System.out.println("Pre-defined: Length = 6 | Width = 14\n\n");
		
		System.out.println("Rectangle: " + length + " * " + width + " = " + area);
		
	}
}

class Circle implements Shape{
	
	@Override
	public void getArea() {
		
		System.out.println("Area Formula for circle: pi * r^2");
		
		double pi = 3.14;
		int radius = 5;
		double area = radius * radius * pi; // radius * radius first because pi will multiply with non-squared radius if pi * r^2
		
		System.out.println("\nPre-defined: Radius = 5");
		
		System.out.println("\nCircle: " + pi + " * " + radius + " * " + radius + " = " + area);
	}
}

class Triangle implements Shape{
	
	@Override
	public void getArea(){
		
		System.out.println("Area Formula for triangle: (height * base) / 2");
		
		float height = 7;
		float base = 13;
		float area = height * base / 2;
		
		System.out.println("\nPre-defined: Height = 7 | Base = 13");
		
		System.out.println("\nTriangle: " + height + " * " + base + " / 2 = " + area);
	}
}

public class ShapeAreaInterface {

	public static void main(String[] args) {
		
		System.out.println("Java Interface Program made by Kenzo C. Ragundiaz\n");
		
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		System.out.println("============= rectangle.getArea() =============\n");
	
		rectangle.getArea();
		
		System.out.println("\n==============================================\n");
		
		System.out.println("\n\n============= circle.getArea() =============\n");
		
		circle.getArea();
		
		System.out.println("\n==============================================\n");
		
		System.out.println("\n\n============= triangle.getArea() =============\n");
		
		triangle.getArea();
		
		System.out.println("\n==============================================\n");

	}
}