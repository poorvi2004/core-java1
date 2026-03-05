class WorldCup {

    public static void main(String[] args) {

        String tournamentName = "ICC World Cup";
        int totalGroups = 4;
        int totalTeams = 20;

        String groupA[] = {
                "India",
                "Australia",
                "England",
                "Pakistan",
                "New Zealand"
        };

        String groupB[] = {
                "South Africa",
                "Sri Lanka",
                "Bangladesh",
                "Afghanistan",
                "West Indies"
        };

        String groupC[] = {
                "Netherlands",
                "Ireland",
                "Zimbabwe",
                "Scotland",
                "Nepal"
        };

        String groupD[] = {
                "UAE",
                "USA",
                "Canada",
                "Oman",
                "Namibia"
        };
		
		for(String group:groupA){
			System.out.println(group);
		}
		for(String group:groupB){
			System.out.println(group);
		}
       for(String group:groupC){
			System.out.println(group);
		}
        for(String group:groupD){
			System.out.println(group);
		}


       /* System.out.println("The tournament name is " + tournamentName);
        System.out.println("Total Groups: " + totalGroups);
        System.out.println("Total Teams: " + totalTeams);

        System.out.println("\nGroup A Teams:");
        System.out.println(groupA[0] + "\n" +
                           groupA[1] + "\n" +
                           groupA[2] + "\n" +
                           groupA[3] + "\n" +
                           groupA[4]);

        System.out.println("\nGroup B Teams:");
        System.out.println(groupB[0] + "\n" +
                           groupB[1] + "\n" +
                           groupB[2] + "\n" +
                           groupB[3] + "\n" +
                           groupB[4]);

        System.out.println("\nGroup C Teams:");
        System.out.println(groupC[0] + "\n" +
                           groupC[1] + "\n" +
                           groupC[2] + "\n" +
                           groupC[3] + "\n" +
                           groupC[4]);

        System.out.println("\nGroup D Teams:");
        System.out.println(groupD[0] + "\n" +
                           groupD[1] + "\n" +
                           groupD[2] + "\n" +
                           groupD[3] + "\n" +
                           groupD[4]);*/
    }
}