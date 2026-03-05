class WorldCup {

    static String tournamentName = "ICC Cricket World Cup";
    static int totalGroups = 4;
    static int totalTeams = 20;

    static String groupA[] = {
        "India",
        "Australia",
        "England",
        "Pakistan",
        "New Zealand"
    };

    static String groupB[] = {
        "South Africa",
        "Sri Lanka",
        "Bangladesh",
        "Afghanistan",
        "West Indies"
    };

    static String groupC[] = {
        "Netherlands",
        "Ireland",
        "Zimbabwe",
        "Scotland",
        "Nepal"
    };

    static String groupD[] = {
        "UAE",
        "USA",
        "Canada",
        "Oman",
        "Namibia"
    };

    public static void main(String[] args) {

        System.out.println("Tournament Name: " + tournamentName);
        System.out.println("Total Groups: " + totalGroups);
        System.out.println("Total Teams: " + totalTeams);
        System.out.println();

        displayGroupA();
        displayGroupB();
        displayGroupC();
        displayGroupD();
    }


    static void displayGroupA() {
        System.out.println("Group A Teams:");
        for(String team : groupA) {
            System.out.println(team);
        }
        System.out.println();
    }

    static void displayGroupB() {
        System.out.println("Group B Teams:");
        for(String team : groupB) {
            System.out.println(team);
        }
        System.out.println();
    }

    static void displayGroupC() {
        System.out.println("Group C Teams:");
        for(String team : groupC) {
            System.out.println(team);
        }
        System.out.println();
    }

    static void displayGroupD() {
        System.out.println("Group D Teams:");
        for(String team : groupD) {
            System.out.println(team);
        }
        System.out.println();
    }
}