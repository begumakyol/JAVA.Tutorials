import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ogrenci ismi girin: ");
		student.setName(scan.nextLine());
		
		System.out.println("Ogrenci soyismi girin: ");
		student.setSurname(scan.nextLine());
		
		System.out.println("Ogrenci numarasi girin: ");
		int number = Integer.parseInt(scan.nextLine());
		student.setNumber(number);
		
		String a = "";
		a = a.concat(student.getName()); //a+name;
		a = a.concat(" " + student.getSurname()); // a+name+surname		
		a = a.concat(" " + student.getNumber()); // a+name+surname+number
		
		System.out.println(a);
	}
}