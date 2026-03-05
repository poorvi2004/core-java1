class Television {

    static String brand;
    static int screenSize;
    static String displayType;
    static double price;
    static boolean smartTV;
    static String resolution;
    static int hdmiPorts;
    static int usbPorts;
    static String warranty;
    static String color;

    public static void main(String[] args) {

        brand = "Sony";
        screenSize = 43;
        displayType = "LED";
        price = 45999;
        smartTV = true;
        resolution = "4K";
        hdmiPorts = 3;
        usbPorts = 2;
        warranty = "1 Year";
        color = "Black";

        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Display Type: " + displayType);
        System.out.println("Price: ₹" + price);
        System.out.println("Smart TV: " + smartTV);
        System.out.println("Resolution: " + resolution);
        System.out.println("HDMI Ports: " + hdmiPorts);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Warranty: " + warranty);
        System.out.println("Color: " + color);
    }
}
