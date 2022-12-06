//Shape isminde soyut bir class olacak. 
//shapeNumber shapeName shapeColor adlı üç değişkeni olacak. 
//değişkenler private olacak.
//soyut calculateArea isimli alan hesaplayan bir metodu olacak. 
//Rectangle isimli alt bir sınıf olacak. 
//Rectangle dan bir nesne oluşturup alan hesabı yapılacak, özellikleri atayıp ekrana yazdır.

public abstract class Shape {
	private int shapeNumber;
	private String shapeName;
	private String shapeColor;
	
	public Shape(int shapeNumber, String shapeName, String shapeColor){
		this.shapeNumber = shapeNumber;
		this.shapeName = shapeName;
		this.shapeColor = shapeColor;
	}
	
	public abstract float calculateArea(float longEdge, float shortEdge);
	
	public void setShapeNumber(int shapeNumber) {
		this.shapeNumber = shapeNumber;
	}
	
	public int getShapeNumber() {
		return this.shapeNumber;
	}
	
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public String getShapeName() {
		return this.shapeName;
	}
	
	public void setShapeColor(String shapeColor) {
		this.shapeColor = shapeColor;
	}
	
	public String getShapeColor() {
		return this.shapeColor;
	}
}