class ApolloHospitalExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Apollo Hospital");

		ApolloHospital.bookAppointment("Ramesh",45,"Dr. Sharma","Cardiology","10-03-2026","10AM",800);
		ApolloHospital.bookAppointment("Sneha",30,"Dr. Mehta","Dermatology","11-03-2026","11AM",600);
		ApolloHospital.bookAppointment("Kiran",55,"Dr. Rao","Orthopedics","12-03-2026","2PM",900);
		ApolloHospital.bookAppointment("Anjali",28,"Dr. Nair","Gynecology","13-03-2026","4PM",700);
		ApolloHospital.bookAppointment("Vikram",60,"Dr. Patel","Neurology","14-03-2026","9AM",1200);
	}
}