class Ipl {

	 static String worldCupName="IPL World Cup";
     static String teamNames[]={"India","England","Oman","Australia","South Africa","Nepal","New Zeland","Ireland","Netherland","Canada","Italy","Pakistan","Scotland","West Indies","United Arab Emirates","United States"};
   
   
    
    public static void getTeams() {

        System.out.println("World Cup Name: " +  worldCupName);
        System.out.println("main method started");
       

        System.out.println("The Teams are:");
        System.out.println("Total Teams: " + teamNames.length);
        System.out.println();
          
        for(String teamName : teamNames) {
            System.out.println(teamName);
        }
    }
}