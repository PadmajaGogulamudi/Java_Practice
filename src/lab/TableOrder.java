package lab;

//16-07-2025
public class TableOrder {
	int num;
	int order;
	double totalBill;

	public TableOrder(int num) {
		this.num = num;

	}

	void addOrder(int a, int b) {
		order += a;
		totalBill += a * b;
	}

	double applyServiceCharge(int a) {

		return (totalBill * a) / 100;
	}

	double totalBill() {
		return totalBill - applyServiceCharge(5);
	}

	void printBill() {

		System.out.println("table number : " + num + "\nTotal orders : " + order + "\nService charges : "
				+ applyServiceCharge(5) + "\nTotal bill : " + totalBill());
	}

	public static void main(String[] args) {
		TableOrder t1 = new TableOrder(5);
		t1.addOrder(3, 150);
		t1.addOrder(2, 200);
		t1.printBill();
	}

}
