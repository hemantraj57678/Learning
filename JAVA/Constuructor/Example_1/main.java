class Student{
	String name;
	int rollnumber;
	static String collegename;
	
	Student(int rollnumber, String name){
		this.name=name;
		this.rollnumber=rollnumber;
	}
	
	Student(int rollnumber, String name, String collegename){
		this.name=name;
		this.rollnumber=rollnumber;
		this.collegename=collegename;
	}
	
	void display(){
		System.out.println("RollNumber :"+rollnumber+" Name : "+name+ " College Name : "+collegename);
	}
	
}
class Main{
	public static void main(String args[]){
		Student h = new Student(1,"Hemantraj","GEC Patan");
		Student s = new Student(2,"Alpesh");
		s.display();
		h.display();
		
	}
}