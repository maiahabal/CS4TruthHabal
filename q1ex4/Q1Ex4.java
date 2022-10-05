public class Q1Ex4 {
    
    public static void main(String[]args) {
        Song odoriko = new Song("Odoriko", "Vaundy", "Alternative/Indie");
        Song dbs = new Song("Don't be sad", "Ku One Chan", "R&B");
        Song grace = new Song("Grace", "ADOY", "Alternative/Indie");
        Song bb = new Song("Bad Boy", "Red Velvet", "KPop");

        Singer singer = new Singer("Marceline", odoriko);
        Singer othersinger = new Singer("Princess Bubblegum", dbs);


        Audience audience1 = new Audience(12,100);
        Audience audience2 = new Audience(5,100);
        Audience audience3 = new Audience(25,100);
        Audience audience4 = new Audience(3,100);

        singer.performForAudience(audience1);
        singer.changeFavSong(dbs);
        singer.performForAudience(audience2, othersinger);
        singer.changeFavSong(grace);
        singer.performForAudience(audience3, othersinger);
        singer.changeFavSong(bb);
        singer.performForAudience(audience4, othersinger);
    }
}
