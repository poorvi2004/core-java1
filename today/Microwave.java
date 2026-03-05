class Microwave {

    static String brand="grf";
    static int capacity=20;
    static String type="reduction";
    static double price=10000;
    static int power=800;
    static boolean grillFunction = false;
    static String color="White";
    static int autoMenu=100;
    static String warranty="2 year";
    static String country="Canada";

    public static void main(String[] args) {

        String brand = "IFB";
        int capacity = 25;
        String type = "Convection";
        double price = 12999;
        int power = 900;
        boolean grillFunction = true;
        String color = "Silver";
        int autoMenu = 101;
        String warranty = "1 Year";
        String country = "India";

        System.out.println("Brand: " + brand);
		System.out.println("Brand: " +Microwave.brand );

        System.out.println("Capacity: " +capacity );
		System.out.println("Capacity: " +Microwave.capacity );
		
        System.out.println("Type: " + type);
		System.out.println("Type: " + Microwave.type);
		
        System.out.println("Price: ₹" + price);
		System.out.println("Price: ₹" +Microwave.price);
		
        System.out.println("Power: " + power );
		System.out.println("Power: " +Microwave.power);
		
        System.out.println("Grill Function: " + grillFunction);
		System.out.println("Grill Function: " + Microwave.grillFunction);
		
        System.out.println("Color: " + color);
		System.out.println("Color: " +Microwave.color);
		
        System.out.println("Auto Menu Options: " + autoMenu);
		System.out.println("Auto Menu Options: " +Microwave.autoMenu);
		
        System.out.println("Warranty: " + warranty);
		System.out.println("Warranty: " + Microwave.warranty);
		
        System.out.println("Country: " + country);
		System.out.println("Country: " + Microwave.country);
    }
}
