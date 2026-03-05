class Cupboard {

    static String brand;
    static String material;
    static int doors;
    static String color;
    static double price;
    static boolean lockAvailable;
    static double height;
    static double width;
    static String type;
    static String warranty;

    public static void main(String[] args) {

        brand = "Ikea";
        material = "Wood";
        doors = 3;
        color = "Brown";
        price = 15999;
        lockAvailable = true;
        height = 6.5;
        width = 4.0;
        type = "Bedroom";
        warranty = "5 Years";

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Doors: " + doors);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Lock Available: " + lockAvailable);
        System.out.println("Height: " + height + "ft");
        System.out.println("Width: " + width + "ft");
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warranty);
    }
}
