class OlaExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Ola");

		Ola.createAccount("Ramesh","ramesh@gmail.com",9001112223l,"Ramesh@123","Bangalore","Auto","UPI");
		Ola.createAccount("Suresh","suresh@gmail.com",9002223334l,"Suresh@123","Mumbai","Cab","Card");
		Ola.createAccount("Mahesh","mahesh@gmail.com",9003334445l,"Mahesh@123","Delhi","Bike","Cash");
		Ola.createAccount("Ganesh","ganesh@gmail.com",9004445556l,"Ganesh@123","Chennai","Cab","UPI");
		Ola.createAccount("Naresh","naresh@gmail.com",9005556667l,"Naresh@123","Pune","Auto","Card");
	}
}