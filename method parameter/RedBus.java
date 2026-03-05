class RedBus
{
	static void bookTicket(String passengerName,String source,String destination,String busType,double fare,int seats)
	{
		System.out.println("Passenger Name: " + passengerName);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("Bus Type: " + busType);
		System.out.println("Ticket Fare: ₹" + fare);
		System.out.println("Number of Seats: " + seats);
		System.out.println("Ticket Booked Successfully");
		System.out.println("--------------------------------------");
	}
}

