class NetflixExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Netflix");

		Netflix.createAccount("Rahul","rahul@gmail.com",9789012345l,"Rahul@123","Premium","English","India");
		Netflix.createAccount("Pooja","pooja@gmail.com",9890123456l,"Pooja@123","Basic","Hindi","India");
		Netflix.createAccount("Vikram","vikram@gmail.com",9901234567l,"Vikram@123","Standard","English","India");
		Netflix.createAccount("Sneha","sneha@gmail.com",9012345678l,"Sneha@123","Premium","Hindi","India");
		Netflix.createAccount("Arun","arun@gmail.com",9023456789l,"Arun@123","Basic","English","India");
	}
}