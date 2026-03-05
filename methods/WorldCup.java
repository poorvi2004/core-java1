class WorldCup {

    
    static String tournamentName = "ICC Cricket World Cup";

    static String teamNameA[] ={"India","Australia","England","Pakistan","New Zealand"};
   static String teamNameB[] ={"South Africa","Sri Lanka","Bangladesh","Afganistan","West Indies"};
  static String teamNameC[] ={"NetherLands","Ireland","Zimbabwe","Scotland","Nepal"};
   static  String teamNameD[] ={"UAE","USA","Canada","Oman","Namibia"};

    public static void getteamName() {

        System.out.println("main started");
        System.out.println();

   
        System.out.println("Group A Teams:");
        for(String team : teamNameA) {
            System.out.println(team);
        }
        System.out.println();
    
        System.out.println("Group B Teams:");
        for(String team : teamNameB) {
            System.out.println(team);
        }
        System.out.println();
    
        System.out.println("Group C Teams:");
        for(String team : teamNameC) {
            System.out.println(team);
        }
        System.out.println();
  
        System.out.println("Group D Teams:");
        for(String team : teamNameD) {
            System.out.println(team);
        }
        System.out.println();
    }
}