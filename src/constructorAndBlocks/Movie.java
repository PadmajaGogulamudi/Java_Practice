package constructorAndBlocks;

public class Movie {
	String Heroname;
	String Moviername;
	double budget;

	public Movie(String Moviername) {
		this.Moviername = Moviername;
	}

	public Movie(Movie m1,String Heroname, int budget) {
		this.Moviername=m1.Moviername;
		this.Heroname = Heroname;
		this.budget = budget;
	}

	public static void main(String[] args) {
		System.out.println("main starting.....");
		Movie m1 = new Movie("happy");
		m1.show();
		System.out.println("*****************");
		Movie m2 = new Movie(m1,"Allu", 5000000);
		m2.show();

	}

	void show() {
		
		System.out.println(Heroname + "\n" + Moviername + "\n" + budget);
	}
}
