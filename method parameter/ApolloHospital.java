class ApolloHospital
{
	static void bookAppointment(String patientName,int age,String doctorName,String department,String appointmentDate,String timeSlot,double consultationFee)
	{
		System.out.println("Patient Name: " + patientName);
		System.out.println("Age: " + age);
		System.out.println("Doctor Name: " + doctorName);
		System.out.println("Department: " + department);
		System.out.println("Appointment Date: " + appointmentDate);
		System.out.println("Time Slot: " + timeSlot);
		System.out.println("Consultation Fee: ₹" + consultationFee);
		System.out.println("Appointment Confirmed Successfully");
		System.out.println("--------------------------------------");
	}
}

