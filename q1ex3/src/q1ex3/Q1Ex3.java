public class Q1Ex3 {
    
    public static void main(String[]args) {
        Song odoriko = new Song("Odoriko", "Vaundy", "Alternative/Indie");
        Song dbs = new Song("Don't be sad", "Ku One Chan", "R&B");
        Song grace = new Song("Grace", "ADOY", "Alternative/Indie");

        Singer singer = new Singer("Seulgi", odoriko);

        Audience audience1 = new Audience(12,100);
        Audience audience2 = new Audience(5,300);
        Audience audience3 = new Audience(25,200);

        singer.performForAudience(audience1);
        singer.changeFavSong(dbs);
        singer.performForAudience(audience2);
        singer.changeFavSong(grace);
        singer.performForAudience(audience3);
    }
}
