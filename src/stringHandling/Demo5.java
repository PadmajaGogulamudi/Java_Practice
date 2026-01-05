package stringHandling;

public class Demo5 {

	public static void main(String[] args) {
		String s = "hello world";
		s = s.replaceAll(" ", "");
		String s1 = "";
		String s2 = "";
		//boolean flag = false;
		
		
		for(int i=0;i<s.length();) {
			for(int j=0;j<2 && i<s.length();j++,i++) {
				s1+=s.charAt(i);
			}
			for(int k=0;k<2 && i<s.length();k++,i++){
				s2+=s.charAt(i);
			}
		}

//		for (int i = 0; i < s.length(); i = i + 2) {
//			if (flag) {
//				int count = 0;
//
//				for (int j = i; j < s.length(); j++) {
//
//					if (count < 2) {
//						s2 += s.charAt(j);
//						count++;
//
//					} else
//						break;
//
//				}
//
//				flag = !flag;
//
//			} else {
//				int count = 0;
//
//				for (int j = i; j < s.length(); j++) {
//
//					if (count < 2) {
//						s1 += s.charAt(j);
//						count++;
//
//					} else
//						break;
//
//				}
//
//				flag = !flag;
//
//			}
//
//		}
		System.out.println(s1);
		System.out.println(s2);

	}

}
