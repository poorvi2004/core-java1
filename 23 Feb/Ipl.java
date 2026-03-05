class Ipl {

    
    static String leagueName = "Indian Premier League (IPL)";

   
    static String teamNames[] = {
        "India","England","Australia","South Africa","Nepal",
        "New Zealand","Ireland","Netherlands","Canada","Italy",
        "Pakistan","Scotland","West Indies",
        "United Arab Emirates","United States"
    };

    
    public static void main(String[] any) {

        System.out.println("League Name: " + leagueName);
        System.out.println();

        displayTeams();
    }

    
    static void displayTeams() {

        System.out.println("The Teams are:");
        System.out.println("Total Teams: " + teamNames.length);
        System.out.println();

        for(String teamName : teamNames) {
            System.out.println(teamName);
        }
    }
}