class BatteryExecutor {

    public static void main(String[] args) {

        System.out.println("=== Battery Details ===");

        System.out.println(Battery.getBrand());
        System.out.println(Battery.getPrice());
        System.out.println(Battery.getColor());
        System.out.println(Battery.getModel());
        System.out.println(Battery.getType());
        System.out.println(Battery.getCapacity());
        System.out.println(Battery.getVoltage());
        System.out.println(Battery.getFastChargingSupport());
        System.out.println(Battery.getChargingCycles());
        System.out.println(Battery.getOverchargeProtection());

        System.out.println(Battery.getOverDischargeProtection());
        System.out.println(Battery.getShortCircuitProtection());
        System.out.println(Battery.getTemperatureProtection());
        System.out.println(Battery.getBatteryIndicator());
        System.out.println(Battery.getChargingTime());
        System.out.println(Battery.getWeight());
        System.out.println(Battery.getCompatibility());
        System.out.println(Battery.getShelfLife());
        System.out.println(Battery.getWarranty());
        System.out.println(Battery.getMadeIn());

        System.out.println("=== End of Battery Details ===");
    }
}