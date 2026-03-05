class Hospital {

    static String doctorNames[] = {
        "Dr. Anil Kumar",
        "Dr. Priya Sharma",
        "Dr. Ramesh Rao",
        "Dr. Sneha Patil",
        "Dr. Vijay Shetty",
        "Dr. Kavitha Nair",
        "Dr. Arjun Malhotra",
        "Dr. Neha Gupta",
        "Dr. Suresh Iyer",
        "Dr. Pooja Verma",
        "Dr. Kiran Deshpande",
        "Dr. Mehul Jain",
        "Dr. Asha Kulkarni",
        "Dr. Rohit Bansal",
        "Dr. Nandini Hegde",
        "Dr. Deepak Chawla",
        "Dr. Shalini Mehta",
        "Dr. Prakash Reddy",
        "Dr. Isha Kapoor",
        "Dr. Manoj Yadav",
        "Dr. Sunita Joshi",
        "Dr. Varun Aggarwal",
        "Dr. Ananya Bose",
        "Dr. Sandeep Pillai",
        "Dr. Kavya Menon",
        "Dr. Ritu Saxena",
        "Dr. Harish Arora",
        "Dr. Pankaj Tripathi",
        "Dr. Bhavya Singh",
        "Dr. Nikhil Kulkarni"
    };

    public static void getDoctors() {
        System.out.println("start get doctors");
        for (String doctor : doctorNames) {
            System.out.println(doctor);
        }
        System.out.println("end of the data");
    }
}

