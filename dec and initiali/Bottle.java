class Bottle {
        static String brand;
        static String material;
        static int capacity ;
        static String color ;
        static double price;
        static boolean insulated;
        static double weight;
        static String type;
        static String warranty;
        static String country; 
    public static void main(String[] args) {

         brand = "Milton";
         material = "Steel";
        capacity = 1000;
         color = "Silver";
         price = 499.99;
         insulated = true;
         weight = 0.5;
         type = "Water Bottle";
         warranty = "1 Year";
         country = "India";

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacity + "ml");
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Insulated: " + insulated);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + country);
    }
}
