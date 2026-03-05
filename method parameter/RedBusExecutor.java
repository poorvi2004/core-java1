class RedBusExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to RedBus");

		RedBus.bookTicket("Anil","Bangalore","Mysore","AC Sleeper",850.0,2);
		RedBus.bookTicket("Sunita","Mumbai","Pune","Non AC",450.0,1);
		RedBus.bookTicket("Vikas","Delhi","Jaipur","Volvo",1200.0,3);
		RedBus.bookTicket("Meena","Chennai","Coimbatore","AC Seater",900.0,2);
		RedBus.bookTicket("Ravi","Hyderabad","Vizag","Sleeper",1100.0,4);
	}
}