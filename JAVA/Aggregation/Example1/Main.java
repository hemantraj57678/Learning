class Main{
	public static void main(String[] args){
		Address ad = new Address("Newyork","USA",560000);
		Employe tisha= new Employe("Tisha",04,ad);
		System.out.println(tisha.name);
		System.out.println(tisha.id);
		System.out.println(tisha.address.city);
		System.out.println(tisha.address.state);
		System.out.println(tisha.address.pincode);


	}
	
}