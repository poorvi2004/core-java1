class BluetoothExecutor {

    public static void main(String[] args) {

        System.out.println("=== Bluetooth Details ===");

        System.out.println(Bluetooth.getBrand());
        System.out.println(Bluetooth.getPrice());
        System.out.println(Bluetooth.getColor());
        System.out.println(Bluetooth.getType());
        System.out.println(Bluetooth.getBatteryLife());
        System.out.println(Bluetooth.getChargingType());
        System.out.println(Bluetooth.getBluetoothVersion());
        System.out.println(Bluetooth.getWaterResistance());
        System.out.println(Bluetooth.getNoiseCancellation());
        System.out.println(Bluetooth.getWarranty());

        System.out.println("=== End of Bluetooth Details ===");
    }
}