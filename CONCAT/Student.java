// Öğrencinin adı soyadı ve numarasının klavyeden alındığı ve birleştirerek tüm bilgilerinin ekrana yazıldığı programı yaz.
// private değişkenler kullan. 
public class Student {
	private String name;
	private String surname;
	private int number;
	
	public Student() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
}