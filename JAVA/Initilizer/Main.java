class Animal{
	Animal(){
		System.out.println("In Animal");
	}
}

class Dog extends Animal{
	Dog(){
		super();
		System.out.println("In dog");
	}
	{	System.out.println("In initilized"); }
}


class Main{
	
	public static void main(String args[]){
		Dog d = new Dog();

	}
}