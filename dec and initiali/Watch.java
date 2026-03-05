class Watch {

    static String brand;
    static String type;
    static String color;
    static double price;
    static boolean waterproof;
    static String strapMaterial;
    static String displayType;
    static int warrantyYears;
    static String movement;
    static String origin;

    public static void main(String[] args) {

        brand = "Fastrack";
        type = "Analog";
        color = "Black";
        price = 2499;
        waterproof = true;
        strapMaterial = "Leather";
        displayType = "Round";
        warrantyYears = 2;
        movement = "Quartz";
        origin = "India";

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Strap Material: " + strapMaterial);
        System.out.println("Display Type: " + displayType);
        System.out.println("Warranty: " + warrantyYears + " Years");
        System.out.println("Movement: " + movement);
        System.out.println("Origin: " + origin);
    }
}
