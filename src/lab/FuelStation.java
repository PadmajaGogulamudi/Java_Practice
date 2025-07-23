package lab;

public class FuelStation {
	String vehicleNo;
	double litOfPrteol;
	double litOfDegil;
	double p=2.2;
	double d=3.3;
	

	

	
	public FuelStation(String vehicleNo, double litOfPrteol, double litOfDegil) {
		super();
		this.vehicleNo = vehicleNo;
		this.litOfPrteol = litOfPrteol;
		this.litOfDegil = litOfDegil;
		double tp=litOfPrteol*p;
		double td=litOfDegil*d;
		System.out.println("Petrol No of Liters = "+litOfPrteol+"\nDegil No of Liters = "+litOfDegil+"\nTotal Amount of Petrol = "+tp+"\nTotal Amount of Degil = "+td);
	}


//	public void m(String vehicleNo,double litOfPrteol,double litOfDegil) {
//		double tp=litOfPrteol*p;
//		double td=litOfDegil*d;
//		System.out.println("Petrol No of Liters = "+litOfPrteol+"\nDegil No of Liters = "+litOfDegil+"\nTotal Amount of Petrol = "+tp+"\nTotal Amount of Degil = "+td);
//	}


	public static void main(String[] args) {
		FuelStation f=new FuelStation("AP7654",5,5);
//		f.m("AP7654",5,5);


	}

}
