package stringHandling;

public class Rem_Adjacent_Dup_Chars {

	
	    public static void main(String[] args) {
	        String s="aazxxzy";
	        while(true){
	            int count=0;
	        for(int i=1;i<s.length();i++){
	            if(s.charAt(i)==s.charAt(i-1)){
	                s=s.substring(0,i-1)+s.substring(i+1,s.length());
	               // System.out.println(s);
	                count++;
	                break;
	            }
	        }
	        if(count==0){
	            break;
	        }
	        }
	        System.out.println(s);
	    }
}
	