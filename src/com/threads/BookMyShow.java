package com.threads;

class BookMySeats{
	int totalTickets=10;
	synchronized void book(int seats) {
		if(seats<=totalTickets) {
			totalTickets-=seats;
			System.out.println("tickets booked successful for thread :"+Thread.currentThread().getName()+"\nAvailable tickets : "+(totalTickets));
			
		}
		else 
			System.err.println("tickets have been sold out!!for thread :"+Thread.currentThread().getName()+"\nAvailable tickets : "+(totalTickets));
			
	}
}


public class BookMyShow  extends Thread{
	private final BookMySeats b;
	
	int seats;
	public BookMyShow(BookMySeats shared, int i) {
		this.b = shared;
		this.seats=i;
		
	}
	public void run() {
		
		b.book(seats);
		
	}

	

}
