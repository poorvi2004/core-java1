class Refrigerator {

    static String brand;
    static int capacity;
    static String color;
    static double price;
    static int doors;
    static boolean inverter;
    static int energyRating;
    static String type;
    static String warranty;
    static String country;

    public static void main(String[] args) {

        brand = "LG";
        capacity = 260;
        color = "Silver";
        price = 23999;
        doors = 2;
        inverter = true;
        energyRating = 5;
        type = "Double Door";
        warranty = "10 Years Compressor";
        country = "India";

        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Doors: " + doors);
        System.out.println("Inverter: " + inverter);
        System.out.println("Energy Rating: " + energyRating + " Star");
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + country);
    }
}
