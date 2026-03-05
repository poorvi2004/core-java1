class Shoes {

    static String brand;
    static String type;
    static String color;
    static int size;
    static double price;
    static String material;
    static boolean washable;
    static String gender;
    static double weight;
    static String warranty;

    public static void main(String[] args) {

        brand = "Nike";
        type = "Running";
        color = "White";
        size = 9;
        price = 3999;
        material = "Mesh";
        washable = true;
        gender = "Unisex";
        weight = 0.7;
        warranty = "6 Months";

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: ₹" + price);
        System.out.println("Material: " + material);
        System.out.println("Washable: " + washable);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Warranty: " + warranty);
    }
}
