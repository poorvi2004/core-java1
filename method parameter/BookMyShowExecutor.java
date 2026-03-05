class BookMyShowExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to BookMyShow");

		BookMyShow.registerUser("Akhil","akhil@gmail.com",9876543210l,"Bangalore","Action",2);
		BookMyShow.registerUser("Sneha","sneha@gmail.com",9876501234l,"Mumbai","Romance",4);
		BookMyShow.registerUser("Rahul","rahul@gmail.com",9876512340l,"Delhi","Comedy",3);
		BookMyShow.registerUser("Priya","priya@gmail.com",9876523450l,"Chennai","Thriller",1);
		BookMyShow.registerUser("Kiran","kiran@gmail.com",9876534560l,"Hyderabad","Horror",5);
	}
}