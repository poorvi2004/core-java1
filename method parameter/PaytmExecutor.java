class PaytmExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Paytm");

		Paytm.openWallet("Ramesh",9123456780l,5000.50,"Verified","Premium","Bangalore");
		Paytm.openWallet("Suresh",9234567890l,2000.00,"Pending","Basic","Mumbai");
		Paytm.openWallet("Mahesh",9345678901l,10000.75,"Verified","Premium","Delhi");
		Paytm.openWallet("Ganesh",9456789012l,1500.25,"Verified","Basic","Pune");
		Paytm.openWallet("Naresh",9567890123l,7500.60,"Pending","Premium","Chennai");
	}
}