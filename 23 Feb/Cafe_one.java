class Cafe_one {

    static String cafeName = "Cringe Cafe";

    static String teaNames[] = {
            "Lemon Tea", "Black Tea", "Masala Tea", "Amrut Tea", "Elachi Tea"
    };

    static String coffeeNames[] = {
            "Latte Coffee", "Espresso Coffee", "Mocha Coffee",
            "Flat White Coffee", "Lungo Coffee"
    };

    static String snacks[] = {
            "Popcorn", "French Fries", "Sandwich", "Pizza Slice"
    };
	public static void main(String[] args) {

        System.out.println("The Cafe Name is: " + cafeN
		ame);
        System.out.println();

        displayTeas();
        displayCoffees();
        displaySnacks();
    }

    static void displayTeas() {
        
        for (String name : teaNames) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void displayCoffees() {
        
        for (String name : coffeeNames) {
            System.out.println(name);
        }
        System.out.println();
    }

    
    static void displaySnacks() {
        
        for (String name : snacks) {
            System.out.println(name);
        }
        System.out.println();
    }

    
}