package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp {
public static void main(String[] args) {
	Employee e1=new Employee(1, "paddu", 'F');
	Employee e2=new Employee(2, "reddy", 'F');

	Employee e3=new Employee(3, "bhanu", 'M');
	
	List<Employee> l=new ArrayList<>();
	
	l.add(e1);
	l.add(e2);
	l.add(e3);
	//System.out.println(l.toString());
//	for(Employee e:l) {
//		//System.out.println(e);
//		if(e.empnum==1) {
//			l.remove(0);
//		}
//		
//	}
	
	Iterator<Employee> itr=l.iterator();
	while(itr.hasNext()) {
		Employee e=(Employee) itr.next();
		
		if(e.empnum==1) {
			itr.remove();
			continue;
		}
		System.out.println(e);
		
	}
	
	
	//System.out.println(l);
	

}
}
