class Hotstar {

    static String platformName = "Hotstar";

    static String sports[] = {
        "IPL 2023","IPL 2024","ICC World Cup 2019","ICC World Cup 2023","T20 World Cup",
        "Asia Cup","Champions Trophy","India vs Australia","India vs Pakistan","Pro Kabaddi",
        "ISL","Wimbledon","US Open","French Open","Australian Open",
        "Formula 1","Premier League","La Liga","Serie A","NBA Finals",
        "SA20","Big Bash League","Ranji Trophy","Vijay Hazare Trophy","Syed Mushtaq Ali",
        "Ashes Series","Border Gavaskar Trophy","Carabao Cup","FA Cup","Durand Cup"
    };

    static String hindiSerials[] = {
        "Anupama","Yeh Rishta Kya Kehlata Hai","Ghum Hai Kisikey Pyaar Meiin","Imlie","Saath Nibhaana Saathiya",
        "Diya Aur Baati","Kasautii Zindagii Kay","Kahaani Ghar Ghar Kii","Kyunki Saas Bhi Kabhi Bahu Thi","Naagin",
        "Pandya Store","Teri Meri Doriyaan","Mehndi Hai Rachne Wali","Nazar","Kundali Bhagya",
        "Udaariyaan","Parineetii","Yeh Hai Mohabbatein","Ishqbaaz","Beyhadh",
        "Naamkarann","Balika Vadhu","Mahabharat","Ramayan","Radha Krishna",
        "Shakti","Thodi Si Zameen","Mann Kee Awaaz","Ek Veer Ki Ardaas","Sasural Simar Ka"
    };

    static String crimeShows[] = {
        "Criminal Justice","Special Ops","Aarya","The Night Manager","Hostages",
        "City of Dreams","Rudra","Asur","Sacred Games","Mirzapur",
        "Delhi Crime","Paatal Lok","The Family Man","Farzi","Breathe",
        "Kaun Pravin Tambe","Talvar","Drishyam","Andhadhun","Section 375",
        "Article 15","Hit","The Raid","Sherlock","True Detective",
        "Breaking Bad","Narcos","Ozark","Money Heist","The Wire"
    };

    static String mythology[] = {
        "Mahabharat","Ramayan","Devon Ke Dev Mahadev","Radha Krishna","Siya Ke Ram",
        "Vishnu Puran","Shiv Puran","Jai Hanuman","Mahakali","Karn Sangini",
        "Porus","Chandragupta Maurya","Ashoka","Bharat Ka Veer Putra","Jodha Akbar",
        "Vikram Betal","Aladdin","Hatim","Kaal Bhairav","Tenali Rama",
        "Shani","Sankat Mochan","Jag Janani Maa","Kashi Vishwanath","Durga",
        "Lakshmi","Ganesh","Krishna","Hanuman Returns","Mahadev"
    };

    static String realityTV[] = {
        "Bigg Boss","Dance India Dance","Indian Idol","MasterChef India","India's Got Talent",
        "Super Dancer","Dance Plus","The Voice India","Roadies","Splitsvilla",
        "Shark Tank India","Kaun Banega Crorepati","Sa Re Ga Ma Pa","MTV Hustle","The Kapil Sharma Show",
        "Comedy Nights","Fear Factor","Love School","Ace of Space","India's Best Dancer",
        "Super Singer","Cook With Comali","BB Jodigal","Dance Champions","India's Next Top Model",
        "Smart Jodi","Rising Star","High Fever","Dil Hai Hindustani","Superstar Singer"
    };

    static String drama[] = {
        "Aarya","Special Ops","Criminal Justice","The Night Manager","City of Dreams",
        "Hostages","Rudra","Empire","Human","Out of Love",
        "Grahan","1962 The War","Hundred","Cartel","Hotstar Specials",
        "The Office","Mayans","Grey's Anatomy","Modern Family","This Is Us",
        "How I Met Your Mother","Prison Break","Lost","24","The Walking Dead",
        "Game of Thrones","The Last of Us","Chernobyl","Westworld","The Sopranos"
    };

   
    public static void getFilmShows() {

        System.out.println("main started");
        System.out.println();

        System.out.println("Sports:");
        for(String s : sports){
            System.out.println(s);
        }
        System.out.println();
    
        System.out.println("Hindi Serials:");
        for(String h : hindiSerials){
            System.out.println(h);
        }
        System.out.println();
    

  
        System.out.println("Crime Shows:");
        for(String c : crimeShows){
            System.out.println(c);
        }
        System.out.println();
    

        System.out.println("Mythology:");
        for(String m : mythology){
            System.out.println(m);
        }
        System.out.println();
    

        System.out.println("Reality TV:");
        for(String r : realityTV){
            System.out.println(r);
        }
        System.out.println();
    
        System.out.println("Drama:");
        for(String d : drama){
            System.out.println(d);
        }
        System.out.println();
		System.out.println("main ended");
    }
}