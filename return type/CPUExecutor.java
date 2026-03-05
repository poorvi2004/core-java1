class CPUExecutor {

    public static void main(String[] args) {

        System.out.println("=== CPU Details ===");

        System.out.println(CPU.getBrand());
        System.out.println(CPU.getPrice());
        System.out.println(CPU.getModel());
        System.out.println(CPU.getGeneration());
        System.out.println(CPU.getCoreCount());
        System.out.println(CPU.getThreadCount());
        System.out.println(CPU.getBaseClock());
        System.out.println(CPU.getBoostClock());
        System.out.println(CPU.getCache());
        System.out.println(CPU.getSocketType());

        System.out.println(CPU.getArchitecture());
        System.out.println(CPU.getIntegratedGraphics());
        System.out.println(CPU.getTDP());
        System.out.println(CPU.getManufacturingProcess());
        System.out.println(CPU.getMemorySupport());
        System.out.println(CPU.getPCIeSupport());
        System.out.println(CPU.getVirtualizationSupport());
        System.out.println(CPU.getCoolerIncluded());
        System.out.println(CPU.getWarranty());
        System.out.println(CPU.getMadeIn());

        System.out.println("=== End of CPU Details ===");
    }
}