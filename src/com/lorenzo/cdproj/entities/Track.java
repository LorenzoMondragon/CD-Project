package com.lorenzo.cdproj.entities;

/**
 * com.lorenzo.cdproj.entities.Track.java
 * Lorenzo Mondragon
 *
 * <p>
 * This class implements a song.
 */


public class Track {

  private String title;
  private String artist;
  private String genre;
  private int time;

  public Track(String title, String artist, String genre, int time) {
    this.title = title;
    this.artist = artist;
    this.genre = genre;
    this.time = time;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getGenre() {
    return genre;
  }

  public int getTime() {
    return time;
  }

}// End com.lorenzo.cdproj.entities.Track class

