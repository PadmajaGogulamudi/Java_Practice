package lab;

public class ObjCount {
	static int count=0;


	{
		count+=1;
	}

//instance block will call after creating object 
	public static void main(String[] args) {
		ObjCount n1= new ObjCount();
		ObjCount n2= new ObjCount();
		ObjCount n3= new ObjCount();

		System.out.println("number of objects created :"+ count);


	}

}
