class PrinterExecutor {

    public static void main(String[] args) {

        System.out.println("=== Printer Details ===");

        System.out.println(Printer.getBrand());
        System.out.println(Printer.getPrice());
        System.out.println(Printer.getColor());
        System.out.println(Printer.getModel());
        System.out.println(Printer.getType());
        System.out.println(Printer.getPrintTechnology());
        System.out.println(Printer.getPrintSpeed());
        System.out.println(Printer.getScanFeature());
        System.out.println(Printer.getCopyFeature());
        System.out.println(Printer.getConnectivity());

        System.out.println(Printer.getPaperSize());
        System.out.println(Printer.getDuplexPrinting());
        System.out.println(Printer.getInkType());
        System.out.println(Printer.getDisplayPanel());
        System.out.println(Printer.getMemory());
        System.out.println(Printer.getDutyCycle());
        System.out.println(Printer.getNoiseLevel());
        System.out.println(Printer.getPowerConsumption());
        System.out.println(Printer.getWarranty());
        System.out.println(Printer.getMadeIn());

        System.out.println("=== End of Printer Details ===");
    }
}