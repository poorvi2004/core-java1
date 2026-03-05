class Spotify {

    static String spotifyCategories[] = {
        "Romantic Songs",
        "Workout Beats",
        "Chill Vibes",
        "Party Hits",
        "Sad Songs",
        "Love Duets",
        "Top 50 Global",
        "Top 50 India",
        "Old Classics",
        "90s Hits",
        "Latest Releases",
        "Lo-fi Study",
        "Focus Music",
        "Travel Songs",
        "Morning Motivation",
        "Devotional Songs",
        "Instrumental Music",
        "Hip Hop Hits",
        "EDM Party",
        "Rock Anthems",
        "Pop Favorites",
        "Punjabi Hits",
        "Tamil Trending",
        "Telugu Trending",
        "Kannada Hits",
        "Malayalam Melodies",
        "Bollywood Blockbusters",
        "Indie Artists",
        "Sleep Sounds",
        "Rainy Day Mood"
    };

    public static void getSpotifyCategories() {
        System.out.println("start get spotify categories");
        for (String category : spotifyCategories) {
            System.out.println(category);
        }
        System.out.println("end of the data");
    }
}

