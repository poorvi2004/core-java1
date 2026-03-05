class Fan {

    static String brand;
    static String type;
    static int blades;
    static String color;
    static double price;
    static int speedLevels;
    static boolean remoteControl;
    static int power;
    static String warranty;
    static String country;

    public static void main(String[] args) {

        brand = "Usha";
        type = "Ceiling Fan";
        blades = 3;
        color = "Brown";
        price = 2499;
        speedLevels = 5;
        remoteControl = false;
        power = 75;
        warranty = "2 Years";
        country = "India";

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Blades: " + blades);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Speed Levels: " + speedLevels);
        System.out.println("Remote Control: " + remoteControl);
        System.out.println("Power: " + power + "W");
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + country);
    }
}
