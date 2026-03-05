class Netflix {

    static String platformName = "Netflix";

    static String bollywood[] = {
        "RRR","Dangal","PK","3 Idiots","Lagaan",
        "Shershaah","Andhadhun","Drishyam","War","Pathaan",
        "Kabir Singh","Bajrangi Bhaijaan","Sultan","Raazi","Article 15",
        "Gully Boy","Queen","Barfi","Chennai Express","Kick",
        "Don","Jawan","Animal","Tiger 3","Rocky Aur Rani",
        "Bhool Bhulaiyaa","Tanhaji","Padmaavat","Kesari","Krrish"
    };

    // 🔹 Hollywood Movies
    static String hollywood[] = {
        "Inception","Titanic","Avatar","The Dark Knight","Gladiator",
        "Interstellar","Joker","The Avengers","Frozen","The Lion King",
        "Spider-Man","Jurassic Park","Harry Potter","Batman Begins","Thor",
        "Iron Man","Captain America","Deadpool","Black Panther","Doctor Strange",
        "Aquaman","Wonder Woman","Transformers","Fast & Furious","The Matrix",
        "Gravity","La La Land","Up","Coco","The Notebook"
    };

    static String kdrama[] = {
        "Squid Game","Crash Landing on You","Vincenzo","Goblin","Descendants of the Sun",
        "Itaewon Class","All of Us Are Dead","Kingdom","My Name","Start-Up",
        "Business Proposal","Hometown Cha","The Glory","Sweet Home","Extraordinary Attorney Woo",
        "The Heirs","Boys Over Flowers","Signal","Hotel Del Luna","Moon Lovers",
        "Penthouse","True Beauty","Doctor Stranger","W","Healer",
        "Memories of Alhambra","Flower of Evil","Mouse","Sky Castle","Reply 1988"
    };

    static String webSeries[] = {
        "Stranger Things","Money Heist","Wednesday","Dark","Lucifer",
        "The Witcher","Narcos","Bridgerton","Ozark","Peaky Blinders",
        "You","The Crown","Friends","Breaking Bad","Better Call Saul",
        "13 Reasons Why","House of Cards","The Umbrella Academy","The Boys","The Office",
        "Game of Thrones","Sherlock","Manifest","Outer Banks","The Sandman",
        "Elite","Sex Education","The 100","Lost","Prison Break"
    };

    
    static String documentaries[] = {
        "Our Planet","The Social Dilemma","Inside Bill's Brain","Tiger King","Making a Murderer",
        "Night on Earth","David Attenborough Life","The Last Dance","Planet Earth","Blackfish",
        "The Game Changers","Minimalism","Icarus","Seaspiracy","Cowspiracy",
        "Dirty Money","Explained","American Factory","Rotten","Formula 1",
        "Wild Wild Country","The Staircase","FYRE","The Tinder Swindler","Becoming",
        "My Octopus Teacher","Cheer","Human The World","Night Stalker","Hitler Circle"
    };

  
    static String realityShows[] = {
        "Too Hot To Handle","Indian Matchmaking","Bigg Boss","MasterChef","Roadies",
        "Splitsvilla","The Circle","Glow Up","Nailed It","Love is Blind",
        "Shark Tank","Dance Plus","India's Got Talent","American Idol","The Voice",
        "Survivor","The Bachelor","Top Chef","Project Runway","Kitchen Nightmares",
        "Fear Factor","KBC","Super Singer","Dance India Dance","MTV Hustle",
        "Comedy Nights","Kapil Sharma Show","Indian Idol","Bigg Boss OTT","Super Dancer"
    };

    public static void main(String[] args) {

        System.out.println("Platform: " + platformName);
        System.out.println();

        displayBollywood();
        displayHollywood();
        displayKdrama();
        displayWebSeries();
        displayDocumentaries();
        displayRealityShows();
    }


    static void displayBollywood() {
        System.out.println("Bollywood Movies:");
        for(String movie : bollywood) {
            System.out.println(movie);
        }
        System.out.println();
    }

    static void displayHollywood() {
        System.out.println("Hollywood Movies:");
        for(String movie : hollywood) {
            System.out.println(movie);
        }
        System.out.println();
    }

    static void displayKdrama() {
        System.out.println("K-Drama Series:");
        for(String series : kdrama) {
            System.out.println(series);
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

    static void displayDocumentaries() {
        System.out.println("Documentaries:");
        for(String doc : documentaries) {
            System.out.println(doc);
        }
        System.out.println();
    }

    static void displayRealityShows() {
        System.out.println("Reality Shows:");
        for(String show : realityShows) {
            System.out.println(show);
        }
        System.out.println();
    }
}