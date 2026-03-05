class Glass {

    static String brand;
    static String material;
    static int capacity;
    static String color;
    static double price;
    static boolean microwaveSafe;
    static double weight;
    static String shape;
    static String packSize;
    static String origin;

    public static void main(String[] args) {

        brand = "Cello";
        material = "Glass";
        capacity = 300;
        color = "Transparent";
        price = 199.50;
        microwaveSafe = true;
        weight = 0.3;
        shape = "Round";
        packSize = "Set of 6";
        origin = "India";

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacity + "ml");
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Microwave Safe: " + microwaveSafe);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Shape: " + shape);
        System.out.println("Pack Size: " + packSize);
        System.out.println("Origin: " + origin);
    }
}
