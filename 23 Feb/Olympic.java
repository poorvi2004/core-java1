class Olympic {

    static String sportNames[] = {
        "Swimming","Relay","Long Jump",
        "Cycling","Running","Wrestling"
    };

    public static void getsportNames() {
        System.out.println("sportNames invoked");
        for (String spo : sportNames) {
            System.out.println(spo);
        }
        System.out.println("stopped");
    }
}