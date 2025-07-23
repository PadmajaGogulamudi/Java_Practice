package lab;

import java.util.Scanner;

public class Book {
	int bookId;
	String title;
	String Author;
	double price;
	double discountPercentage;
	Book(int bookId,String title,String Author,double price,double discountPercentage){
		this.bookId=bookId;
		this.title=title;
		this.Author=Author;
		this.price=price;
		this.discountPercentage=discountPercentage;
	}

	public double calDiscount(double price, double discountPercentage) {
		double res = price-((price * discountPercentage) / 100);

		return res;
	}

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);

		System.out.println("enter book ID: ");
		int bookId = c.nextInt();
		System.out.println("enter book Title: ");
		String title = c.next();
		System.out.println("enter book Author: ");
		String Author = c.next();
		System.out.println("enter book Price: ");
		double price = c.nextDouble();
		System.out.println("enter Discount: ");
		double discountPercentage = c.nextDouble();
		Book b1 = new Book(bookId,title,Author,price,discountPercentage);
		double res = b1.calDiscount(price, discountPercentage);
		System.out.println("Final Price of book: " + res);
		
		c.close();

	}

}
