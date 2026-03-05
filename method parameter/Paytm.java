class Paytm
{
	static void openWallet(String holderName,long mobile,double balance,String kycStatus,String accountType,String city)
	{
		System.out.println("Account Holder: " + holderName);
		System.out.println("Registered Mobile: " + mobile);
		System.out.println("Available Balance: ₹" + balance);
		System.out.println("KYC Status: " + kycStatus);
		System.out.println("Account Type: " + accountType);
		System.out.println("City: " + city);
		System.out.println("Wallet Activated Successfully");
		System.out.println("--------------------------------------");
	}
}

