abstract class Bike{
	abstract void run();
}


class  Example1 extends Bike{
		 void run(){System.out.println("Bike is running.");}
		
		public static void main(String args[]){
			Example1 e =new Example1();
			e.run();
		}
}