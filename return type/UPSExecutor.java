class UPSExecutor {

    public static void main(String[] args) {

        System.out.println("=== UPS Details ===");

        System.out.println(UPS.getBrand());
        System.out.println(UPS.getPrice());
        System.out.println(UPS.getColor());
        System.out.println(UPS.getModel());
        System.out.println(UPS.getCapacity());
        System.out.println(UPS.getUPSInputVoltage());
        System.out.println(UPS.getUPSOutputVoltage());
        System.out.println(UPS.getBatteryType());
        System.out.println(UPS.getBackupTime());
        System.out.println(UPS.getChargingTime());

        System.out.println(UPS.getAutoVoltageRegulation());
        System.out.println(UPS.getOverloadProtection());
        System.out.println(UPS.getShortCircuitProtection());
        System.out.println(UPS.getSurgeProtection());
        System.out.println(UPS.getDisplayType());
        System.out.println(UPS.getAlarmSystem());
        System.out.println(UPS.getNumberOfOutlets());
        System.out.println(UPS.getFormFactor());
        System.out.println(UPS.getWarranty());
        System.out.println(UPS.getMadeIn());

        System.out.println("=== End of UPS Details ===");
    }
}