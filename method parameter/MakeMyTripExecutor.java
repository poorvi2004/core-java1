class MakeMyTripExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to MakeMyTrip");

		MakeMyTrip.bookFlight("Karthik","Bangalore","Delhi","IndiGo",5500.0,"Economy");
		MakeMyTrip.bookFlight("Divya","Mumbai","Dubai","Emirates",35000.0,"Business");
		MakeMyTrip.bookFlight("Rohit","Chennai","Kolkata","Air India",7000.0,"Economy");
		MakeMyTrip.bookFlight("Anusha","Hyderabad","Singapore","Singapore Airlines",45000.0,"First Class");
		MakeMyTrip.bookFlight("Manoj","Pune","Goa","SpiceJet",4000.0,"Economy");
	}
}