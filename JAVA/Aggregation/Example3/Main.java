class Operation{
	int squreValue(int n){
		return n*n;
	}
}

class Circle{
	float pi = 3.14F;
	Operation op = new Operation();
	
	float area(int r){
		
		int value = op.squreValue(r);
		float a=value*pi;
		System.out.println("Area : "+a);
		
		return a;
		
	}
	
}



class Main{
	
	public static void main(String args[]){
		Circle c = new  Circle();
		c.area(7);
		

	}
}