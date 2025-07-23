package lab;

//ConstrucDemo1
public class Car {
	String model;
	String brand;
	int year;
	int price;
	

	Car(String model1, String brand1, int year1, int price1) {
		//check it once
		model=model1;
		brand=brand1;
		year=year1;
		price=price1;
		System.out.println("Brand : "+brand+"\nmodel : "+model+"\nYear : "+year+"\nprice : "+price);
		System.out.println("-------------****------------------");

	}

	public static void main(String[] args) {
		
		
		Car c1 = new Car("realme C65","realme",2023,1200);
		Car c2 = new Car("vivo 20","vivo",2020,1500);
		Car c3 = new Car("Iphone 15","I Phone",2023,11200);
		

	}

}
