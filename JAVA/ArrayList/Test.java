import java.util.ArrayList;

class Employee{
	int rollnumber;
	String name;
	
	Employee(int rollnumber, String name){
		this.rollnumber=rollnumber;
		this.name=name;
	}
	void display() {
		System.out.println("Name"+name+"roll Number"+rollnumber);
	}
}

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee(1,"Hemant");
		Employee e2 =new Employee(2,"Maneesh");
		Employee e3 =new Employee(3,"Aniya");
		Employee e4 =new Employee(4,"Montu");
		Employee e5 =new Employee(5,"sibu");

		ArrayList<Employee> as = new ArrayList<Employee>();
		as.add(e1);
		as.add(e2);
		as.add(e3);
		as.add(e4);
		as.add(e5);

		as.add(new Employee(6, "sgsghds"));
		as.add(new Employee(7, "asagsghds"));

//		for(Employee g:as) {
//			System.out.print(g.name+" ");
//			System.out.println(g.rollnumber);
//		}
		for(int i=0;i<as.size();i++) {
			as.get(i).display();
//			System.out.println(as.get(i).name);
//			System.out.println(as.get(i).rollnumber);

		}
		
		System.out.println();

	}

}
