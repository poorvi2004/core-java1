class DMart {

    static String products[] = {
        "Aashirvaad Atta 5kg",
        "Tata Salt 1kg",
        "Fortune Sunflower Oil 1L",
        "Parle-G Biscuits",
        "Maggi Noodles",
        "Colgate Toothpaste",
        "Surf Excel Detergent",
        "Amul Butter"
    };

    public static void getProducts() {
        System.out.println("start get products");
        for (String product : products) {
            System.out.println(product);
        }
        System.out.println("end of the data");
    }
}

