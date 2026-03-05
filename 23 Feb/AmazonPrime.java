class AmazonPrime {


    static String platformName = "Amazon Prime";

    
    static String hindiMovies[] = {
        "Shershaah","Jai Bhim","Sardar Udham","Toofaan","Coolie No.1",
        "Raazi","Tumbbad","Gehraiyaan","Bhediya","Sherni",
        "Runway 34","Ram Setu","Article 15","Kabir Singh","Mission Mangal",
        "Airlift","Gold","Thappad","Batla House","Chhichhore",
        "Kesari","Badhaai Ho","Dream Girl","Pati Patni Aur Woh","Ludo",
        "Malang","October","Kapoor & Sons","Highway","Udta Punjab"
    };

   
    static String englishMovies[] = {
        "The Tomorrow War","No Time To Die","A Quiet Place","Top Gun","Mission Impossible",
        "The Batman","Creed","Dune","The Godfather","Rocky",
        "Gladiator","The Wolf of Wall Street","Titanic","Avatar","Jumanji",
        "The Equalizer","John Wick","The Hunger Games","Edge of Tomorrow","Mad Max",
        "Tenet","The Conjuring","The Nun","It","The Exorcist",
        "Saw","Annabelle","Interstellar","Inception","Matrix Reloaded"
    };

  
    static String webSeries[] = {
        "The Boys","Mirzapur","Panchayat","The Family Man","Reacher",
        "Jack Ryan","Upload","Good Omens","Farzi","Made in Heaven",
        "Four More Shots","Breathe","Inside Edge","Citadel","Gen V",
        "Hunters","The Marvelous Mrs. Maisel","Carnival Row","Bosch","Invincible",
        "Vikings","Hanna","The Expanse","Clarkson's Farm","Modern Love",
        "The Wheel of Time","Homecoming","Fleabag","Goliath","Undone"
    };

   
    static String kidsZone[] = {
        "Chhota Bheem","Motu Patlu","Peppa Pig","Doraemon","Shinchan",
        "Ben 10","Tom and Jerry","Pokemon","Power Rangers","Kung Fu Panda",
        "Minions","Frozen","Cars","Toy Story","Finding Nemo",
        "Moana","Encanto","Coco","Inside Out","Lion King",
        "Aladdin","Beauty and the Beast","Tangled","Despicable Me","Ice Age",
        "Hotel Transylvania","Paddington","Boss Baby","Madagascar","Kung Fu Panda 2"
    };

    
    static String thrillerShows[] = {
        "The Silence","Gone Girl","Prisoners","Se7en","The Girl with the Dragon Tattoo",
        "Shutter Island","Zodiac","The Departed","Nightcrawler","The Prestige",
        "Enemy","Fractured","The Invisible Man","The Call","Searching",
        "The Guilty","Run","The Platform","Bird Box","Old",
        "The Mist","The Ring","Orphan","Split","Glass",
        "The Sixth Sense","The Visit","Red Notice","Extraction","Nobody"
    };

    
    static String awardWinners[] = {
        "Parasite","Nomadland","Green Book","The Shape of Water","Moonlight",
        "12 Years a Slave","The King's Speech","Argo","Slumdog Millionaire","The Artist",
        "Spotlight","La La Land","Birdman","Chicago","Braveheart",
        "Gladiator","Titanic","Forrest Gump","Schindler's List","The Godfather",
        "Rocky","Million Dollar Baby","No Country for Old Men","The Hurt Locker","Ben-Hur",
        "Gandhi","The Pianist","A Beautiful Mind","The Revenant","Oppenheimer"
    };

    
    public static void main(String[] args) {

        System.out.println("Platform: " + platformName);
        System.out.println();

        displayHindiMovies();
        displayEnglishMovies();
        displayWebSeries();
        displayKidsZone();
        displayThrillerShows();
        displayAwardWinners();
    }

    

    static void displayHindiMovies() {
        System.out.println("Hindi Movies:");
        for(String movie : hindiMovies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    static void displayEnglishMovies() {
        System.out.println("English Movies:");
        for(String movie : englishMovies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    static void displayWebSeries() {
        System.out.println("Web Series:");
        for(String series : webSeries) {
            System.out.println(series);
        }
        System.out.println();
    }

    static void displayKidsZone() {
        System.out.println("Kids Zone:");
        for(String kids : kidsZone) {
            System.out.println(kids);
        }
        System.out.println();
    }

    static void displayThrillerShows() {
        System.out.println("Thriller Shows:");
        for(String thriller : thrillerShows) {
            System.out.println(thriller);
        }
        System.out.println();
    }

    static void displayAwardWinners() {
        System.out.println("Award Winners:");
        for(String award : awardWinners) {
            System.out.println(award);
        }
        System.out.println();
    }
}