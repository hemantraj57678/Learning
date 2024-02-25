class Employe{
	String name;
	int id;
	Address address;
	
	Employe(){
		
	}
	Employe(String name, int id,Address address){
		this.name=name;
		this.id=id;
		this.address=address;
	}
	
	void display(){
		System.out.println("Name : "+name+"\nEmployeId : "+id+"\nCity : "+address.city+"\nState : "+address.city+"\nZipCode : "+address.pincode);
		
	}
	
}