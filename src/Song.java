/******************
 * Song.java
 *Lorenzo Mondragon
 *
 * This class implements a song.
 */


public class Song
{
    private String title;
    private String artist;
    private String genre;
    private int time;
    //hi
    //Sup!

    //***********************

    public Song(String title, String artist, String genre, int time)
    {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.time = time;
    }

    //************************

    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getTime()
    {
        return time;
    }

}// End Song class

