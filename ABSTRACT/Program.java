public class Program{
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle(1,"Rectangle","Blue");
		rectangle.setLongEdge(10.2f);
		rectangle.setShortEdge(5.8f);
		float area = rectangle.calculateArea(rectangle.getLongEdge(),rectangle.getShortEdge());
		
		System.out.println("Number is: " + rectangle.getShapeNumber());
		System.out.println("Name is: " + rectangle.getShapeName());
		System.out.println("Color is: " + rectangle.getShapeColor());
		System.out.println("Area is: " + area);
	}
}