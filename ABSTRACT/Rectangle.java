public class Rectangle extends Shape {
	private float longEdge;
	private float shortEdge;
	
	public Rectangle(int shapeNumber, String shapeName, String shapeColor) {
		super(shapeNumber, shapeName, shapeColor);
	}
	
	public float calculateArea(float longEdge, float shortEdge) {
		return longEdge * shortEdge;
	}
	
	public void setLongEdge(float longEdge) {
		this.longEdge = longEdge;
	}
	
	public float getLongEdge() {
		return this.longEdge;
	}
	
	public void setShortEdge(float shortEdge) {
		this.shortEdge = shortEdge;
	}
	
	public float getShortEdge() {
		return this.shortEdge;
	}
}