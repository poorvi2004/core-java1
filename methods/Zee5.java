class Zee5 {

    static String platformName = "Zee5";

    static String regionalMovies[] = {
        "Sairat","Fandry","Natsamrat","Baahubali","KGF",
        "Pushpa","Kantara","Premam","Drishyam","Lucifer",
        "Vikram","Master","RRR","Jailer","Leo",
        "Asuran","Jersey","96","Minnal Murali","Kumbalangi Nights",
        "Thuppakki","Arjun Reddy","Ala Vaikunthapurramuloo","Eega","Magadheera",
        "Rangasthalam","Pokiri","Ghilli","Viswasam","Valimai"
    };

    static String originals[] = {
        "Abhay","Rangbaaz","Kaafir","Sunflower","Code M",
        "State of Siege","The Broken News","Duranga","Jeet Ki Zid","Qubool Hai 2.0",
        "Poison","Bhaukaal","Lalbazaar","Fittrat","Karenjit Kaur",
        "Jamai 2.0","Bicchoo Ka Khel","Mum Bhai","Naxalbari","Never Kiss Your Best Friend",
        "Barot House","The Chargesheet","Hisaab Barabar","Kaun Banegi Shikharwati","Pitchers",
        "Apharan","Undekhi","JL50","Asur","Hello Mini"
    };

    static String romanticShows[] = {
        "Qubool Hai","Kumkum Bhagya","Kundali Bhagya","Pavitra Rishta","Yeh Teri Galiyan",
        "Ishq Subhan Allah","Tujhse Hai Raabta","Zindagi Ki Mehek","Jamai Raja","Dil Dhoondta Hai",
        "Kasamh Se","Jodha Akbar","Ek Tha Raja","Punar Vivah","Astitva",
        "Kahiin To Hoga","Pyaar Ka Pehla Naam","Satrangi Sasural","Aap Ke Aa Jane Se","Guddan Tumse Na Ho Payega",
        "Brahmarakshas","Zindagi Ki Mahak","Qurbaan Hua","Rishton Ka Manjha","Meet",
        "Main Hoon Aparajita","Radhamma Kuthuru","Karthika Deepam","Prema Entha Madhuram","Hitler Gari Pellam"
    };

    static String suspense[] = {
        "Drishyam","Talvar","Andhadhun","Kahaani","Badla",
        "Ittefaq","The Girl on the Train","Gone Girl","Shutter Island","The Sixth Sense",
        "Zodiac","Prisoners","The Others","The Invisible Guest","Knives Out",
        "The Prestige","Get Out","Us","Split","Glass",
        "A Wednesday","Special 26","Raazi","Baby","Naam Shabana",
        "Hit","Ratsasan","Agent Sai Srinivasa","Anjaam Pathiraa","Game Over"
    };

    static String biographies[] = {
        "MS Dhoni","Sanju","The Dirty Picture","Bhaag Milkha Bhaag","Mary Kom",
        "Neerja","Sardar Udham","Rocketry","The Social Network","Bohemian Rhapsody",
        "Oppenheimer","The Theory of Everything","Gandhi","The Imitation Game","Lincoln",
        "The Pianist","A Beautiful Mind","The Iron Lady","The Founder","Catch Me If You Can",
        "Dangal","Soorma","Shabaash Mithu","Gunjan Saxena","Super 30",
        "83","Manikarnika","Kesari","Jersey","Chak De India"
    };

    static String classicMovies[] = {
        "Sholay","Mughal E Azam","Mother India","Pakeezah","Guide",
        "Deewar","Amar Akbar Anthony","Don","Chupke Chupke","Golmaal",
        "Anand","Aradhana","Karz","Mr India","Masoom",
        "Qayamat Se Qayamat Tak","Dilwale Dulhania Le Jayenge","Hum Aapke Hain Koun","Kuch Kuch Hota Hai","Border",
        "Gadar","Lagaan","Devdas","Kabhi Khushi Kabhie Gham","Swades",
        "Veer Zaara","Rang De Basanti","Kal Ho Naa Ho","3 Idiots","Dil Chahta Hai"
    };

    public static void getserials() {

        System.out.println("main method started");
        System.out.println();

   
        System.out.println("Regional Movies:");
        for(String movie : regionalMovies){
            System.out.println(movie);
        }
        System.out.println();
   
        System.out.println("Originals:");
        for(String show : originals){
            System.out.println(show);
        }
    
        System.out.println("Romantic Shows:");
        for(String show : romanticShows){
            System.out.println(show);
        }
        System.out.println();
    
        System.out.println("Suspense:");
        for(String movie : suspense){
            System.out.println(movie);
        }
        System.out.println();
   
        System.out.println("Biographies:");
        for(String bio : biographies){
            System.out.println(bio);
        }
        System.out.println();
    
        System.out.println("Classic Movies:");
        for(String movie : classicMovies){
            System.out.println(movie);
        }
        System.out.println();
    }
}