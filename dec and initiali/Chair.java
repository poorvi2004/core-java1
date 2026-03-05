class Chair {

    static String brand;
    static String material;
    static String color;
    static double price;
    static boolean foldable;
    static double weight;
    static String type;
    static int maxWeight;
    static String warranty;
    static String country;

    public static void main(String[] args) {

        brand = "Nilkamal";
        material = "Plastic";
        color = "Blue";
        price = 899;
        foldable = false;
        weight = 2.5;
        type = "Office";
        maxWeight = 120;
        warranty = "2 Years";
        country = "India";

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Foldable: " + foldable);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Type: " + type);
        System.out.println("Max Weight: " + maxWeight + "kg");
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + country);
    }
}
