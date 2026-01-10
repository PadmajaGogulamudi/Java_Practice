package stringHandling;

import java.util.Scanner;

public class TimeFormatChange12To24 {

	public static void main(String[] args) {
		
		System.out.println("hello Enter time : ");
		boolean valid=true;
		
		
		Scanner sc=new Scanner(System.in);
		String time=sc.nextLine().toLowerCase();
		int amIndex=time.indexOf('a');
		int pmIndex=time.indexOf('p');
		String res="";
		
		if(amIndex!=-1 || pmIndex!=-1) {
			System.out.println("given time is 12 hour format ");
			
			boolean ismorning=(amIndex!=-1)?true:false;
			
			if(ismorning) {
				res=time.substring(0,amIndex);
				
			}else {
				String[] t=time.split(":");
				int hour=12+(Integer.parseInt(t[0]));
				String[] min=t[1].split(" ");
				int minu=Integer.parseInt(min[0]);
				if(minu>60) {
					System.out.println("given time is invalid!!!");
					valid=false;
				}
				
				
				res=hour+":"+minu;
			}
			if(valid) {
				System.out.println(res);
			}
			
			
		}
		else {
			System.out.println("given time is 24 hour format ");

			String amOrpm="";
			String[] t=time.split(":");
			int hour=Integer.parseInt(t[0]);
			if(hour>12) {
				hour-=12;
				amOrpm="pm";
				
			}
			else {
				amOrpm="am";
				
			}
			int min=Integer.parseInt(t[1]);
			
			if(min>60) {
				System.out.println("given time is invalid!!!");
				valid=false;
			}
			res=hour+":"+min;
			if(valid) {
				System.out.println(res+" "+amOrpm);
			}
			
			
		}
		

	}

}
