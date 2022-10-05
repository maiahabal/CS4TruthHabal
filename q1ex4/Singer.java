public class Singer {
    public String name;
    private int noOfPerformances = 0;
    private double totalEarnings = 0;
    public Song favoriteSong;
    public static int totalPerformances = 0;
    public double otherSingerTotalEarnings = 0;

    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.favoriteSong = favoriteSong;
    }

    public String getName(){
        return name;
    }
    
    public int getNoOfPerformances(){
        return noOfPerformances;
    }

    public double getTotalEarnings(){
        return totalEarnings;
    }

    public void performForAudience(Audience audience){
        noOfPerformances ++;
        totalPerformances++;
        totalEarnings += (audience.number * audience.payment);
        double earnings = (audience.number * audience.payment);
        System.out.printf("%s sang %s by %s for an audience of %d people and earned %.2f\n\nTotal number of Performances: %d\nTotal Earnings: %.2f\n\n", name, favoriteSong.title, favoriteSong.artist, audience.number, earnings, noOfPerformances, totalEarnings);
    }

    public void performForAudience(Audience audience, Singer singer){
        totalPerformances++;
        noOfPerformances++;
        totalEarnings += (audience.number * audience.payment)/2;
        double earnings = (audience.number * audience.payment)/2;
        otherSingerTotalEarnings += (audience.number * audience.payment)/2;
        System.out.printf("%s sang %s by %s with %s for an audience of %d people and earned %.2f each\n\nTotal number of Performances: %d\n%s's Total Earnings: %.2f\n%s's Total Earnings: %.2f\n\n", name, favoriteSong.title, favoriteSong.artist, singer.getName(), audience.number, earnings, noOfPerformances, name, totalEarnings, singer.getName(), otherSingerTotalEarnings);
    }


    public void changeFavSong(Song favoriteSong){
        System.out.printf("%s's favorite song changed from %s to ", name, this.favoriteSong.title);
        this.favoriteSong = favoriteSong;
        System.out.printf("%s\n\n", favoriteSong.title);
    }
}