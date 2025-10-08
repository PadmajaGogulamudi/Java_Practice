package stringHandling;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer sb = new StringBuffer("racecar");
//		//System.out.println(sb.reverse().toString().equals("racecar"));
//		System.out.println(sb.reverse());
		
//		StringBuffer s=new StringBuffer("abcdef");
////		s.insert(2, "123");
////		System.out.println(s);//ab123cdef
//		s.setCharAt(2, 's');
//		System.out.println(s);//absdef
		
//		StringBuffer sb1 = new StringBuffer("java");
//		StringBuffer sb2 = new StringBuffer("java");
//		System.out.println(sb1.toString().equals(sb2.toString()));
//
//		
//		StringBuilder sb = new StringBuilder("abc");
//		sb.insert(3, "xyz");
//		//sb.insert(4, "xyz");
//		System.out.println(sb);
//		StringBuffer sb = new StringBuffer("012345");
//		sb.replace(1, 4, "sgd");
//		System.out.println(sb);

//		StringBuffer sb = new StringBuffer("hello");//heYZllo
//		sb.insert(2, new char[]{'X','Y','Z'}, 1, 2);
//		System.out.println(sb);

		StringBuilder sb = new StringBuilder("abcd");//20
		sb.append("efghijklmnopqrstu");//sb=abcdefghijklmnop==length==16
		//sb.trimToSize();
		System.out.println(sb.capacity());//42

	}

}
