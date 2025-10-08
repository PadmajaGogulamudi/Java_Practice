package stringHandling;

public class Findlargestandremovedupicates {

	public static void main(String[] args) {
		String s1 = "i love java";

		String[] a = s1.split(" ");
		int max = 0;
		
		for (String s : a) {
			if (s.length() > max) {
				max = s.length();
			}
		}
		
		
		String largest=null;
		for (String s : a) {
			if (s.length() == max) {
				if(largest==null) {
					largest=s;
				}
				else {
					int c = largest.compareTo(s);
					if(c>0) {
						largest=s;
					}
				}
			}
		}
		System.out.println(largest);

	}
}
