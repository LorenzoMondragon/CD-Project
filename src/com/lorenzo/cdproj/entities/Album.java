package com.lorenzo.cdproj.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * This class {@link Album} implements the {@link TrackStorage}
 * interface that allows depending classes to implicitly call
 * methods such as {@link TrackStorage#getArtists()},
 * {@link TrackStorage#getGenres()}, {@link TrackStorage#getTracks()},
 * and {@link TrackStorage#addTrack(Track)}.
 */
public class Album implements TrackStorage {

  private List<Track> tracks;
  private List<String> artists;
  private List<String> genres;

  private String title;

  public Album(String title) {
    this.title = title;
    tracks = new ArrayList<>();
    artists = new ArrayList<>();
    genres = new ArrayList<>();
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public List<String> getArtists() {
    return artists;
  }

  @Override
  public List<String> getGenres() {
    return genres;
  }

  @Override
  public List<Track> getTracks() {
    return tracks;
  }
}
