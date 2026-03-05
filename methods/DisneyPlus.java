class DisneyPlus {

    
    static String platformName = "Disney Plus";

    static String marvel[] = {
        "Iron Man","Captain America","Thor","Hulk","Black Widow",
        "Doctor Strange","Black Panther","Ant-Man","Captain Marvel","Avengers",
        "Avengers Endgame","Avengers Infinity War","Spider-Man Homecoming","Spider-Man No Way Home","Guardians of the Galaxy",
        "Shang-Chi","Eternals","WandaVision","Loki","Hawkeye",
        "Moon Knight","Ms Marvel","She-Hulk","The Falcon and the Winter Soldier","Secret Invasion",
        "Deadpool","X-Men","Fantastic Four","Blade","Venom"
    };

    static String pixar[] = {
        "Toy Story","Cars","Finding Nemo","Finding Dory","Coco",
        "Inside Out","Up","Ratatouille","Wall-E","Brave",
        "Soul","Luca","Turning Red","Monsters Inc","Monsters University",
        "The Incredibles","Incredibles 2","A Bug's Life","Lightyear","Onward",
        "Elemental","The Good Dinosaur","Cars 2","Cars 3","Toy Story 2",
        "Toy Story 3","Toy Story 4","Coco 2","Up 2","Inside Out 2"
    };

    static String starWars[] = {
        "A New Hope","The Empire Strikes Back","Return of the Jedi","The Phantom Menace","Attack of the Clones",
        "Revenge of the Sith","The Force Awakens","The Last Jedi","The Rise of Skywalker","Rogue One",
        "Solo","The Mandalorian","The Book of Boba Fett","Obi-Wan Kenobi","Andor",
        "Ahsoka","Clone Wars","Rebels","Bad Batch","Young Jedi Adventures",
        "Visions","Resistance","Tales of the Jedi","Ewoks","Droids",
        "Star Wars Holiday Special","Galaxy of Adventures","Forces of Destiny","Empire of Dreams","Underworld"
    };

    static String animated[] = {
        "Frozen","Frozen 2","The Lion King","Aladdin","Beauty and the Beast",
        "Tangled","Moana","Encanto","Mulan","Hercules",
        "Tarzan","Cinderella","Snow White","Sleeping Beauty","Pinocchio",
        "Bambi","Zootopia","Big Hero 6","Ralph Breaks the Internet","Wreck-It Ralph",
        "The Little Mermaid","Peter Pan","Pocahontas","Lilo & Stitch","Bolt",
        "Treasure Planet","Atlantis","Robin Hood","Dumbo","Fantasia"
    };

    static String familyShows[] = {
        "Hannah Montana","Suite Life of Zack and Cody","That's So Raven","Jessie","Austin & Ally",
        "Good Luck Charlie","Wizards of Waverly Place","Liv and Maddie","Kim Possible","Phineas and Ferb",
        "Gravity Falls","DuckTales","The Proud Family","Amphibia","Bluey",
        "Raven's Home","Bunk'd","Shake It Up","Girl Meets World","Andi Mack",
        "Lab Rats","Kickin It","Pair of Kings","Sydney to the Max","K.C. Undercover",
        "Even Stevens","Recess","The Owl House","Star vs the Forces of Evil","Big City Greens"
    };

    static String superheroes[] = {
        "Superman","Batman","Wonder Woman","Flash","Aquaman",
        "Green Lantern","Shazam","Justice League","Teen Titans","Supergirl",
        "Arrow","Smallville","Gotham","Titans","The Boys",
        "Daredevil","Jessica Jones","Luke Cage","Iron Fist","Punisher",
        "Watchmen","Invincible","Power Rangers","Sky High","Chronicle",
        "Kick-Ass","The Incredibles","Hancock","Brightburn","Megamind"
    };

   
    public static void getResults(){

        System.out.println("start main method");
        System.out.println();

  
        for(String movie : marvel) {
            System.out.println(movie);
        }
        System.out.println();
  

   
        for(String movie : pixar) {
            System.out.println(movie);
        }
        System.out.println();
   

   
        for(String movie : starWars) {
            System.out.println(movie);
        }
        System.out.println();
   

  
        for(String movie : animated) {
            System.out.println(movie);
        }
        System.out.println();
   

   
        for(String show : familyShows) {
            System.out.println(show);
        }
        System.out.println();
   

   
        for(String hero : superheroes) {
            System.out.println(hero);
        }
        System.out.println();
    }
	}