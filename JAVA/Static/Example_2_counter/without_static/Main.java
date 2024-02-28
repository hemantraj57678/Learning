class Main{
	int count = 0;
	
	Main(){
		count++;
	}
	
	void display(){
		System.out.println("Count : "+count);
	}
	
	
	public static void main(String args[]){
		Main m1 =new Main();
		Main m2=new Main();
		Main m3=new Main();
		m1.display();
		m2.display();
		m3.display();


		
	}
}